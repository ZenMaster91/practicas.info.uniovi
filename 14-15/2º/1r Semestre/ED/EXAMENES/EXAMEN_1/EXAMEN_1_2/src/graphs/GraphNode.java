package graphs;

public class GraphNode<T> {
	private T element;
	private boolean visited;
	
	
	public GraphNode(T element) {
		setElement(element);
		setVisited(false);
	}
	
	

	public T getElement() {
		return element;
	}



	public void setElement(T element) {
		this.element = element;
	}



	public boolean isVisited() {
		return visited;
	}



	public void setVisited(boolean visited) {
		this.visited = visited;
	}



	public String toString() {
		return ("GN(N:"+element.toString() + "/V:" + visited+")");
	}

	public void print() {
		System.out.println(toString());
	}

}
