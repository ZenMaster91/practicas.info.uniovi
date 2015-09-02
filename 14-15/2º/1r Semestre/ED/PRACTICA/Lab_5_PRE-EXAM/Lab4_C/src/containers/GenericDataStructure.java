/*
 * Class GenericDataStructure v 0.1
 * Guillermo_Facundo_Colunga
 * UO236856
*/
package containers;

import java.util.LinkedList;

public class GenericDataStructure<T extends Comparable<T>>{
	private LinkedList<T> collection = new LinkedList<T>();
	
	/*
	 * Adds a new T object to the collection.
	 * 
	 * @param a T object that will be added to the collection.
	 */
	public void add(T string) {
		collection.add(string);
	}
	
	/*
	 * toString method, returns the collection in an string
	 * 
	 * @return the collection in one String.
	 */
	public String toString() {
		return collection.toString();
	}
	
	/*
	 * Compare two elements and returns 0 if they are equals, -1 if the first is greater that the second one and 1 otherwise.
	 * @return 0 if they are equals, -1 if the first is greater that the second one and 1 otherwise.
	 */
	public int compareTwoElements(int firstPos, int secondPos) {
		return collection.get(firstPos).compareTo(collection.get(secondPos));
	}

}
