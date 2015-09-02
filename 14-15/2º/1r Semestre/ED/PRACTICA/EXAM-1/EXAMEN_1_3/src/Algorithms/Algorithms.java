package Algorithms;
/*
 * Class Algorithms v 0.2
 * Guillermo_Facundo_Colunga
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
		for(int i=1; i<=n; i++) {
			System.out.println("executing job: " + i);
			TestBench.doNothing(i);
		}
	}
	
	/*
	 * Quadratic function
	 * It will execute the method doSomething n times square.
	 * @param int n > workload.
	 */
	public static void quadratic(int n) {	
		
		int square = (int) Math.pow(n, 2);
		for(int i=1; i<=square; i++) {
			System.out.println("executing job: " + i);
			TestBench.doNothing(i);
		}
	}
	
	/*
	 * Linear function
	 * It will execute the method doSomething n times to the power of 3.
	 * @param int n > workload.
	 */
	public static void cubic(int n) {	
		int cub = (int) Math.pow(n, 3);
		for(int i=1; i<=cub; i++) {
			System.out.println("executing job: " + i);
			TestBench.doNothing(i);
		}
	}
	
	/*
	 * Linear function
	 * It will execute the method doSomething for the logarithm of n times.
	 * @param int n > workload.
	 */
	public static void logarithmic(int n) {	
		//double log = n;
		for(int i=n; i>0; i=i/2) {
			//log = Math.log(log);
			System.out.println("executing job: " + i);
			//System.out.println("logarithm "+n+" done");
			TestBench.doNothing(i);
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
	public static long pow(int n)
	{
		long result = 0;
		result = (long) Math.pow(2, n);
		for(int i=1; i<=result; i++) {
			System.out.println("executing job: " + i);
			TestBench.doNothing(i);
		}
		return result;
		
	}
	
	/*
	 * TOO MUCH COMPLEXITY ( EXPONENTIAL )
	 * 
	 * Calculating the power of a number by means of recursion_1
	 * 
	 * @param long n which will be the power of 2
	 * @return the two to the power of n
	 */
	public static long pow1(int n)
	{
		if(n==0)
			return(1);
		else{
			System.out.println(n);
			for(int i=1; i<=n; i++) {
				System.out.println("executing job: " + i);
				TestBench.doNothing(i);
			}
			return pow1(n-1) + pow1(n-1);}
	}
	
	/*
	 * BETTER OPTION!!!
	 * Calculating the power of a number by means of the reculsion_2
	 * 
	 * @param long n which will be the power of 2
	 * @return the two to the power of n
	 */
	public static long pow2(int n)
	{
		if(n==0)
			return(1);
		else{
			System.out.println(n);
			for(int i=1; i<=n; i++) {
				System.out.println("executing job: " + i);
				TestBench.doNothing(i);
			}
			return 2 * pow2(n-1);}
		
	}
	
	/*
	 * --
	 * Calculating the power of a number by means of the reculsion_3
	 * 
	 * @param long n which will be the power of 2
	 * @return the two to the power of n
	 */
	public static long pow3(int n)
	{
		if(n==0)
			return(1);
		else {
			for(int i=1; i<=n; i++) {
				System.out.println("executing job: " + i);
				TestBench.doNothing(i);
			}
			if(n%2==0)
				return pow3(n/2)*pow3(n/2);
			else
				return pow3(n/2)*pow3(n/2)*2;
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
	public static long pow4(int n)
	{
		if(n==0)
			return(1);
		else {
			for(int i=1; i<=n; i++) {
				System.out.println("executing job: " + i);
				TestBench.doNothing(i);
			}
			long aux = pow4(n/2);
			aux *= aux;
			if(n%2==0)
				return aux;
			else
				return aux*2;
		}
			
		
	}
}