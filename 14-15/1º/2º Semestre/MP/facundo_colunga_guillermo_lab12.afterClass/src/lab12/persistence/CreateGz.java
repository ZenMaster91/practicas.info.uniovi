package lab12.persistence;
import java.io.*;
import java.util.zip.GZIPOutputStream;

public class CreateGz 
{
	public static void main(String...args) throws IOException 
	{
		final String inputFileName = "vehicles.txt";
		final String outputFileName = "vehicles.out.txt" + ".gz";
		BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
		BufferedWriter writer = new BufferedWriter(
				new OutputStreamWriter(new GZIPOutputStream(new FileOutputStream(outputFileName))));
		while(reader.ready()) {
			String line = reader.readLine();
			writer.write(line + "\r\n");
		}
		reader.close();
		writer.close();
		System.out.printf("The file %s has been zipped and saved to %s.", inputFileName, outputFileName);
	}
}
