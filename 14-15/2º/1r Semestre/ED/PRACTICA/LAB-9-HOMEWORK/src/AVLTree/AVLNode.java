/**
 * 05.11.14 02.33
 * Guillermo_Facundo_Colunga
 * UO236856
 */
package AVLTree;

public class AVLNode <T extends Comparable <T>> {

	private T element;
	private AVLNode<T> left;
	private AVLNode<T> right;
	private int height;
	private int BF;
	
	//Constructors.
	public AVLNode (T element)
	{
		setElement(element);
		setLeft(null);
		setRight(null);
		setHeight(0);
	}
	
	public AVLNode (T element, AVLNode<T> left, AVLNode<T> right)
	{
		setElement(element);
		setLeft(left);
		setRight(right);
	}
	
	
	//SETTERS AND GETTERS
	
	/**
	 * Getter. Returns the element.
	 * 
	 * @return the T element.
	 */
	public T getElement()
	{
		return element;
	}
	
	/**
	 * Setter. Sets the value for the element.
	 * 
	 * @param Element e to be set.
	 */
	public void setElement(T e)
	{
		this.element = (T) e;
	}
	
	/**
	 * Getter. Returns the left node.
	 * 
	 * @return the AVLNode<T> left node.
	 */
	public AVLNode<T> getLeft()
	{
		return left;
	}
	
	/**
	 * Setter. Sets the LeftNode.
	 * 
	 * @param e. Left node
	 */
	public void setLeft(AVLNode<T> e)
	{
		this.left = e;
	}
	
	/**
	 * Getter. Returns the right node.
	 * 
	 * @return the AVLNode<T> right node.
	 */
	public AVLNode<T> getRight()
	{
		return right;
	}
	
	/**
	 * Setter. Sets the right Node.
	 * 
	 * @param e. Right node.
	 */
	public void setRight(AVLNode<T> e)
	{
		this.right = e;
	}
	
	/**
	 * Getter. Returns the height of the tree.
	 * 
	 * @return the int height of the tree.
	 */
	public int getHeight()
	{
		return height;
	}
	
	/**
	 * Setter. Sets the height.
	 * 
	 * @param h. The height of the tree, from a given node!!
	 */
	public void setHeight(int h)
	{
		this.height = h;
	}
	
	/**
	 * Getter. Returns the Balance Factor of the tree.
	 * 
	 * @return the int Balance Factor of the tree.
	 */
	public int getBF()
	{
		return BF;
	}
	
	/**
	 * Setter. Sets the Balance Factor.
	 * 
	 * @param bf. The Balance Factor of the tree, from a given node!!
	 */
	public void setBF(int bf)
	{
		this.BF = bf;
	}
	
	//METHODS
	
	/**
	 * CompareTo method, compare two elements.
	 * 
	 * @param AVLNode<T> o, element to be compared
	 * @return -1 if the eleemnt is <, 0 if the elements are equals and 1 if >.
	 */
	public int compareTo(AVLNode<T> o)
	{	
		return element.compareTo(o.getElement());
	}
	
	/**
	 * toStringMethod.
	 * 
	 * @return the element + the height in the following format node(height).
	 */
	public String toString()
	{
		return getElement().toString() + "("+getBF()+")";
	}
	
	/**
	 * Prins the toString method.
	 */
	public void print()
	{
		System.out.println(getElement().toString());
	}
	
	/**
	 * Updates the height of the tree from a given root or node.
	 */
	public void updateHeight()
	{
		// If the node doesn't have children, its hight is just 1
		if (getLeft() == null && getRight() == null ) {
			setHeight(1);
		} else if (getLeft() != null && getRight() == null ) {
			setHeight(1+getLeft().getHeight());
		} else if (getLeft() == null && getRight() != null ) {
			setHeight(1+getRight().getHeight());
		} else if (getLeft().getHeight() > getRight().getHeight()) {
			setHeight(1+getLeft().getHeight());
		} else setHeight(1+getRight().getHeight());
	}
	
	/**
	 * Martin method for the balance factor.
	 * @return
	 */
	public int getBalanceFactor()
	{
		if (getLeft() == null && getRight() == null) {
			return 0;
		} else if (getRight()==null) {
			return (-1)*(getLeft().getHeight()+1);
		} else if (getLeft()==null) {
			return (getRight().getHeight()+1);
		} else {return (getRight().getHeight())-(getLeft().getHeight());}
		
	}
	
	/**
	 * Updates the Balance Factor and returns it as an integer.
	 * In the case that the Balance Factor finally does not match
	 * with 0, that means a Balanced tree.
	 * 
	 * @return integer that represents the balance factor
	 */
	public void updateBF()
	{
		if(getLeft() == null && getRight() == null) {
			setBF(0);
		} else if (getLeft() != null && getRight() == null) {
			setBF((-1)+getLeft().getBF());
		} else if (getLeft() == null && getRight() != null) {
			setBF(1+getRight().getBF());
		} else {
			setBF((getRight().getHeight())+(getLeft().getHeight()));
		} if (getBF() != 0){ 
			System.err.println("ALERT: This is no longuer an AVL tree!!!");
		} 
	}
	
	//PROBLEMS WHE UPDATING THE BALANCEFACTOR AT ADD AND REMOVE.
	
	/**
	 * Updates the balance factor BF, it uses the singleLeftRotation() and 
	 * singleRightRotation() methods to perform the update Balance Factor.
	 * 
	 * @param root of the subtree.
	 * @return the subtree balanced.
	 */
	public AVLNode<T> updateBFP(AVLNode<T> root) 
	{
		root.updateHeight();
		if (root.getBF() == -2) {
			if (root.getLeft().getBF() == -1) {
				root = singleLeftRotation(root);
			} else { root = doubleLeftRotation(root); }
		} else {
			if (root.getBF() == 2) {
				 if (root.getRight().getBF() == 1){
						root = singleRightRotation(root);
					} else {root = doubleRightRotation(root); }
			}
		} return root;
	}

	
	/**
	 * Performs a single left rotation to a given subtree.
	 * 
	 * @param b root of the subtree.
	 * @return Balanced subtree.
	 */
	private AVLNode<T> singleLeftRotation(AVLNode<T> b)
	{
		AVLNode<T> aux = b.getLeft();
		b.setLeft(aux.getRight());
		aux.setRight(b);
		b.updateHeight();
		return aux;
	}
	
	/**
	 * Performs a single right rotation to a given subtree
	 * 
	 * @param b root of the subtree.
	 * @return balanced subtree.
	 */
	private AVLNode<T> singleRightRotation(AVLNode<T> b)
	{
		AVLNode<T> aux = b.getRight();
		b.setRight(aux.getLeft());
		aux.setLeft(b);
		b.updateHeight();
		return aux;
	}
	
	/**
	 * Ask martin how to do it.
	 * 
	 * @param root
	 * @return
	 */
	private AVLNode<T> doubleLeftRotation(AVLNode<T> root) {
		AVLNode<T> aux = root.getLeft().getRight();
		root.getRight().setLeft(aux.getRight());
		root.setLeft(aux.getRight());
		aux.setLeft(root.getLeft());
		aux.setRight(root);
		return null;
	}
	
	/**
	 * Ask martin how to do it.
	 * 
	 * @param root
	 * @return
	 */
	private AVLNode<T> doubleRightRotation(AVLNode<T> root) {
		//
		return null;
	}

}