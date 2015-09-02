package guillermo.util;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ArrayListTest {

	@SuppressWarnings("rawtypes")
	private List<Comparable> list;
	
	@SuppressWarnings("rawtypes")
	@Before
	public void setUp() {
		list = new ArrayList<Comparable>();
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
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		list.add(11);
		assertEquals("[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]", list.toString());
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
