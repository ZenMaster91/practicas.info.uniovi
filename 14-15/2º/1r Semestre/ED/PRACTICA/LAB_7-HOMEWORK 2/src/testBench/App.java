/**
 * 05.11.14 02.33
 * Guillermo_Facundo_Colunga
 * UO236856
 */
package testBench;

import Exception.AlgorithmsExceptions;

public class App {
	private final static int SAMPLES = 3; //Nunmber of times we run the algorithm
	private final static int INIT = 100; //Initial workload.
	private final static int FINAL = 300; //Final workload.
	
	/*
	 * I export the files as ".csv" just because it is easy to create the chart.
	 */
	private final static String FLOYD = "01_Graph_Floyd.csv";
	private final static String DIJKSTRA = "02_Graph_Dijkstra.csv";
	private final static String BUILD = "03_Graph_Build.csv";
	
	/**
	 * Main method, it runs the testBench Class for the Floyd, Dijkstra and build algorithms.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try{
			TestBench.saveFile(FLOYD, TestBench.test("GraphPerformanceTest", "runFloyd", SAMPLES, INIT, FINAL));
			TestBench.saveFile(DIJKSTRA, TestBench.test( "GraphPerformanceTest", "runDijkstra",SAMPLES, INIT, FINAL));
			TestBench.saveFile(BUILD, TestBench.test( "GraphPerformanceTest", "initGraph",SAMPLES, INIT, FINAL));
			
		} catch (AlgorithmsExceptions e) {
			e.printStackTrace();
		}	
	}

}
