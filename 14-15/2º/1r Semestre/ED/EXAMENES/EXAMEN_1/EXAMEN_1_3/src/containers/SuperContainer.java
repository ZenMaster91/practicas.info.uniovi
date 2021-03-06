/*
 * Class SuperContainer v 0.1
 * Guillermo_Facundo_Colunga
 * UO236856
*/
package containers;

public class SuperContainer<T, K> {
	private Container<T> container;
	private K info;
	private int key;
	
	/*
	 * Main constructor.
	 * 
	 * @param Container of T type. K info and and integer with the key.
	 */
	public SuperContainer(Container<T> container, K info, int key){
		setContainer(container);
		setInfo(info);
		setKey(key);
	}
	
	/*
	 * Getter. Returns the value of the Container
	 *
	 *@return The object stored in the container property.
	 */
	public Container<T> getContainer() {
		return container;
	}
	
	/*
	 * Setter. Sets the value of the container.
	 * 
	 * @param Container<T> object.
	 */
	public void setContainer(Container<T> container) {
		this.container = container;
	}
	
	/*
	 * Getter. Returns the value of the info property.
	 * 
	 * @return The info of the container.
	 */
	public K getInfo() {
		return info;
	}
	
	/*
	 * Setter. Sets the value of the info. It's a k type.
	 * 
	 * @param infor k type. The information that will be stored in the info property.
	 */
	public void setInfo(K info) {
		this.info = info;
	}
	
	/*
	 * Getter. Returns the value of the key as an integer.
	 * 
	 * @return the value of the key as an integer.
	 */
	public int getKey() {
		return key;
	}
	
	/*
	 * Setter. Sets the value for the key property.
	 * 
	 * @param integer key that will be the value to store in the key property.
	 */
	public void setKey(int key) {
		this.key = key;
	}
	
	/*
	 * toString method. Passes all the values to a String
	 * 
	 * @return an String with all the values of the Container<T>
	 */
	public String toString() {
		return (container.toString()+", "+info.toString()+", "+key);
	}
	

}
