/**
 * 05.11.14 02.33
 * Guillermo_Facundo_Colunga
 * UO236856
 */
package testBench;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import Exception.AlgorithmsExceptions;

public class TestBench {
	/**
	 * Performs the selected algorithm test as many times as the "samples"
	 * parameter, and returns the average time for each workload in an array.
	 * 
	 * @param testType. Type of test to be performed.
	 * @param samples.  Number of times the test will be performed for each workload.
	 * @param nStart. Initial workload.
	 * @param nEnd. Final workload.
	 * @throws AlgorithmsExceptions 
	 */
	public static long[] test(String classOf, String testType, int samples, int nStart, int nEnd) throws AlgorithmsExceptions {
		long[] measurements = new long[samples];
		long[] dataOutput = new long[nEnd - nStart + 1];
		for (int i = nStart; i <= nEnd; i++) {
			for (int j = 0; j < samples; j++)
				measurements[j] = measure(classOf, testType, i);
			dataOutput[i - nStart] = average(measurements);
		}

		return dataOutput;
	}

	/**
	 * Saves the data for the performed tests in a file.
	 * 
	 * @param fileName
	 *            Name of the file that will store the results.
	 * @param data
	 *            Array with the results of a test.
	 */
	public static void saveFile(String fileName, long[] data) {
		FileWriter file = null;
		PrintWriter pw = null;
		try {
			file = new FileWriter(fileName);
			pw = new PrintWriter(file);

			for (int i = 0; i < data.length; i++) {
				pw.print(data[i]+";");
			}

		} catch (IOException e) {
			System.err.format("There was a problem with the file:"
					+ " %s. Check the file is correct and you have"
					+ " the required permissions.\n", fileName);
			e.printStackTrace();
		} finally {
			try {
				if (file != null)
					file.close();
			} catch (Exception e) {
				System.err.format("A problem occured while closing the file.");
				e.printStackTrace();
			}
		}

	}

	// Private methods.
	/**
	 * Performs the selected algorithm from the Algorithms class and measures
	 * the time it takes to do it.
	 * 
	 * @param performanceTest
	 *            Type of algorithm to perform.
	 * @param workload
	 *            Workload for the linear algorithm.
	 * @return Elapsed time since the algorithm starts running until it
	 *         finishes.
	 * @throws AlgorithmsExceptions
	 *             A problem occurred trying to invoke the selected method from
	 *             the specified class.
	 */
	private static long measure(String classOf, String performanceTest, int workload)
			throws AlgorithmsExceptions {
		long tStart;
		long tEnd;
		long elapsed;

		tStart = System.currentTimeMillis();
		testAlgorithm(classOf, performanceTest, workload);
		tEnd = System.currentTimeMillis();
		elapsed = (tEnd - tStart);
		System.out.println("Estimated execution time: " + elapsed
				+ " miliseconds. Workload: " + workload);

		return elapsed;
	}

	/**
	 * Method used to calculate the arithmetic mean of the content of an array
	 * of "long" numbers.
	 * 
	 * @param array
	 *            Series of values to get the mean from.
	 * @return Mean value of the provided array.
	 */
	private static long average(long[] array) {
		long sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return (sum / array.length);
	}
	
	/**
	 * Invokes the specified method from an existing class with a single Integer
	 * as a parameter.
	 * 
	 * @param className
	 * @param methodName
	 * @param workload
	 * @throws AlgorithmsExceptions
	 */
	private static void testAlgorithm(String className, String methodName,
			int workload) throws AlgorithmsExceptions {
		try {
			Object o = Class.forName("testBench." + className).newInstance();
			Class<?>[] parameter = new Class[1];
			parameter[0] = Integer.class;
			Method m = o.getClass().getDeclaredMethod(methodName, parameter);
			m.invoke(o, workload);
		
		} catch (InstantiationException e) {
			e.printStackTrace();
			throw new AlgorithmsExceptions(
					"There was a problem with the instantiation of the class.");
		} catch (IllegalAccessException e) {
			e.printStackTrace();
			throw new AlgorithmsExceptions(
					"There was a problem invoking the algorithm method: "
							+ "Permission denied");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			throw new AlgorithmsExceptions("The " + className
					+ " class could no be found.");
		} catch (NoSuchMethodException e) {
			Long nWorkload = (long) workload;
			testAlgorithm(className, methodName, nWorkload);	
		} catch (SecurityException e) {
			e.printStackTrace();
			throw new AlgorithmsExceptions();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
			throw new AlgorithmsExceptions();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
			throw new AlgorithmsExceptions(
					"There was a problem invoking the algorithm method. "
							+ "Check that the correct parameters have been provided.");
		}

	}
	
	/**
	 * Invokes the specified method from an existing class with a single Long
	 * as a parameter.
	 * 
	 * @param className
	 * @param methodName
	 * @param workload
	 * @throws AlgorithmsExceptions
	 */
	private static void testAlgorithm(String className, String methodName,
			long workload) throws AlgorithmsExceptions {
		try {
			Object o = Class.forName("testBench." + className).newInstance();
			Class<?>[] parameter = new Class[1];
			parameter[0] = Long.class;
			Method m = o.getClass().getDeclaredMethod(methodName, parameter);
			m.invoke(o, workload);
		
		} catch (InstantiationException e) {
			e.printStackTrace();
			throw new AlgorithmsExceptions(
					"There was a problem with the instantiation of the class.");
		} catch (IllegalAccessException e) {
			e.printStackTrace();
			throw new AlgorithmsExceptions(
					"There was a problem invoking the algorithm method: "
							+ "Permission denied");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			throw new AlgorithmsExceptions("The " + className
					+ " class could no be found.");
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
			throw new AlgorithmsExceptions("The " + methodName
					+ " method with the selected parameters could no be found.");
		} catch (SecurityException e) {
			e.printStackTrace();
			throw new AlgorithmsExceptions();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
			throw new AlgorithmsExceptions();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
			throw new AlgorithmsExceptions(
					"There was a problem invoking the algorithm method. "
							+ "Check that the correct parameters have been provided.");
		}

	}

}
