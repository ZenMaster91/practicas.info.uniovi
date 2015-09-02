/*
 * Class Algorithm v 0.2
 * Guillermo Facundo Colunga
 * UO236856
*/
import java.math.*;

public class Algorithms {

	/*
	 * Linear function
	 * It will execute the method doSomething n times.
	 * @param int n > workload.
	 */
	public static void linear(int n) {	
		for(int i=0; i<=n; i++) {
				System.out.println("executing job: " + i);
				TestBench.doSomething(i);
		}
	}
	
	/*
	 * Quadratic function
	 * It will execute the method doSomething n times square.
	 * @param int n > workload.
	 */
	public static void quadratic(int n) {	
		for(int i=0; i<=n; i++) {
				int square = (int) Math.pow(i, 2);
				System.out.println("executing job: " + i);
				System.out.println("square "+n+" done");
				TestBench.doSomething(square);
		}
	}
	
	/*
	 * Linear function
	 * It will execute the method doSomething n times to the power of 3.
	 * @param int n > workload.
	 */
	public static void cubic(int n) {	
		for(int i=0; i<=n; i++) {
				int cub = (int) Math.pow(i, 3);
				System.out.println("executing job: " + i);
				System.out.println("power3 "+n+" done");
				TestBench.doSomething(cub);
		}
	}
	
	/*
	 * Linear function
	 * It will execute the method doSomething for the logarithm of n times.
	 * @param int n > workload.
	 */
	public static void logarithmic(int n) {	
		for(int i=0; i<=n; i++) {
			double log = Math.log(i);
			System.out.println("executing job: " + i);
			System.out.println("logarithm "+n+" done");
			TestBench.doSomething(log);
		}
	}
	
	
	public static long factorial(long n)
	{
	    long result = 1;
        for (long i = 1; i <= n; i++) {
            result *= i;
        }
        
        return result;
	}
	
	/*
	 * NO RECURSSION 
	 * 
	 * Calculating the power of a number by means of the math.java.class
	 * 
	 * @param long n which will be the power of 2
	 * @return the two to the power of n
	 */
	public static long pow(long n)
	{
		long result = 0;
		result = (long) Math.pow(2, n);
		return result;
		
	}
	
	/*
	 * TOO MUCH COMPLEXITY
	 * 
	 * Calculating the power of a number by means of recursion_1
	 * 
	 * @param long n which will be the power of 2
	 * @return the two to the power of n
	 */
	public static long pow1(long n)
	{
		if(n==0)
			return(1);
		else
			return pow1(n-1) + pow1(n-1);
		
	}
	
	/*
	 * BETTER OPTION!!!
	 * Calculating the power of a number by means of the reculsion_2
	 * 
	 * @param long n which will be the power of 2
	 * @return the two to the power of n
	 */
	public static long pow2(long n)
	{
		if(n==0)
			return(1);
		else
			return 2 * pow2(n-1);
		
	}
	
	/*
	 * --
	 * Calculating the power of a number by means of the reculsion_3
	 * 
	 * @param long n which will be the power of 2
	 * @return the two to the power of n
	 */
	public static long pow3(long n)
	{
		if(n==0)
			return(1);
		else {
			if(n%2==0)
				return pow3(n/2)*pow3(n/2);
			else
				return pow3(n/2)*pow(n/2)*2;
		}
			
		
	}
	
	/*
	 * BETTER OPTIMIZATION (log2n)
	 * 
	 * Calculating the power of a number by means of the reculsion_4
	 * 
	 * @param long n which will be the power of 2
	 * @return the two to the power of n
	 */
	public static long pow4(long n)
	{
		if(n==0)
			return(1);
		else {
			long aux = pow4(n/2);
			aux *= aux;
			if(n%2==0)
				return aux;
			else
				return aux*2;
		}
			
		
	}
}
