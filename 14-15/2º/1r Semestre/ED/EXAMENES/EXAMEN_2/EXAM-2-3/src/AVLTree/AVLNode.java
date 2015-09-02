/**
 * 05.11.14 02.33
 * Guillermo_Facundo_Colunga
 * UO236856
 */
package AVLTree;

public class AVLNode<T extends Comparable<T>> {

	//Attributes
	private T element;
	private AVLNode<T> left;
	private AVLNode<T> right;
	private int height;

	// Constructors.
	public AVLNode(T element, AVLNode<T> left, AVLNode<T> right)
	{
		setElement(element);
		setLeft(left);
		setRight(right);
	}

	public AVLNode(T element)
	{
		this(element, null, null);
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
		updateHeight();
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
	public int getBF() {
		return calculateBF();
	}

	//METHODS.
	
	/**
	 * toStringMethod.
	 * 
	 * @return the element + the height in the following format node(height).
	 */
	public String toString()
	{
		return getElement().toString() + "(" + getBF() + ")";
	}

	/**
	 * Prins the toString method.
	 */
	public void print()
	{
		System.out.println(toString());
	}

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
	 * Updates the height of the tree from a given root or node.
	 */
	public void updateHeight()
	{
		// If the node doesn't have children, its hight is just 1
		if (getLeft() == null && getRight() == null)
			setHeight(1);

		// If it has a child on one side, its height is its child's height plus
		// one
		else if (getLeft() != null && getRight() == null)
			setHeight(1 + getLeft().getHeight());
		else if (getLeft() == null && getRight() != null)
			setHeight(1 + getRight().getHeight());

		// If it has one child on each side, its height will be the greatest of
		// its
		// childrens's height plus one
		else if (getLeft().getHeight() > getRight().getHeight())
			setHeight(1 + getLeft().getHeight());
		else
			setHeight(1 + getRight().getHeight());

	}

	/**
	 * Updates the Balance Factor and returns it as an integer.
	 * In the case that the Balance Factor finally does not match
	 * with 0, that means a Balanced tree.
	 * 
	 * @return integer that represents the balance factor
	 */
	public int calculateBF()
	{
		// If the node doesn't have children, its BF is just 0
		if (getLeft() == null && getRight() == null)
			return 0;
		// If it has a child on one side
		else if (getRight() == null)
			return -getLeft().getHeight();
		else if (getLeft() == null && getRight() != null)
			return getRight().getHeight();
		// If it has one child on each side
		else
			return (getRight().getHeight() - getLeft().getHeight());
	}
}
