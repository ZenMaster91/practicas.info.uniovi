package graphs;

import java.util.ArrayList;

public class Floyd {


	public static final int NOT_A_VERTEX = -1;
	public static final int INFINITE = 99;
	public static final int N = 3;
	   
	private double A[][];//Cost matrix.
    private int P[][];//Pathway matrix.
    
    
	protected double[][] getA()
    {
        return A;
	}
	
	protected int[][] getP(){
		return P;
	}
	
	protected double[][] initsFloyd(){
		for(int i=0; i<getSize(); j++)
		{
			if(edges[i][j])
				A[i][j] = weight[i][j];
			else
				A[i][j] = INFINITE;
			P[i][j] = -1;
			
			if(i==j)
				A[i][j]=0;
		}
		
		return null;
	}
	
	protected double[][] floyd(int An){
		if(An <= getSize())
		{
			initsFloyd();
			
			for(int k=0; k<An; k++)
				for(int i=0; i<getSize(); i++)
					for(int j=0; j<getSize(); j++)
		}
	}
/*	
	public String printFloydPath(T departure , T arrival){
		int i = getNode(departure);
		int j = getNode(arrival);
		
		if(i== INDEX_NOT_FOUND)
			throw new Exception("");
		if(j== INDEX_NOT_FOUND)
			throw new Exception("");
		int k = P[i][j];
		if(k>0)
			return (printFloyd)
	}
	
	*/
}
