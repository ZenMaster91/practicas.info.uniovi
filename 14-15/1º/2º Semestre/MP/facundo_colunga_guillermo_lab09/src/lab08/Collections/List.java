package lab08.Collections;


/**
 * An ordered collection (also known as a <i>sequence</i>).  The user of this
 * interface has precise control over where in the list each element is
 * inserted.  The user can access elements by their integer index (position in
 * the list), and search for elements in the list.<p>
 */
public interface List extends Collection 
{	
    /**
     * Returns the number of elements in this list.
     *
     * @return the number of elements in this list
     */
    int size();
    
    /**
     * Returns {@code true} if this list contains no elements.
     *
     * @return {@code true} if this list contains no elements
     */
    boolean isEmpty();
    
	/**
	 * Appends the specified element to the end of this list.
	 *  
     * @param element element to be appended to this list
	 */
	void add(Object element);
	
    /**
     * Inserts the specified element at the specified position in this list.
     * Shifts the element currently at that position (if any) and any 
     * subsequent elements to the right (adds one to their indices).
     *
     * @param index index at which the specified element is to be inserted
     * @param element element to be inserted
     */
	void add(int index, Object element);

    /**
     * Removes the element at the specified position in this list. Shifts any
     * subsequent elements to the left (subtracts one from their indices). 
     * Returns the element that was removed from the list.
     *
     * @param index the index of the element to be removed
     * @return the element previously at the specified position
     */
	Object remove(int index);
	
    /**
     * Removes a single instance of the specified element from this list, if it
     * is present. More formally, removes an element {@code e} such that
     * {@code element == null ? e == null : element.equals(e))}, if this list
     * contains one or more such elements. Returns the element that was removed
     * from the list.
     * 
     * @param element element to be removed from this list, if present
     * @return the element previously at the specified position
     */ 
	Object remove(Object element);	
	
    /**
     * Returns the index of the first occurrence of the specified element
     * in this list, or -1 if this list does not contain the element. 
     * More formally, returns the lowest index {@code i} such that
     * {@code (element == null ? get(i) == null : element.equals(get(i)))},
     * or -1 if there is no such index.
     *
     * @param element element to search for
     * @return the index of the first occurrence of the specified element in
     *         this list, or -1 if this list does not contain the element
     */
	int indexOf(Object element);

    /**
     * Returns the element at the specified position in this list.
     *
     * @param index index of the element to return
     * @return the element at the specified position in this list
     */
	Object get(int index);
	
    /**
     * Replaces the element at the specified position in this list with the
     * specified element.
     *
     * @param index index of the element to replace
     * @param element element to be stored at the specified position
     * @return the element previously at the specified position
     */
	public Object set(int index, Object element);	
}
