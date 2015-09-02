package Lab_3;

import static org.junit.Assert.*;

import org.junit.Test;

public class ContainerTest {

	Container numbers = new Container("Hello");
	Container test2 = new Container("Peter");
	Container<Integer> test3 = new Container(123);
	
	@Test
	public void test() {
		
		assertEquals ("Hello", numbers.getElement());
		assertEquals ("Container [element=Hello]", numbers.toString());
		numbers.setElement("123");
		assertEquals ("Container [element=123]", numbers.toString());
		
		assertEquals ("Container [element=Peter]", test2.toString());
		test2.setElement("1234");
		assertEquals ("1234", test2.getElement());
		
		assertEquals ("Container [element=123]", test3.toString());
		test3.setElement(1234);
		assertEquals ((Integer)1234, test3.getElement());
		
		
		
	}

}
