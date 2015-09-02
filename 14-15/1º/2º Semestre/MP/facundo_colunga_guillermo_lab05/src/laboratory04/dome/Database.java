package laboratory04.dome;

import java.io.PrintStream;
import java.util.ArrayList;

public class Database {
	
	private ArrayList<Item> database = new ArrayList<Item>();
	private ArrayList<Borrowable> borrowables = new ArrayList<Borrowable>();
	
	/**
	 * Main constructor.
	 */
	public Database() {
		//To complete...
	}
	
	/**
	 * Getter. Gets the database as an ArrayList.
	 * 
	 * @return the database as an ArrayList.
	 */
	public ArrayList<Item> getDatabase() {
		return this.database;
	}
	
	/**
	 * Add an item to the database. You only can add an element once to the database
	 * 
	 * @param item to be added
	 * @return true if the element has been added, false otherwise.
	 */
	public boolean add(Item item) {
		if((database.contains(item))) {
			return false;
		}	
		database.add(item);
		if(item instanceof Borrowable)
		borrowables.add((Borrowable) item);
		return true;
	}
	
	/**
	 * Returns the number of elements of the list that you already own.
	 * 
	 * @return the number of elements of the list that you already own as an integer.
	 */
	public int numberOfItemsOn() {
		int aux = 0;
		for(Item current : (ArrayList<Item>) database) {
			if(current.getOwn()) {
				aux++;
			}
		} return aux;
	}
	
	/**
	 * Prints the list of all the elements we have in our list.
	 * [ THIS METHOD USE SUBCLASSES METHODS. ]
	 * 
	 * @param out ( the PrintStream out object ). -- DELETED
	 */
	public void list() {
		for(Item current : database) {
			current.toString();
		}
	}
	
	/**
	 * Search method. Looks for and item in the list and return it if it exists, null otherwise.
	 *  [ THIS METHOD USE SUBCLASSES METHODS. ]
	 * @param item to be searched.
	 * @return the item if it's on the list, null otherwise.
	 */
	public Item search(Item item) {
		for(Item current : database) {
			if(current.equals(item))
				return current;
		} return null;
	}
	
	/**
	 * Private search method, just to improve the action of borrow borrowable items.
	 * @param item to be searched in borrowables ArrayList.
	 * @return the item if it's in the list and null otherwise.
	 */
	private Borrowable search(Borrowable item) {
		for(Borrowable current: this.borrowables)
		if (current.equals(item))
			return current;
		return null;
	}
	
	/**
	 * Returns the ArrayList of borrowables. JUST FOR TESTING PORPOUSE
	 * @return the ArrayList of borrowables
	 */
	protected ArrayList<Borrowable> getBorrowableItems() {
		return this.borrowables;
	}
	
	
	/**
	 * Prints a lists with the actual borrowable objects.
	 * @param out
	 */
	public void listBorrowableItems(PrintStream out) {
		for (Borrowable item: this.borrowables)
			out.println(item);
    }
	
	/**
	 * Returns the ArrayList of available Items. JUST FOR TESTING PORPOUSE
	 * @return the ArrayList of available Items
	 */
	protected ArrayList<Borrowable> getAvailableItems() {
		ArrayList<Borrowable> aux = new ArrayList<Borrowable>();
		for (Borrowable current: this.borrowables)
	           if (current.isAvailable())
	        	   aux.add(current);
		return aux;
	}
	
	/**
	 * Prints a list with the current available objects.
	 * @param out
	 */
	public void listAvailableItems(PrintStream out) {
	    for (Borrowable current: this.borrowables)
	           if (current.isAvailable())
	        	   out.println(current);
		
	}
	
	/**
	 * Borrow and item only if it is available.
	 * @param item to be borrowed
	 * @return the item if borrowed, null otherwise.
	 * @throws Exception if the method would not check if the element is available and was not and exception will be thrown.
	 */
	public Borrowable borrow(Borrowable item) throws Exception {
		Borrowable aux = this.search(item);
		if (aux == null)
			return null;
		if (!aux.isAvailable())
			return null;
		aux.borrow();
		return aux;
	}
	
	/**
	 * Returns an Item by setting the isAvailable to true.
	 * @param item to be given back.
	 * @return true if the item is correctly given back, false otherwise.
	 */
	public boolean giveBack(Borrowable item) {
		Borrowable aux = this.search(item);
		if (aux == null)
			return false;
		if (aux.isAvailable())
			return false;
		aux.giveBack();
		return true;
	}


}
