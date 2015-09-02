package Lab_3;

import java.util.LinkedList;

public class GenericDataStructure <T> {

	private LinkedList<T> collection;
	
	public void add(T element)
	{
		collection.add(element);
	}
	
	public String toString ()
	{
		String aux="My collection";
		for ( T item : collection ) {
			aux+="."+item.toString();
		}
		return collection.toString();
	}
	
	public int compareTwoElements (int firstPos, int secondPos)
	{
		T first = collection.get(firstPos);
		T sec = collection.get(secondPos);
		return first.compareTo(sec);
	}
}
