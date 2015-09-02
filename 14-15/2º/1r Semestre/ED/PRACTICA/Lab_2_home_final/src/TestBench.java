/*
 * Class TestBench v 0.2
 * Guillermo_Facundo_Colunga
 * UO236856
 */
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;

public class TestBench {

	public static final int SLEEP_TIME = 2;
	public static final int START_N = 1; //Initial workload.
	public static final int FINAL_N = 50; //Final workload.
	public static final long FINAL_Nun = 1;
	public static final int SAMPLES = 1 ; //Samples to measure.
	public static final String FILE_NAME = "output.csv"; //The filename where the means will be saved.
	public static final String FILE_NAME_LINEAR = "linear_means.csv";
	public static final String FILE_NAME_QUADRATIC = "quadratic_means.csv";
	public static final String FILE_NAME_CUBIC = "cubic_means.csv";
	public static final String FILE_NAME_LOGARITHMIC = "logarithmic_means.csv";
	public static final String FILE_NAME_POW = "pow_means.csv";
	public static final String FILE_NAME_POW1 = "pow1_means.csv";
	public static final String FILE_NAME_POW2 = "pow2_means.csv";
	public static final String FILE_NAME_POW3 = "pow3_means.csv";
	public static final String FILE_NAME_POW4 = "pow4_means.csv";
	public static final long N = 1252504179175015687L;
	public static long result = 0;
	public static long mean = 0;
	public static int counter = 0;
	
	/*
	 * Main method. Creates a new TestBench object and runs a test on it.
	 * 
	 * @throws IOEscepcion
	 */
	public static void main(String[] args0) throws IOException
	{
		//(new TestBench()).test(FILE_NAME_LINEAR,"linear", START_N, FINAL_N, SAMPLES); //Just ignore the warning.
		//(new TestBench()).test(FILE_NAME_QUADRATIC,"quadratic", START_N, FINAL_N, SAMPLES);
		//(new TestBench()).test(FILE_NAME_CUBIC,"cubic", START_N, FINAL_N, SAMPLES);
		//(new TestBench()).test(FILE_NAME_LOGARITHMIC,"logarithmic", START_N, FINAL_N, SAMPLES);*/
		//(new TestBench()).test(FILE_NAME_POW,"pow", START_N, FINAL_N, SAMPLES);
		//(new TestBench()).test(FILE_NAME_POW1,"pow1", START_N, 15, SAMPLES); //The '20' is required because it's a exponential complexity function.
		(new TestBench()).test(FILE_NAME_POW2,"pow2", START_N, FINAL_N, SAMPLES);
		(new TestBench()).test(FILE_NAME_POW3,"pow3", START_N, FINAL_N, SAMPLES);
		(new TestBench()).test(FILE_NAME_POW4,"pow4", START_N, FINAL_N, SAMPLES);
		
		//System.out.println(Algorithms.pow(20));
		//(new TestBench()).test(FILE_NAME_POW,"pow", 1, 1, 1);
	}
	
	/*
	 * By working at different workloads writes on a file the means for the SAMPLES number
	 * 
	 * @param String filename, the name of the file where means will be saved. Integer startN, the initial
	 * workload. Integer finalN, the final workload. Integer samples, the total number of measures that will be executed.
	 */
	public static void test(String fileName,String algorithm, int startN, int finalN, int samples) throws IOException
	{
		int i=startN;
		int j=samples;
		int times = 0;
		counter = 0;
		//Creating a file to write in it
		FileWriter file = new FileWriter(fileName);

		//Working at different workloads.
		while(i <= finalN)
		{
			while(j > 0 )
			{
				long before = System.currentTimeMillis();
				//Executes an algorithm for a given workload 'n'.
				testAlgorithm ("Algorithms", algorithm, i);
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
			//times++;
			//System.out.println("\n"+"SAMPLE:........."+ times +"\n"); //Just for develop info.
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
		counter++;
		System.out.println("Doing nothing at iteration... ("+i+")");
		//System.out.println("PERCENTAGE COMPLETED.................."+(double)getPercentage(i)+"%");
		long endTime = System.currentTimeMillis() + SLEEP_TIME;
		while(System.currentTimeMillis() < endTime) {
			// do nothing
		}
	}
	
	public static double getPercentage(int i)
	{
		double result=1.0;
		//System.out.println(counter+";"+(getTotalTimes()));
		result = ((((double)counter/(long)47254)*100)/SAMPLES);
		return result;
	}
	
	public static double getTotalTimes()
	{
		return ((FINAL_N*(FINAL_N+1))/2);
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