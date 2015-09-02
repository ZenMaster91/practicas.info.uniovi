package WorkSpace_al ;

/* This program serves to measure times automatically increasing 
 * the size of the problem. In addition, we use a repetition value 
 * determined by nTimes, an argument of the program */
public class Vector4 {
	static int[]v,m;
	private static int PRODUCTSUM = 100000000;
	private static int PRODUCTFIL = 100000;
	private static int PRODUCTMAX = 10000000;
	
	public static void main(String arg []) {
		int nTimes = Integer.parseInt(arg[0]);
		long t1,t2,t3,t4,t5,t6;
		int sum = 0;
		
		for (int n=10; n<=100000000; n*=5){ //n is increased *5   
			  v = new int[n];
			  m = new int[2];
			  Vector1.fillIn(v);
			  
			  //------------SUM
			  t1 = System.currentTimeMillis();
			  //we have to repeat the whole process to be measured
			  for (int repetition=1; repetition<=nTimes*PRODUCTSUM; repetition++){    	
			     sum = Vector1.sum(v);
			  }
			  t2 = System.currentTimeMillis();
			  
			  //------------FILLIN
			  t3 = System.currentTimeMillis();
			  for (int repetition=1; repetition<=nTimes*PRODUCTFIL; repetition++){    	
				  Vector1.fillIn(v);
			  }
			  t4 = System.currentTimeMillis();
			  
			  //------------MAX
			  t5 = System.currentTimeMillis();
			  for (int repetition=1; repetition<=nTimes*PRODUCTMAX; repetition++){    	
				  Vector1.maximum(v, m);
			  }
			  t6 = System.currentTimeMillis();
			  
			  System.out.println ("SIZE = "+n+" ** "+"TIME SUM= "+(t2-t1)+"ms ** "+"TIME FILLIN= "+(t4-t3)+"ms ** "+
			  "TIME MAX= "+(t6-t5)+"ms ** "+" SUM = " + sum + " ** nTimes = " + nTimes); 
			  
		}//for 
		
	}//main

}
