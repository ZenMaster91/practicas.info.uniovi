package lab11;



/**
 * <p>Title: Application</p>
 * <p>Description: Class that executes the program.</p>
 * <p>Copyright: Copyright (c) 2012</p>
 * <p>Computer Science Engineering School</p>
 * <p>Programming Methodology</p>
 * 
 * @author Lectures of Programming Methodology
 * @version 1.0
 */
public class Application {

	/**
	 * Main method that launches the application
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		new Application().run();
	}

	/**
	 * Method that executes the application.
	 */
	private void run() {
		Database database = new Database();
		try{
		database.open("myDataBase.db");
		} catch (Exception e) {
			System.err.println(e.getMessage());
			System.exit(-1);
		}

		database.write(new Student("John", "Lock", 4, "UO004"));
		database.write(new Student("Hugo", "Reyes", 8, "UO008"));
		database.write(new Student("James", "Ford", 15, "UO015"));
		database.write(new Student("Sayid", "Jarrah", 16, "UO016"));
		database.write(new Student("Jack", "Shephard", 23, "UO023"));
		database.write(new Student("Jim", "Kwon", 42, "UO042"));

		if (database.search("UO008") != null)
			System.out.println("Hugo (UO008) is in the database!");
		else
			System.out.println("Hugo (UO008) is NOT the database!");

		if (database.search("UO1178") != null)
			System.out.println("Benjamin Linus (UO1178) is in the database!");
		else
			System.out.println("Benjamin Linus (UO1178) is NOT the database!");

		database.close();
	}
}
