package lab09.Collections;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LinkedStackTest {
	
	private LinkedStack stack;
	
	@Before
	public void setUp() {
		stack = new LinkedStack();
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void pushExceptionTest() {
		stack.push(null);
	}

	@Test
	public void peekTest() {
		//When the stack empty...
		try {
			stack.peek();
			fail("A IllegalStateException should be thrown.");
		} catch (IllegalStateException e) {}
		
		//Adding some elements...
		stack.push(1);
		stack.push(2);
		stack.push(3);
		assertEquals(3, stack.peek());
		
		//Checking that this method does not remove anything.
		assertEquals(3, stack.peek());
	}

	@Test
	public void popTest() {
		//When the stack empty...
		try {
			stack.pop();
			fail("A IllegalStateException should be thrown.");
		} catch (IllegalStateException e) {}
		
		//Adding some elements...
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		assertEquals(3, stack.pop());
		assertEquals(2, stack.pop());
		assertEquals(1, stack.pop());
	}
	
	@Test
	public void sizeTest() {
		//When the stack empty...
		assertEquals(0, stack.size());
		
		//Adding some elements...
		stack.push(1);
		stack.push(2);
		stack.push(3);
		assertEquals(3, stack.size());
		
		//Deleting some elements...
		stack.pop();
		stack.pop();
		stack.pop();
		assertEquals(0, stack.size());
		
	}
	
	@Test
	public void isEmptyTest() {
		assertEquals(true, stack.isEmpty());
		
		//Adding some elements...
		stack.push(1);
		stack.push(2);
		stack.push(3);
		assertEquals(false, stack.isEmpty()); //The stack must not be empty.
		
		//Deleting some elements...
		stack.pop();
		stack.pop();
		stack.pop();
		assertEquals(true, stack.isEmpty()); //The stack must be empty.
	}
	
	@Test
	public void stringTopStringTest() {
		//When the stack empty...
		assertEquals("[]", stack.toString());
		
		//Adding some elements...
		stack.push("abba");
		stack.push("baab");
		stack.push("caca");
		assertEquals("[caca, baab, abba]", stack.toString());
	}
	
	@Test
	public void integerTopStringTest() {
		//When the stack empty...
		assertEquals("[]", stack.toString());
		
		//Adding some elements...
		stack.push(1);
		stack.push(3);
		stack.push(5);
		assertEquals("[5, 3, 1]", stack.toString());
	}
	
	@Test
	public void charTopStringTest() {
		//When the stack empty...
		assertEquals("[]", stack.toString());
		
		//Adding some elements...
		stack.push('A');
		stack.push('B');
		stack.push('C');
		assertEquals("[C, B, A]", stack.toString());
	}
}
