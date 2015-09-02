package lab08.Collections;

/**
 * The root interface in the <i>collection hierarchy</i>. A collection
 * represents a group of objects, known as its <i>elements</i>. Some
 * collections allow duplicate elements and others do not. Some are ordered
 * and others unordered. No <i>direct</i> implementations of this interface
 * are provided: other implementations of more specific subinterfaces like
 * <tt>Set</tt> and <tt>List</tt> are provided instead. This interface
 * is typically used to pass collections around and manipulate them where
 * maximum generality is desired.
 */
public interface Collection
{	
    /**
     * Returns the number of elements in this collection.
     *
     * @return the number of elements in this collection
     */
    int size();

    /**
     * Returns {@code true} if this collection contains no elements.
     *
     * @return {@code true} if this collection contains no elements.
     */
    boolean isEmpty();
	
	/**
	 * Appends the specified element to this collection.
	 *  
	 * @param element element to be appended
	 */
	void add(Object element);

    /**
     * Removes a single instance of the specified element from this
     * collection, if it is present. More formally, removes an element
     * {@code e} such that
     * {@code element == null ? e ==null : element.equals(e))}, if this
     * collection contains one or more such elements. Returns the element
     * that was removed from the collection.
     * 
     * @param element element to be removed from this collection, if present
     * @return the element previously at the specified position
     */ 
	Object remove(Object element);
	
	/**
     * Returns a string representation of this collection. The string
     * representation consists of a list of the collection's elements, enclosed
     * in square brackets (<tt>"[]"</tt>). Adjacent elements are separated by
     * the characters <tt>", "</tt> (comma and space). Elements are converted
     * to strings as by invoking their {@code toString} method.
     *
     * @return a string representation of this collection
     */
	String toString();
}