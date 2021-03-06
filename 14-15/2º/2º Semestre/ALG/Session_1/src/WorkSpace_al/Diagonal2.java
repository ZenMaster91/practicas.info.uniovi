package WorkSpace_al ;


/* This program serves to measure times automatically increasing
the size of the problem (n) and also using a time scale determined
by nTimes, which is taken from the argument arg[1]
 
It also gets as an execution argument (arg[0]) the operation on which
we will focus the measurement (options 0,1,2 respectively)
*/

public class Diagonal2 {
	static int [][]a;
	
	public Diagonal2(){}

	public static void main(String arg []) {
		int nTimes = Integer.parseInt(arg[1]); //nTimes
		int option = Integer.parseInt(arg[0]); //selected option
		long t1,t2;
		
		//n is incremented * 2
		   
		   if (option==0){ //fill in the matrix
			   Diagonal1.fillIn(a);
		   } //if
			
		
		   else if (option==1) { //sum of the diagonal (one way)
			   Diagonal1.sum1Diagonal(a);
		   } //else if
		
		 
		   else if (option==2) { //sum of the diagonal (another way)
			   Diagonal1.sum2Diagonal(a);
		   } //else if
		
		      
		   else System.out.println ("INCORRECT OPTION"); 
		
	
	} //main

} //class
