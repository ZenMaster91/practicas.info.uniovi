package Lab_3;

public class Container <T> {
	
	private T element;
	
	public Container(T element)
	{
		setElement(element);
	}
	
	public void setElement(T element)
	{
		this.element=element;
	}
	
	public T getElement()
	{
		return element;
	}

	@Override
	public String toString() {
		return "Container [element=" + element + "]";
	}
	

}
