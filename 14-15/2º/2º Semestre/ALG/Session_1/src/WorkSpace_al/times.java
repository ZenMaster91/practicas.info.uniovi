package WorkSpace_al;

import alg77777777.s2.Insertion1;
import alg77777777.s2.Vector;

public class times {
	
	static int[][] v;
	static long t1,t2;
	
	public static void main(String arg []) {
		diagonal1FillinTimes(96);
		diagonal1Sum1Times(96);
		diagonal1Sum2Times(96);
	}
	
	
	public static void diagonal1FillinTimes(int n) {
		int aux = 3;
		Diagonal1 diagonal1 = new Diagonal1();
		
		//t1 = System.currentTimeMillis();
		while(aux <= n) {
			v = new int [aux][aux];
			t1 = System.currentTimeMillis();
			for(int j=0; j<100000; j++)
				diagonal1.fillIn(v);
			t2 = System.currentTimeMillis();
			System.out.println("Time for fillin at n " +aux+ " : "+ (t2-t1));
			aux=aux*2;
		}
	}
	
	public static void diagonal1Sum1Times(int n) {
		int aux = 3;
		Diagonal1 diagonal1 = new Diagonal1();
		
		//t1 = System.currentTimeMillis();
		while(aux <= n) {
			v = new int [aux][aux];
			t1 = System.currentTimeMillis();
			for(int j=0; j<100000; j++)
				diagonal1.sum1Diagonal(v);
			t2 = System.currentTimeMillis();
			System.out.println("Time for sum1Times at n " +aux+ " : "+ (t2-t1));
			aux=aux*2;
		}
	}
	
	public static void diagonal1Sum2Times(int n) {
		int aux = 3;
		Diagonal1 diagonal1 = new Diagonal1();
		
		//t1 = System.currentTimeMillis();
		while(aux <= n) {
			v = new int [aux][aux];
			t1 = System.currentTimeMillis();
			for(int j=0; j<1000000; j++)
				diagonal1.sum2Diagonal(v);
			t2 = System.currentTimeMillis();
			System.out.println("Time for sum2Times at n " +aux+ " : "+ (t2-t1));
			aux=aux*2;
		}
	}
	
}
