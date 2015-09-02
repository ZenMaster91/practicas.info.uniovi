package lab09.Collections;

import java.util.List;
import java.util.ArrayList;

public class ArrayStack implements Stack {

	private List<Object> stack = new ArrayList<Object>();
	
	public void push(Object element) {
		if(element == null)
			throw new IllegalArgumentException("You cannot push a null element on to the stack.");
		stack.add(0, element);
	}

	
	public Object peek() {
		if(isEmpty())
			throw new IllegalStateException("The stack is empty.");
		return stack.get(0);
	}

	
	public Object pop() {
		if(isEmpty())
			throw new IllegalStateException("The stack is empty.");
		return stack.remove(0);
	}


	public int size() {
		return stack.size();
	}

	
	public boolean isEmpty() {
		return stack.isEmpty();
	}

	/**
	 * Default toString method.
	 * @return String.
	 */
	public String toString() {
		return stack.toString();
	}

}
