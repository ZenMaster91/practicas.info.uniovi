/**
 * 05.11.14 02.33
 * Guillermo_Facundo_Colunga
 * UO236856
 */
package testBench;

public class Algorithms {
	// CONSTANTS
	public static final int SLEEP_TIME = 2;

	// PUBLIC METHODS
	/**
	 * Linear algorithm that performs an idle task as many times as its workload
	 * 
	 * @param n
	 *            Workload. Number of times to perform idle task.
	 */
	public static void linear(Integer n) {
		for (int i = 1; i <= n; i++) {
			doNothing(i);
		}
	}

	/**
	 * Quadratic algorithm that performs an idle task as many times as the
	 * square of its workload.
	 * 
	 * @param n
	 *            Workload. Square root of the number of times the idle task
	 *            will be performed.
	 */
	public static void quadratic(Integer n) {
		int counter = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				counter++;
				doNothing(counter);
			}
		}
	}

	/**
	 * Cubic algorithm that performs an idle task as many times as the
	 * cube of its workload.
	 * 
	 * @param n
	 *            Workload. Cubic root of the number of times the idle task
	 *            will be performed.
	 */
	public static void cubic(Integer n) {
		int counter = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				for (int k = 1; k <= n; k++) {
					counter++;
					doNothing(counter);
				}
			}
		}
	}
	
	/**
	 * Logarithmic algorithm.
	 * 
	 * @param n
	 *            Workload.
	 */
	public static void logarithmic(Integer n) {
		int counter = 0;	
		for (int i = n; i > 0; i=i/2) {
			counter++;
			doNothing(counter);
		}	
	}
	
	/**
	 * Recursive algorithm that calculates the factorial of a Long number
	 * 
	 * @param n
	 * @return factorial of n
	 */
	public static long factorial(Long n) {
		if (n<0) 
			throw new IllegalArgumentException("Cannot calculate the factorial of a negative number.");
		else if (n == 0)
			return 1;
		else 
			return n*factorial(n-1);
	}
	
	/**
	 * Calculates 2^n with n being a natural number.
	 * 
	 * 2nd best
	 * 
	 * @param n
	 * @return
	 */
	public static long pow(Long n) {
		doNothing(n);
		if (n < 0)
			throw new IllegalArgumentException("The pow(long n) method works only for natural numbers.");
		else if (n == 0)
			return 1;
		else
			return 2*pow(n-1);
			
	}
	
	/**
	 * Calculates 2^n with n being a natural number.
	 * 
	 * 3rd best
	 * 
	 * @param n
	 * @return
	 */
	public static long pow2(Long n) {
		doNothing(n);
		if (n < 0)
			throw new IllegalArgumentException("The pow2(Long n) method works only for natural numbers.");
		else if (n == 0)
			return 1;
		else
			return pow2(n-1)+pow2(n-1);
			
	}
	
	/**
	 * Calculates 2^n with n being a natural number.
	 * 
	 * 4th best (worst)
	 * 
	 * @param n
	 * @return
	 */
	public static long pow3(Long n) {
		doNothing(n);
		if (n < 0)
			throw new IllegalArgumentException("The pow3(Long n) method works only for natural numbers.");
		else if (n == 0)
			return 1;
		else {
			if (n%2==0)
				return pow3(n/2)*pow3(n/2);
			else
				return pow3(n/2)*pow3(n/2)*2;
		}
	}
	
	/**
	 * Calculates 2^n with n being a natural number.
	 * 
	 * Best one
	 * 
	 * @param n
	 * @return
	 */
	public static long pow4(Long n) {
		doNothing(n);
		if (n < 0)
			throw new IllegalArgumentException("The pow4(Long n) method works only for natural numbers.");
		else if (n == 0)
			return 1;
		else {
			long aux = pow4(n/2);
			aux *= aux;
			if (n%2==0)
				return aux;
			else
				return aux*2;
		}
	}
	
	/**
	 * Calculates 2^n with n being a real number.
	 * 
	 * @param n
	 * @return
	 */
	public static double powReal(double n) {
		if (n == 0) {
			return 1;
		} else if (n > 0) {
			return 2*powReal(n-1);
		} else {
			double nPositive = -n;
			return 1/(2*powReal(nPositive-1));
		}
	}
	
	/**
	 * Makes the CPU wait.
	 * @param int i
	 */
	public static void doNothing(int i) {
		System.out.println("Doing nothing. Counter: " + i);
		long endTime = System.currentTimeMillis() + SLEEP_TIME;
		while (System.currentTimeMillis() < endTime) {
			// do nothing
		}
	}
	
	/**
	 * Makes the CPU wait.
	 * @param long i
	 */
	public static void doNothing(long i) {
		//System.out.println("Doing nothing. Counter: " + i);
		long endTime = System.currentTimeMillis() + SLEEP_TIME;
		while (System.currentTimeMillis() < endTime) {
			// do nothing
		}
	}

}
