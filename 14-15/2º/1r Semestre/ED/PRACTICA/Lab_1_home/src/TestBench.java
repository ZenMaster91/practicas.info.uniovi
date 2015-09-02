/*
 * Class TestBench v 0.2
 * Guillermo Facundo Colunga
 * UO236856
 */
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;

public class TestBench {

	public static final int SLEEP_TIME = 10;
	public static final int START_N = 1; //Initial workload.
	public static final int FINAL_N = 50; //Final workload.
	public static final int SAMPLES = 1; //Samples to measure.
	public static final String FILE_NAME = "output.csv"; //The filename where the means will be saved.
	public static long result = 0;
	public static long mean = 0;
	
	/*
	 * Main method. Creates a new TestBench object and runs a test on it.
	 * 
	 * @throws IOEscepcion
	 */
	public static void main(String[] args0) throws IOException
	{
		//(new TestBench()).test(FILE_NAME, START_N, FINAL_N, SAMPLES); //Just ignore the warning.
		testAlgorithm ("Algorithms", "linear", 10);
	}
	
	/*
	 * By working at different workloads writes on a file the means for the SAMPLES number
	 * 
	 * @param String filename, the name of the file where means will be saved. Integer startN, the initial
	 * workload. Integer finalN, the final workload. Integer samples, the total number of measures that will be executed.
	 */
	public static void test(String fileName, int startN, int finalN, int samples) throws IOException
	{
		int i=startN;
		int j=samples;
		//Creating a file to write in it
		FileWriter file = new FileWriter(fileName);

		//Working at different workloads.
		while(i <= finalN)
		{
			while(j >= 0 )
			{
				long before = System.currentTimeMillis();
				//Executes an algorithm for a given workload 'n'.
				Algorithms.quadratic(i);
				long after = System.currentTimeMillis();
				result = (after-before);
				mean = (mean + result)/2;
				System.out.println("TIME SPENT... "+ result +"ms" );
				j = j-1;
			}
			j=samples;
			
			//Writing in the file
			file.write(mean + ";");
			
			//Resetting variables.
			mean = 0;
			result = 0;
			System.out.println("\n"+"SAMPLE:........."+ samples +"\n"); //Just for develop info.
			i = i+1;
		}
		
		//Closing the file
		file.close();
	}
	
	/*
	 * This method is executed when we want to stop our process for a time of SLEEP_TIME
	 * 
	 * @param int i, the current iteration
	 */
	public static void doNothing(int i)
	{
		System.out.println("Doing nothing at iteration... ("+i+")");
		long endTime = System.currentTimeMillis() + SLEEP_TIME;
		while(System.currentTimeMillis() < endTime) {
			// do nothing
		}
	}
	
	/*
	 * This method stops the runtime during a double i time.
	 * 
	 * @param double i time, time to sleep.
	 */
	public static void doSomething(double i)
	{
		System.out.println("Doing something at iteration... ("+i+")");
		double endTime = System.currentTimeMillis() + i ;
		while(System.currentTimeMillis() < endTime) {
			// do nothing
		}
	}
	
	/*
	 * It's used to execute an algorithm from the Algorithms class. It can be used to execute any method from any class.
	 * 
	 * @param String className, the name of the class the method you want to execute is placed.
	 * @param String methodName, the name of the method you want to test.
	 * @param int n.
	 */
	public static void testAlgorithm (String className, String methodName, int n)	
	{    
	  Class<?> myClass = null;
	  Object myObject = null;

	  try { myClass = Class.forName(className);
	        myObject = myClass.newInstance();
	  } catch (Exception ex) {
	System.err.println("Error loading the class "); } 

	  try { Class<?>[] params=new Class[1];
		  params[0]=Integer.TYPE;
		  Method m = myClass.getMethod(methodName, params);
		  m.invoke(myObject, n);
	  } catch (Exception ex) {
		System.err.println("Error loading the class ");} 
	}

}
