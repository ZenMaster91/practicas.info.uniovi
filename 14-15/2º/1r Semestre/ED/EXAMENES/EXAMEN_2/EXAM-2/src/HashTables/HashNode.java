package HashTables;

public class HashNode<T extends Comparable <T>> {
	
	//Constants
	public final static int EMPTY = 0;
	public final static int VALID = 1;
	public final static int DELETED = 2;
	
	//Variables
	private T element;
	private int status;
	
	/**
	 * Main Constructor
	 */
	public HashNode()
	{
		setStatus(EMPTY);
	}
	
	/**
	 * Setter. Sets the element.
	 * @param element to be set.
	 */
	public void setElement(T element)
	{
		this.element = element;
	}
	
	/**
	 * Getter. Gets the element
	 * @return
	 */
	public T getElement()
	{
		return this.element;
	}
	
	/**
	 * Setter. Sets the status.
	 * @param status
	 */
	public void setStatus(int status)
	{
		this.status = status;
	}
	
	/**
	 * Getter. Gets the status.
	 * @return
	 */
	public int getStatus()
	{
		return this.status;
	}
	
	/**
	 * toString method. FORMAT: (" ("+Integer.toString(getStatus())+")")
	 */
	public String toString()
	{
		return (" ("+Integer.toString(getStatus())+")");
	}
}

