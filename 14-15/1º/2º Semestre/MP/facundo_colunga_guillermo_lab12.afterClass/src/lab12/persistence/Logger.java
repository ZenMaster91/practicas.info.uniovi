package lab12.persistence;

import java.io.*;
import java.util.Date;

public class Logger 
{
	private PrintWriter logFile;
	private Date date = new Date();
	
	public Logger(String filename)
	{
		try {
			logFile = new PrintWriter(new BufferedWriter(new FileWriter(filename, false)));
		} catch (IOException e) {
			System.err.printf("The log file \"%s\" could not be created: %s\n", filename, e.getMessage());
		}
		try {
			logFile.println("EXECUTION AT: "+date.toString());
		} catch (Exception e) {
			System.err.printf("The log file \"%s\" could not be dated: %s\n", filename, e.getMessage());
		}
	}
	
	public void log(String message)
	{
		logFile.println(message);
	}
	
	public void close()
	{
		logFile.flush();
		logFile.close();
	}
}
