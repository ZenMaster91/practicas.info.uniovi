package lab08.Collections;

import static org.junit.Assert.*;
import lab08.ArrayList.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class ArrayListTest {

	private List list;
	
	@Before
	public void setUp() {
		list = new ArrayList();
	}

	@Test
	public void testArrayList() 
	{
		assertEquals(0, list.size());
		assertTrue(list.isEmpty());
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
