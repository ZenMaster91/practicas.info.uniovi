package lab09.Collections;

public interface Stack 
{	
	/**
	 * Pushes (adds) an item onto the top of the stack.
	 * @param element the object to be pushed
	 * @throws IllegalArgumentException if the given element as a parameter is null.
	 */
	public void push(Object element);
	
	/**
	 * Returns the object at the top of the stack without removing it.
	 * @return the object at the top of the stack
	 * @throws IllegalStateException if the stack is empty.
	 */
	public Object peek();
	
	/**
	 * Removes and returns the object at the top of the stack.
	 * @return the object removed from the stack.
	 * @throws IllegalStateException if the stack is empty.
	 */
	public Object pop();
	
	/**
	 * Returns the number of elements in the stack.
	 * @return the number of elements in the stack.
	 */
	public int size();
	
	/**
	 * Returns whether the stack is empty or not.
	 * @return true if the stack is empty; false otherwise.
	 */
	public boolean isEmpty();
	
	/**
	 * Default toString method.
	 * @return String.
	 */
	public String toString();
}
