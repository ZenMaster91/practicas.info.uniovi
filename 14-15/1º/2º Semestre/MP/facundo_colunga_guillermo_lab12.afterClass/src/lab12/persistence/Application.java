package lab12.persistence;

public class Application {

	
	public static void main(String args[]) {
		//Creating the company that will hold the vehicles.
		Company company = new Company();
		
		//Loading some data in the company from the text file vehicles.txt
		company.loadData("vehicles.txt.gz");
		
		//Listing all the vehicles without any kind of sorting.
		company.allVehicles();
		
		//Printing the total road tax.
		System.out.println("Total road tax: "+company.totalRoadTax());
		//Saving all the vehicles in a file. Not sorted
		company.save(Company.OUT_FILE);
		
		//Sorting the list of vehicles by the age of the vehicle.
		company.sortByAge();
		
		//Saving all the vehicles in a file. Sorted by Age.
		company.save("vehiclesByAge.txt");
		
		//Sorting the list of vehicles by the brand of the vehicle.
		company.sortByBrand();
		
		//Saving all the vehicles in a file. Sorted by Brand
		company.save("vehiclesByBrand.txt");
		
		//Closing the log file.
		Company.log.close();
	}
}
