/**
 * 05.11.14 02.33
 * Guillermo_Facundo_Colunga
 * UO236856
 */
package AVLTree;

import AVLTree.AVLTree;

public class AVLTree<T extends Comparable<T>> {
	
	//Attributes
		private AVLNode<T> root;

		//Constructor
		
		/**
		 * Main constructor.
		 */
		public AVLTree()
		{
			setRoot(null);
		}

		
		// GETTERS AND SETTERS
		
		/**
		 * Returns the root.
		 * @return the root as an AVLNode<T>.
		 */
		public AVLNode<T> getRoot()
		{
			return root;
		}

		/**
		 * Sets the root
		 * @param root to be set.
		 */
		private void setRoot(AVLNode<T> root)
		{
			this.root = root;
		}

		
		// ADDING & REMOVING
		
		/**
		 * Add an element to the AVL Tree.
		 * @param element
		 */
		public void add(T element)
		{
			setRoot(add(root, element));
		}
		
		/**
		 * Adds an element to a given tree.
		 * 
		 * @param root
		 * @param element
		 * @return the tree already balanced.
		 */
		private AVLNode<T> add(AVLNode<T> root, T element)
		{
			// If the root is null, the new element will become the root
			if (root == null)
				root = new AVLNode<T>(element);

			// Throw an exception if the element is already in the tree.
			else if (root.getElement().equals(element))
				throw new IllegalArgumentException(
						"No repeated elements are allowed inside a tree.");

			// If the element is smaller than the root, insert it to its left
			else if (element.compareTo(root.getElement()) < 0)
				root.setLeft(add(root.getLeft(), element));

			// but if it's greater, to its right.
			else
				root.setRight(add(root.getRight(), element));

			return updateBF(root);

		}

		/**
		 * Public and not reflexive remove method. Given an element as a paramenter it removes it from the tree.
		 * @param element, the element to be deleted
		 * @throws Exception if you try to delete a null, empty or non existent node.
		 */
		public void remove(T element)
		{
			setRoot(remove(root, element));
		}
		
		/**
		 * Private and reflexive remove method. Given an element as a paramenter and a root it removes the element from the tree.
		 * @param element, the element to be deleted
		 * @param root where you start to look for the node
		 * @return the deleted node.
		 * @throws Exception if you try to delete a null, empty or non existent node
		 */
		public AVLNode<T> remove(AVLNode<T> root, T element)
		{
			if (root == null)
				throw new IllegalArgumentException("The provided root is null.");
			else if (root.getElement().equals(element)) {
				if (root.getLeft() == null)
					return root.getRight();
				else if (root.getRight() == null)
					return root.getLeft();
				else {
					root.setElement(getMax(root.getLeft()));
					root.setLeft(remove(root.getLeft(), root.getElement()));
				}
			}

			else if (element.compareTo(root.getElement()) < 0)
				root.setLeft(remove(root.getLeft(), element));
			else
				root.setRight(remove(root.getRight(), element));

			return updateBF(root);
		}

		//Rotations
		
		/**
		 * Updates the Balance Factor of the Node.
		 * @param node
		 * @return processRotations(node)
		 */
		public AVLNode<T> updateBF(AVLNode<T> node)
		{
			node.updateHeight();
			return processRotations(node);
		}

		/**
		 * This method decides if we have to perfom a single or double and left or right rotation.
		 * @param root
		 * @return single[Left / Right]Rotation(root)
		 */
		private AVLNode<T> processRotations(AVLNode<T> root)
		{
			if (root.getBF() == -2) {
				if (root.getLeft().getBF() == -1)
					return singleLeftRotation(root);
				else
					return doubleLeftRotation(root);

			} else if (root.getBF() == 2) {
				if (root.getRight().getBF() == 1)
					return singleRightRotation(root);
				else
					return doubleRightRotation(root);
			}
			return root;
		}

		/**
		 * Performs a single left rotation to a given subtree.
		 * 
		 * @param b root of the subtree.
		 * @return Balanced subtree.
		 */
		private AVLNode<T> singleLeftRotation(AVLNode<T> root)
		{
			AVLNode<T> aux = root.getLeft();
			root.setLeft(aux.getRight());
			aux.setRight(root);
			root = aux;

			root.updateHeight();
			return root;
		}
		
		/**
		 * Performs a single right rotation to a given subtree.
		 * 
		 * @param b root of the subtree.
		 * @return Balanced subtree.
		 */
		private AVLNode<T> singleRightRotation(AVLNode<T> root)
		{
			AVLNode<T> aux = root.getRight();
			root.setRight(aux.getLeft());
			aux.setLeft(root);
			root = aux;

			root.updateHeight();
			return root;
		}

		/**
		 * Performs a double left rotation.
		 * @param root
		 * @return balanced subtree
		 */
		private AVLNode<T> doubleLeftRotation(AVLNode<T> root)
		{
			AVLNode<T> aux = root.getLeft().getRight();
			
			root.getLeft().setRight(aux.getLeft());
			aux.setLeft(root.getLeft());
			
			root.setLeft(aux.getRight());
			aux.setRight(root);
			
			root=aux;
			root.updateHeight();
			return root;
		}
		
		/**
		 * Performs a double right rotation.
		 * @param root
		 * @return balanced subtree
		 */
		private AVLNode<T> doubleRightRotation(AVLNode<T> root)
		{
			AVLNode<T> aux = root.getRight().getLeft();

			root.getRight().setLeft(aux.getRight());
			aux.setRight(root.getRight());
			
			root.setRight(aux.getLeft());
			aux.setLeft(root);
			
			root=aux;
			root.updateHeight();
			return root;
		}
		
		/**
		 * toString method.
		 * @return the toString chain.
		 */
		public String toString()
		{
			return toString(getRoot());
		}
		
		/**
		 * toString chain method.
		 * @param node to start.
		 * @return the toString chain.
		 */
		private String toString(AVLNode<T> node)
		{
			String str = "";
			if (node == null)
				str += "-";
			else {
				str += node.toString();
				str += toString(node.getLeft()) + toString(node.getRight());
			}
			return str;
		}

		/**
		 * Search method. Given a T element it returns true if the element is in the tree.
		 * 
		 * @param T element, the element you want to look for in the tree.
		 * @return true if the element is in the tree, false otherwise.
		 */
		public boolean search(T element)
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
		private boolean search(T element, AVLNode<T> root)
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
		 * Get the maximun value in the tree
		 * @return the maximun value in the tree.
		 */
		public T getMax(AVLNode<T> theRoot)
		{
			while (theRoot.getRight() != null)
				theRoot = theRoot.getRight();
			return theRoot.getElement();
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
		public AVLTree<T> join(AVLTree<T> tree)
		{
			AVLTree<T> jointTree = this;
			join(jointTree, tree);
			return jointTree;
		}
		
		/**
		 * Joins  [ PRIVATE AND REFLEXIVE ]. Given an AVL Tree this method returns another tree wich is
		 * the join of the tree where the method is applied to and the tree given
		 * as a parameter. 
		 * 
		 * NOT WORKING MARTIN WILL BRING HIS METHOD NEXT DAY.
		 * 
		 * @param tree
		 * @param root
		 * @return
		 * @throws Exception
		 */
		private void join(AVLTree<T> tree1, AVLTree<T> tree2)
		{
			AVLNode<T> treeRoot = tree2.getRoot();
			if (treeRoot != null) {
				if (!tree1.search(treeRoot.getElement())) {
					// Add tree's root
					tree1.add(treeRoot.getElement());
				}
				// Add tree from the left of the root
				AVLTree<T> treeL = new AVLTree<T>();
				treeL.setRoot(treeRoot.getLeft());
				tree1.join(tree1, treeL);

				// Add tree from the right of the root
				AVLTree<T> treeR = new AVLTree<T>();
				treeR.setRoot(treeRoot.getRight());
				tree1.join(tree1, treeR);
			}
		}

		/**
		 * This method is being created to help solve the problem of the
		 * original tree being destroyed with the method join is called
		 */
		public AVLTree<T> makeCopy()
		{
			AVLTree<T> copy = new AVLTree<T>();
			return makeCopy(copy, copy.getRoot());
		}
		/**
		 * This method is being created to help solve the problem of the
		 * original tree being destroyed with the method join is called.
		 * 
		 * @param tree
		 * @param root
		 * @return
		 */
		private AVLTree<T> makeCopy(AVLTree<T> tree, AVLNode<T> root)
		{
			if (root != null) {
				tree.add(root.getElement());
				makeCopy(tree, root.getLeft());
				makeCopy(tree, root.getRight());
			}
			return tree;
		}

		/**
		 * Get Height method. It returns the height of the tree without accessing to the node paramenters.
		 * To perform that it calls to the private and reflexive getHeight() method with the root of the tree
		 * as a paramenter.
		 * 
		 * @return the height of the tree as an integer.
		 */
		public int getHeight()
		{
			return getHeight(getRoot());
		}
		
		/**
		 * getHeight [ PRIVATE AND REFLEXIVE ]. It returns the height of the tree without accessing to the node paramenters.
		 * 
		 * @param root where you start to perform the algorithm
		 * @return the height as an integer.
		 */
		private int getHeight(AVLNode<T> root)
		{
			if (root == null) 
				return 0;
			
			if (root.getBF() <= 0) 
				return 1 + getHeight(root.getLeft());
			else 
				return 1 + getHeight(root.getRight());	
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
}
