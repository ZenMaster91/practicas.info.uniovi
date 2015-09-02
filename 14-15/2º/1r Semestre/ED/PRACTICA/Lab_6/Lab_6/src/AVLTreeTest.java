import static org.junit.Assert.*;

import org.junit.Test;


public class AVLTreeTest {
	
	
	@Test
	public void toStringTest() throws Exception
	{
		// Example.
	AVLTree<Character> a = new AVLTree<Character>();

	a.add('b');
	assertEquals("b(0)--", a.toString());
	a.add('a');
	assertEquals ("b(0)a(0)---", a.toString());
	a.add('c');
	assertEquals ("b(0)a(0)--c(0)--", a.toString());

	}
	
	
}
