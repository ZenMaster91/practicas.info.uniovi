package laboratory04.algorithms;

public class Algorithms {
	
	protected final static int ERROR = -1;
	
	/**
	 * Search method. Given an array of objects and an object if the object is in the array
	 * the method will return the position of the element. -1 Otherwise.
	 * 
	 * @param array were we'r looking for our element.
	 * @param obj the element we'r looking for
	 * @return the position of the element inside the array, -1 otherwise.
	 */
	public static int search(Object[] array, Object obj)
	{
		for(int i=0; i<array.length; i++) {
			if(array[i].equals(obj))
				return i;
		} return -1;
	}

}
