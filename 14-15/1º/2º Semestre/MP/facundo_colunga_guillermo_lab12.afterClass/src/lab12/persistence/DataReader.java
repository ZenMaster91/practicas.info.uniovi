package lab12.persistence;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.GZIPInputStream;

public class DataReader {

	public static List<Vehicle> loadData(String filename)
	{  
		List<Vehicle> vehicles = new ArrayList<Vehicle>();
		GZIPInputStream gzis = null;
		BufferedReader br = null;
		try {
			String sCurrentLine;
			if(isGZIP(filename)){
				// Since there are 4 constructor calls here, I wrote them out in full.
			    // In real life you would probably nest these constructor calls.
			    FileInputStream fin = new FileInputStream(filename);
			    gzis = new GZIPInputStream(fin);
			    InputStreamReader xover = new InputStreamReader(gzis);
			    br = new BufferedReader(xover);
			    Company.log.log("WARNING: The input file is a GZIP file.");
			} else {
				br = new BufferedReader(new FileReader(filename));
				Company.log.log("WARNING: The input file is a GZIP file.");
			}
			while ((sCurrentLine = br.readLine()) != null) {
				String[] parts = sCurrentLine.split("\t");
				if(parts[0].equals("car"))
					vehicles.add(newCar(parts));
				else if(parts[0].equals("motorbike"))
					vehicles.add(newMotorbike(parts));
				else if(parts[0].equals("truck"))
					vehicles.add(newTruck(parts));
				else throw new IllegalStateException("Error while parsing the file. Check format.");
			}
		} catch (IOException e) {
			Company.log.log(e.toString());
		} finally {
			try {
				if (br != null){
					br.close();
					gzis.close();
				}
			} catch (IOException ex) {
				Company.log.log(ex.toString());
			}
		}
		return vehicles;
	}
	
	static boolean isGZIP(String filename) {
		if(filename.contains(".gz")) return true;
		return false;
	}
	
	private static Vehicle newCar(String[] parts) {
		int cc = Integer.parseInt(parts[1]);
		int horsepower = Integer.parseInt(parts[2]);
		int years = Integer.parseInt(parts[3]);
		String brand = parts[4];
		Vehicle c = new Car(cc, horsepower,years, brand);
		return c;
	}
	
	private static Vehicle newMotorbike(String[] parts) {
		int cc = Integer.parseInt(parts[1]);
		int horsepower = Integer.parseInt(parts[2]);
		int years = Integer.parseInt(parts[3]);
		String brand = parts[4];
		Vehicle c = new Motorbike(cc, horsepower,years, brand);
		return c;
	}
	
	private static Vehicle newTruck(String[] parts) {
		int cc = Integer.parseInt(parts[1]);
		int horsepower = Integer.parseInt(parts[2]);
		int years = Integer.parseInt(parts[3]);
		String brand = parts[4];
		int numberOfAxes = Integer.parseInt(parts[5]);
		int tare = Integer.parseInt(parts[6]);
		Vehicle c = new Truck(cc, horsepower,years, brand, numberOfAxes, tare);
		return c;
	}

}
