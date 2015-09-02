package guillermo.util;

import guillermo.util.ArrayList;

import guillermo.util.List;

public class ArrayQueue<E> implements Queue<E> {
	
	private List<E> queue = new ArrayList<E>();

	@SuppressWarnings("unchecked")
	@Override
	public void enqueue(Object element) {
		queue.add((E) element);
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
	
	@Override
	public ArrayList<E> toArray() {
		return (ArrayList<E>) this.queue;
	}

}
