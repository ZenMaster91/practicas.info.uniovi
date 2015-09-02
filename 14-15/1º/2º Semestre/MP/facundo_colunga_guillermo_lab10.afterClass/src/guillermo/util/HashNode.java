package guillermo.util;

public class HashNode<T extends Comparable <T>> {
	
	public final static int EMPTY = 0;
	public final static int VALID = 1;
	public final static int DELETED = 2;
	
	private T element;
	private int status;
	
	public HashNode()
	{
		setStatus(EMPTY);
	}
	
	public void setElement(T element)
	{
		this.element = element;
	}
	
	public T getElement()
	{
		return this.element;
	}
	
	public void setStatus(int status)
	{
		this.status = status;
	}
	
	public int getStatus()
	{
		return this.status;
	}
	
	public String toString()
	{
		return (" ("+Integer.toString(getStatus())+")");
	}
}

