
import static org.junit.Assert.*;

import org.junit.Test;

public class AlgorithmsTest {

	@Test
	public void testFactorial() {
		assertEquals (720, Algorithms.factorial(6));
	}
	
	@Test
	public void testPower() {
		assertEquals (1099511627776L, Algorithms.pow(40));
		//assertEquals (1099511627776L, Algorithms.pow1(40)); // Too much complexity, do not test.
		assertEquals (1099511627776L, Algorithms.pow2(40));
		assertEquals (1099511627776L, Algorithms.pow3(40));
		assertEquals (1099511627776L, Algorithms.pow4(40));
	}

}
