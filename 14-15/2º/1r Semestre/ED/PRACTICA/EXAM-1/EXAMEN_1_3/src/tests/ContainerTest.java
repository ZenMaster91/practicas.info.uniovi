/*
 * GUILLERMO_FACUNDO_COLUNGA
 * UO236856
 */
package tests;

import static org.junit.Assert.*;
import containers.Container;

import org.junit.Test;

public class ContainerTest {

	@Test
	public void testToString() {
		Container<String> c = new Container<String>("Eerste test!");
		assertEquals("Eerste test!", c.getElement());
		c.setElement("Test, yo!");
		System.out.println(c.toString());
		assertEquals("Test, yo!", c.toString());
		
		Container<Integer> c2 = new Container<Integer>(42);
		assertEquals(42, (int) c2.getElement());
		c2.setElement(24);
		System.out.println(c2.toString());
		assertEquals("24", c2.toString());
	}

}
