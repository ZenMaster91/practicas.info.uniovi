package lab09.Collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedQueue implements Queue {
	
	private List<Object> queue = new LinkedList<Object>();

	@Override
	public void enqueue(Object element) {
		queue.add(element);
	}

	@Override
	public Object peek() {
		if(isEmpty())
			throw new IllegalStateException("The queue is empty.");
		return queue.get(0);
	}

	@Override
	public Object dequeue() {
		if(isEmpty())
			throw new IllegalStateException("The queue is empty.");
		return (queue.remove(0));
	}

	@Override
	public int size() {
		return queue.size();
	}

	@Override
	public boolean isEmpty() {
		return queue.isEmpty();
	}

}
