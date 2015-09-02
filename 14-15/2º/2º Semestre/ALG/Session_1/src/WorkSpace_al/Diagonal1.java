package WorkSpace_al;

import java.util.Random;

/* This program can solve a problem in two ways.
The problem is to calculate the sum of the elements of the
main diagonal of a square matrix of order n.
*/
public class Diagonal1{
	static int [][]a;
	static long t1;
	static long t2;
	
	public Diagonal1(){
		
	}
	
	public static void main (String arg [] ){
		int n = Integer.parseInt (arg[0]);
		a = new int[n][n];
	
		t1=System.currentTimeMillis();
		fillIn(a);
		t2=System.currentTimeMillis();
		System.out.println ("TIME FOR FILLIN =" + (t2-t1));	
		
		t1=System.currentTimeMillis();
		write(a);
		t2=System.currentTimeMillis();
		System.out.println ("TIME FOR FILLIN =" + (t2-t1));	
		
		System.out.println ("FIRST SOLUTION =" + sum1Diagonal(a));	
		System.out.println ("SECOND SOLUTION =" + sum2Diagonal(a));	
	} //main


public static void fillIn(int[][]a)
	/* 	This method gives random values ​​to an array of integers, 
	using the Random class of the java.util package  
	It has a quadratic complexity O(n^2)
	*/
	{
	    Random r= new Random();
	    int n=a.length;
	    for(int i=0;i<n;i++)
	    	for(int j=0;j<n;j++)
	    		a[i][j]= r.nextInt(199)-99; //values between -99 y 99
	     
	} 
	
	
	public static void write (int[][]a)
	/* 	This method writes the square matrix
	It has a quadratic complexity O(n^2)
	*/
	{
	    int n = a.length;
	    for (int i=0; i<n; i++) {
	    	for (int j=0; j<n; j++)
	    		System.out.print (a[i][j]+"//");
	    	System.out.println ();
	    }
	
	}  
	
	
	public static int sum1Diagonal (int[][]a)
	/* This method iteratively computes the sum of the diagonal
	It has a quadratic complexity O(n^2)
	*/ 
	{
	    int n= a.length;
	    int s=0;
	    for(int i=0;i<n;i++)
	    	for(int j=0;j<n;j++)
	    		if (i==j) s=s+a[i][j];
	    return s; 
	}   
	
	
	public static int sum2Diagonal (int[][]a)
	/*  This method iteratively computes the sum of the diagonal
	It has a linear complexity O(n)
	*/
	{
	    int n= a.length;
	    int s=0;
	    for(int i=0;i<n;i++)
	      s=s+a[i][i];
	    return s; 
	}    

} 
