package lab08.Collections;


class Node {
	Object element;
	Node next;
	
	public Node(Object element, Node next) {
		this.element = element;
		this.next = next;
	}
}

public class LinkedList implements List {

	Node head; // The starting node of the LinkedList, also known as the head.
	
	@Override
	public int size() {
		return size(head);
	}
	
	/**
	 * Recursive method to get the size of the linked list at any time.
	 * @param node to start with the node.next.
	 * @return the number of nodes from the first node given as a parameter to the end.
	 */
	private int size(Node node) {
		if(node==null)
			return 0;
		return 1 + size(node.next);
	}

	@Override
	public boolean isEmpty() {
		return (this.head == null);
	}

	@Override
	public void add(Object element) {
		add(size(), element);
	}

	@Override
	public void add(int index, Object element) {
		Node newNode = new Node(element, null);
		if (isEmpty())
			head = newNode;
		else {
			Node aux = (Node)get(index-1);
			newNode.next = (Node)get(index);
			aux.next = newNode;
		}
	}

	@Override
	public Object remove(int index) {
		Node toRemove = (Node) get(index);
		if (isEmpty()) {
			return null;
		} else if (index == 0) {
			Node aux = head;
			head = head.next;
			aux.element = null;
			aux.next = null;
		} else {
			((Node) get(index-1)).next = toRemove.next;
			toRemove.element = null;
			toRemove.next = null;
		} return toRemove;
	}

	@Override
	public Object remove(Object element) {
		return remove(indexOf(element));
	}

	@Override
	public int indexOf(Object element) {
		if(isEmpty()) {
			return -1;
		}
		int counter = 0;
		Node current = head;
		while(!(current==null)) {
			if(current.element == element)
				break;
			counter++;
			current = current.next;
		} return counter;
	}

	@Override
	public Object get(int index) {
		if(isEmpty() || index < 0 || index >= size()) {
			return null;
		}
		Node current = head;
		int i = 0;
		while(i<=index && !(current.next == null)) {
			current = current.next;
			i++;
		} return current;
	}

	@Override
	public Object set(int index, Object element) {
		return ((Node)get(index)).element = element;
		
	}
	
	public String toString() {
		StringBuilder aux = new StringBuilder();
		aux.append("[");
		Node current = this.head;
		while(!(current==null)) {
			aux.append(current.element.toString());
			if(!(current.next==null))
				aux.append(", ");
			current = current.next;
		}
		aux.append("]");
		return aux.toString();
	}

}
