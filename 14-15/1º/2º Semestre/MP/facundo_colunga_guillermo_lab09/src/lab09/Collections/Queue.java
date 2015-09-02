package lab09.Collections;

public interface Queue 
{
	/**
	 * Adds an object to the rear (end) of the queue.
	 * @param element the element to be added
	 */
	public void enqueue(Object element);

	/**
	 * Returns the object at the front (beginning) of the queue without removing it.
	 * @return the element at the front (beginning) of the queue
	 */
	public Object peek();

	/**
	 * Removes and returns an object from the front (beginning) of the queue.
	 * @return the element removed
	 */
	public Object dequeue();

	/**
	 * Returns the number of elements in the queue.
	 * @return the number of elements in the queue
	 */
	public int size();

	/**
	 * Returns whether the queue is empty or not.
	 * @return true if the queue is empty; false otherwise.
	 */
	public boolean isEmpty();

	/**
	 * Default toString method.
	 * @return String.
	 */
	
	public String toString();
}
