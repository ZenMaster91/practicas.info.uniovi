package lab08.Collections;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import lab08.Collections.List;
import lab08.LinkedList.LinkedList;

public class LinkedListTest 
{
	private List list;
	
	@Before
	public void setUp()
	{
		list = new LinkedList();
	}
	
	@Test
	public void testLinkedList() 
	{
		assertEquals(0, list.size());
		assertTrue(list.isEmpty());
	}

	@Test
	public void testToStringEmpty() 
	{
		assertEquals("[]", list.toString());
	}

	@Test
	public void testToStringInteger() 
	{
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);		
		assertEquals("[1, 2, 3, 4]", list.toString());
	}

	@Test
	public void testToStringString() 
	{
		list.add("testing");
		list.add("with");
		list.add("the");
		list.add("JUnit");		
		list.add("framework");		
		assertEquals("[testing, with, the, JUnit, framework]", list.toString());
	}
}
