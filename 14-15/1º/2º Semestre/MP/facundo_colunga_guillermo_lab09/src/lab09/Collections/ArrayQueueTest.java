package lab09.Collections;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ArrayQueueTest {
	private Queue queue;

	@Before
	public void setUp() throws Exception {
		queue = new LinkedQueue();
	}

	@Test
	public void isEmptyTest() {
		//When the stack empty...
		assertEquals(true, queue.isEmpty());
		
		//Adding some elements...
		queue.enqueue(1);
		assertEquals(false, queue.isEmpty());
		
		//Testing it backwards...
		queue.dequeue();
		assertEquals(true, queue.isEmpty());
	}
	
	@Test
	public void sizeTest() {
		//When the stack empty...
		assertEquals(0, queue.size());
		
		//Adding some elements...
		queue.enqueue(1);
		assertEquals(1, queue.size());
		
		//Testing it backwards...
		queue.dequeue();
		assertEquals(0, queue.size());
	}
	
	@Test
	public void peekTest() {
		//When the stack empty...
		try {
			queue.peek();
			fail("A IllegalStateException should be thrown.");
		} catch (IllegalStateException e) {}
		
		//Adding some elements...
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		assertEquals(1, queue.peek());
		
		//Checking that this method does not remove anything.
		assertEquals(1, queue.peek());
	}
	
	@Test
	public void dequeueTest() {
		//When the stack empty...
		try {
			queue.dequeue();
			fail("A IllegalStateException should be thrown.");
		} catch (IllegalStateException e) {}
		
		//Adding some elements...
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		assertEquals(1, queue.dequeue());
		
		//Checking that this method removes something.
		assertEquals(2, queue.dequeue());
	}

}
