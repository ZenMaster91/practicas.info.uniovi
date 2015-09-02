package lab12.persistence;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Company {
	final static String OUT_FILE = "vehicles.out.txt";
	final static String IN_FILE = "vehicles.txt";
	static Logger log;
	private List<Vehicle> vehicles;
	
	public Company() {
		log = new Logger("vehicles.log.txt");
		vehicles = new ArrayList<Vehicle>();
	}
	
	public List<Vehicle> getVehicles() {
		return this.vehicles;
	}
	
	public void loadData(String filename) {
		try {
			vehicles.addAll(DataReader.loadData(filename));
		} catch (Exception e) {
			log.log("Error loading the data.");
		}
	}
	
	public void addVehicle(Vehicle v) {
		vehicles.add(v);
	}
	
	public boolean removeVehicle(Vehicle v) {
		return vehicles.remove(v);
	}
	
	public float totalRoadTax() {
		float aux = 0;
		for(Vehicle v : vehicles) {
			aux += v.roadTax();
		} return aux;
	}
	
	public void allVehicles() {
		System.out.println("ALL THE VEHICLES\n-------------------------");
		for(Vehicle v : vehicles) {
			System.out.println(v);
		}
	}
	
	public void sortByBrand() {
		CompareByBrand cb = new CompareByBrand();
		Collections.sort(vehicles, cb);
	}
	
	public void sortByAge() {
		CompareByAge ca = new CompareByAge();
		Collections.sort(vehicles, ca);
	}
	
	public void save(String filename) {
		try {
			PrintWriter writer = new PrintWriter(filename, "UTF-8");
			for(Vehicle v : vehicles) {
				writer.println(v.toString()+"\t"+v.roadTax());
			}
			try {
			writer.close();
			} catch (Exception e) {
				log.log("Error while closing the file");
			}
		} catch (FileNotFoundException | UnsupportedEncodingException e) {
			log.log("Error while saving the file");
		}
		
		try {
			CreateGz.main();
		} catch (Exception e) {
			log.log("Error while compressing the output file");
		}
	}

}
