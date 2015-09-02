/*
 * Class Container v 0.1
 * Guillermo_Facundo_Colunga
 * UO236856
*/
package containers;

public class Container<T> {

	private T element;

	/**
	 * Constructor that creates the container with an element.
	 * 
	 * @param element
	 */
	public Container(T element) {
		setElement(element);
	}

	/**
	 * Sets the value for the element contained in the object
	 * 
	 * @param element to be set in the container.
	 */
	public void setElement(T element) {
		this.element = element;
	}

	/**
	 * Gets the value of the element contained in the object
	 * 
	 * @return element contained in the object.
	 */
	public T getElement() {
		return element;
	}

	/**
	 * Returns a string describing the content of the container
	 * 
	 * @return String with the content of the container.
	 */
	public String toString() {
		return element.toString();
	}
}
