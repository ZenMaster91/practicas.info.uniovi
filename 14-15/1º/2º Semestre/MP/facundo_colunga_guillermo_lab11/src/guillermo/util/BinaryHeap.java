package guillermo.util;

import java.util.ArrayList;
import java.util.Collections;

public class BinaryHeap<T extends Comparable <T>> {
	
	private ArrayList<T> heap;
	
	/**
	 * Second main constructor. It gets an Array of objects as a parameter and creates a BinaryHeap with it.
	 * @param e. The Array of elements that will be the BinaryHeap.
	 */
	//Change the method as adding the methods to the arrayList and filterDown().
	public BinaryHeap( T[] e )
	{
		heap = new ArrayList<T>();
		if (e.length != 0 )
		{
			for (T element : e)
			{
				add(element);
			}
		}
	}
	
	/**
	 * Main constructor. Inizialices the heap as an ArrayList.
	 */
	public BinaryHeap()
	{
		heap = new ArrayList<T>();
	}
	
	/**
	 * Returns true if the heap is empty. False otherwhise.
	 * @return
	 */
	public boolean isEmpty()
	{
		return heap.isEmpty();
	}
	
	/**
	 * Prints the content of the toString() method by screen.
	 */
	public void print()
	{
		System.out.println(heap.toString());
	}
	
	/**
	 * toString method.
	 * 
	 * @return an String with the content of the heap
	 */
	public String toString()
	{
		return heap.toString();
	}
	
	//IMPORTANT METHODS.
	
	/**
	 * Filters up the tree. And shorted by the value of the content.
	 * @param pos were we start to filter up.
	 */
	private void filterUp(int pos)
	{
		while (pos != 0) {
			int parent = (pos-1)/2;
			if(heap.get(pos).compareTo(heap.get(parent)) < 0) {
				Collections.swap(heap, pos, parent);
				pos--;
			} else { pos--; }
		}
	}
	
	/**
	 * Add method. It adds the object at the end of the ArrayList and the filter ups.
	 * 
	 * @param element that will be added.
	 */
	public void add(T element)
	{
		heap.add(element);
		filterUp((heap.size()-1));
	}
	
	/**
	 * Filters down the tree. And shorted by the value of the content.
	 * Applies descending filtering to the node referred by a given position in the ArrayList.
	 * While (pos do not become a leaf) 	
	 * 	1.Select which of the children of pos is the smallest.
	 *	2.If value of pos > value of that child swap the values
	 *
	 * @param pos were we start to filter down.
	 */
	private void filterDown(int pos)
	{
		int childPos;

		while (pos < heap.size() / 2) {
			if (2 * pos + 1 >= heap.size()) 
				break;
			else if (2 * pos + 2 >= heap.size())
				childPos = 2* pos + 1;
			else if (heap.get(2 * pos + 1).compareTo(heap.get(2 * pos + 2)) > 0) {
				childPos = 2 * pos + 2;
			} else {
				childPos = 2 * pos + 1;
			}

			if (heap.get(pos).compareTo(heap.get(childPos)) > 0) {
				Collections.swap(heap, pos, childPos);
				pos = childPos;
			} else
				break;
		}
	}
	
	/**
	 * Returns the highest priority node and filter downs the rest of the tree.
	 * 
	 * @return ..
	 */
	public T getMin()
	{
		T aux = heap.get(0);
		T lastNode = heap.remove((heap.size()-1));
		if(!isEmpty())
		{
			heap.set(0, lastNode);
			filterDown(0);
		}
		return aux;
	}
}
