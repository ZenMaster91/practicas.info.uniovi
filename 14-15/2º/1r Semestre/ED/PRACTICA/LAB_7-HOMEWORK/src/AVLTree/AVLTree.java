/**
 * 05.11.14 02.33
 * Guillermo_Facundo_Colunga
 * UO236856
 */
package AVLTree;

public class AVLTree <T extends Comparable<T>>
{
	private AVLNode<T> root;
	
	/**
	 * Main Constructor.
	 */
	public AVLTree()
	{
		setRoot(null);
	}
	
	/**
	 * 
	 * @return
	 */
	public AVLNode<T> getRoot()
	{
		return root;
	}
	
	/**
	 * 
	 * @param root
	 */
	public void setRoot(AVLNode<T> root)
	{
		this.root = root;
	}
	
	/**
	 * 
	 * @param element
	 * @throws Exception
	 */
	public void add (T element) throws Exception
	{
		setRoot(add(root, element));
	}
	
	/**
	 * 
	 * @param root
	 * @param element
	 * @return
	 * @throws Exception
	 */
	private AVLNode<T> add(AVLNode<T> root, T element) throws Exception
	{
		if (element == null) {
			throw new IllegalArgumentException("The element you want to add was null.");
		} else if (root == null) {
			return new AVLNode<T>(element);
		} else if (root.getElement().equals(element)) {
			throw new IllegalArgumentException("No repeated elements are allowed inside a tree.");
		} else if (element.compareTo(root.getElement()) < 0) {
			root.setLeft(add(root.getLeft(), element));
		} else {
			root.setRight(add(root.getRight(), element));
		} root.updateHeight(); root.updateBF();
		return root;
	}
	
	/**
	 * Public toString method.
	 * 
	 * @return toString private and recursive method
	 */
	public String toString()
	{
		return toString(root);
	}
	
	/**
	 * toString private recursive method.
	 * 
	 * @param root
	 * @return null if root = null. Otherwise: "root+left+right".
	 */
	private String toString(AVLNode<T> root)
	{
		String str = "";
		if (root == null)
			str += "-";
		else {
			str += root.toString();
			str += toString(root.getLeft()) + toString(root.getRight());
		}
		return str;
		/*
		if( getRoot() == null ) { 
			return "-";
		} else {
			return (root.toString() + toString(root.getLeft()) + toString(root.getRight()));
		}*/
	}
	
	/**
	 * Search method. Given a T element it returns true if the element is in the tree.
	 * 
	 * @param T element, the element you want to look for in the tree.
	 * @return true if the element is in the tree, false otherwise.
	 */
	public boolean search (T element)
	{
		return search(element, getRoot());
	}
	
	/**
	 * Search private and reflexive method. Given a T element and a root it checks if the 
	 * T element is in the tree.
	 * 
	 * @param T element, the element you want to look for in the tree.
	 * @param root, where you are looking for the element.
	 * @return true if the element is in the tree, false otherwise.
	 */
	private boolean search (T element, AVLNode<T> root)
	{
		if (root == null || element == null) {
			return false;
		} else if (root.getElement().equals(element)) {
			return true;
		} else if (element.compareTo(root.getElement()) < 0) {
			return search(element, root.getLeft());
		} else if (element.compareTo(root.getElement()) > 0) {
			return search(element, root.getRight());
		} return false;
	}
	
	/**
	 * Search and Return method. If the element is in the tree then it
	 * search for the element in the tree and returns it.
	 * 
	 * @param element
	 * @return
	 */
	public T searchReturn (T element)
	{
		if (search(element)) {
			return searchReturn(element, getRoot());
		} else { return null; }
	}
	
	/**
	 * Search and return private and reflexive method. Given a T element and a root it returns
	 * the element.
	 * 
	 * @param T element, the element you want to look for in the tree.
	 * @param root, where you are looking for the element.
	 * @return The element you are loking for.
	 */
	private T searchReturn (T element, AVLNode<T> root)
	{
		if (root.getElement().equals(element)) {
			return root.getElement();
		} else if (element.compareTo(root.getElement()) < 0) {
			return searchReturn(element, root.getLeft());
		} else {
			return searchReturn(element, root.getRight());
		}
	}
	
	/**
	 * Get the maximun value in the tree
	 * @return the maximun value in the tree.
	 */
	public T getMax()
	{
		return getMax(getRoot());
	}
	
	/**
	 * Private and reflexive getMax Method, gets the maximun value in the tree
	 * 
	 * @param root
	 * @return the maximun value of the tree
	 */
	private T getMax(AVLNode<T> root)
	{
		if (root.getRight() != null ){
			return getMax(root.getRight());
		} else { return root.getElement(); }
	}
	
	/**
	 * Gets and returns the maximum NODE in the tree.
	 * 
	 * @return The Maximum Node in the tree.
	 */
	public AVLNode<T> getMaxNode()
	{
		return getMaxNode(getRoot());
	}
	
	/**
	 * Private and reflexive getMaxNode Method, gets the maximun NODE in the tree
	 * 
	 * @param root
	 * @return The Maximun Node in the tree.
	 */
	private AVLNode<T> getMaxNode(AVLNode<T> root)
	{
		if (root.getRight() != null ){
			return getMaxNode(root.getRight());
		} else { return root; }
	}
	
	/**
	 * Public and not reflexive remove method. Given an element as a paramenter it removes it from the tree.
	 * @param element, the element to be deleted
	 * @throws Exception if you try to delete a null, empty or non existent node.
	 */
	public void remove(T element) throws Exception
	{
		if(search(element)) {
			root = remove(element, getRoot());
		} else {
			throw new IllegalArgumentException("The element you want to remove is not in the tree.");
		}
	}
	
	/**
	 * Private and reflexive remove method. Given an element as a paramenter and a root it removes the element from the tree.
	 * @param element, the element to be deleted
	 * @param root where you start to look for the node
	 * @return the deleted node.
	 * @throws Exception if you try to delete a null, empty or non existent node
	 */
	private AVLNode<T> remove (T element, AVLNode<T> root) throws Exception
	{
		if (root == null /*|| element == null*/) {
			throw new IllegalArgumentException("The element you want to remove is null. Or the tree is null");
		} else if (element.compareTo(root.getElement()) < 0) {
			root.setLeft(remove(element, root.getLeft()));
		} else if (element.compareTo(root.getElement()) > 0) {
			root.setRight(remove(element, root.getRight()));
		} else {
			if (root.getLeft() == null) {
				return root.getRight();
			} else if (root.getRight() == null) {
				return root.getLeft();
			} else {
				System.out.println("The element we want to delete has two children.");
				root.setElement(getMax(root.getLeft()));
				remove(element, root.getLeft());
			}
		} 
		root.updateHeight();
		return root;
			
	}
	
	/**
	 * Joins method. Given an AVL Tree this method returns another tree wich is
	 * the join of the tree where the method is applied to and the tree given
	 * as a parameter.
	 * 
	 * @param tree, to be join.
	 * @return tree that is the result of joining the tree where the method
	 * is applied to and the tree given as a parameter.
	 */
	public AVLTree<T> joins(AVLTree<T> tree)
	{
		return joins(tree, root);
	}
	
	/**
	 * Joins  [ PRIVATE AND REFLEXIVE ]. Given an AVL Tree this method returns another tree wich is
	 * the join of the tree where the method is applied to and the tree given
	 * as a parameter. 
	 * 
	 * @param tree
	 * @param root
	 * @return
	 * @throws Exception
	 */
	private AVLTree<T> joins(AVLTree<T> tree, AVLNode<T> root)
	{
		AVLTree<T> c = new AVLTree<T>();
		
		if (root.compareTo(tree.getRoot()) == -1) {
			c.setRoot(getMaxNode(root));
			c.getRoot().setLeft(root.getLeft());
			c.getRoot().setRight(tree.getRoot());
		} else if (root.compareTo(tree.getRoot()) == 1) {
			c.setRoot(tree.getMaxNode(root));
			c.getRoot().setRight(root.getLeft());
			c.getRoot().setLeft(tree.getRoot());
		} else if (root.compareTo(tree.getRoot()) == 0) {
			c.setRoot(getMaxNode(root));
			c.getRoot().setLeft(root);
			c.getRoot().setRight(tree.getRoot());
		}
		return c;
	}
}
