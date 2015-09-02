/*
 * Class AlgorithmsTest v 0.2
 * Guillermo_Facundo_Colunga
 * UO236856
*/
import static org.junit.Assert.*;

import org.junit.Test;

public class AlgorithmsTest {

	/*
	 * Testing the factorial algorithm with a value of 6.
	 */
	@Test
	public void testFactorial() {
		assertEquals (720, Algorithms.factorial(6));
	}
	
	/*
	 * Testing the diferent power algorithms with a value of 40.
	 * Warning: the pow1 method has too much complexity so we just comented
	 * 			to be able to execute the tests.
	 */
	@Test
	public void testPower() {
		assertEquals (1099511627776L, Algorithms.pow(40));
		//assertEquals (1099511627776L, Algorithms.pow1(40)); // Too much complexity, do not test.
		assertEquals (1099511627776L, Algorithms.pow2(40));
		assertEquals (1099511627776L, Algorithms.pow3(40));
		assertEquals (1099511627776L, Algorithms.pow4(40));
	}

	/*
	 * No more methods to be tested in the Algorithms Class.
	 */
}
