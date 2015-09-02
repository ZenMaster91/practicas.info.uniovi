/**
 * 05.11.14 02.33
 * Guillermo_Facundo_Colunga
 * UO236856
 */
package graphs;

public class GraphNode<T> {
	private T element;
	private boolean visited;
	
	/**
	 * Constructor. Given a T element it sets the element and false for visited.
	 * @param element
	 */
	public GraphNode(T element) {
		setElement(element);
		setVisited(false);
	}
	
	/**
	 * Gatter. Can be applied over a node and return the element node.
	 * 
	 * @return the node as a T element.
	 */
	public T getElement() {
		return element;
	}

	/**
	 * Setter. Sets the node as the T element.
	 * 
	 * @param element
	 */
	public void setElement(T element) {
		this.element = element;
	}

	/**
	 * Is Visited returns true if the node has been already visited and false otherwise.
	 * 
	 * @return true if the node has been visited, false otherwise.
	 */
	public boolean isVisited() {
		return visited;
	}

	/**
	 * Set Visited method. You can set if a node has been visited or not by the parameter.
	 * 
	 * @param visited
	 */
	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	/**
	 * toString Method. 
	 * 
	 * @return an String that contains the node and if it has been visited.
	 */
	public String toString() {
		return ("GN(N:"+element.toString() + "/V:" + visited+")");
	}

	/**
	 * Print Method. Prints the node information by means of the toString method.
	 */
	public void print() {
		System.out.println(toString());
	}

}
