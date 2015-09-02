package lab11;

import org.junit.Test;

/**
 * <p>Title: DivisionByZeroTest</p>
 * <p>Description: Class that shows how to test code that must throw an exception.</p>
 * <p>Copyright: Copyright (c) 2012</p>
 * <p>Computer Science Engineering School</p>
 * <p>Programming Methodology</p>
 * 
 * @author Lectures of Programming Methodology
 * @version 1.0
 */
public class DivisionByZeroTest {

	/**
	 * The expected=Class.class parameter indicates the expected exception type.
	 * If that exception is not thrown, JUnit will show an error.
	 */
	@Test(expected=ArithmeticException.class)
	public void test() {
		System.out.print(3 / 0);
	}

}
