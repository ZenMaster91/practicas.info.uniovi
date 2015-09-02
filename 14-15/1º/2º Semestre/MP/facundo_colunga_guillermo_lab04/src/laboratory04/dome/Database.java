package laboratory04.dome;

import java.io.PrintStream;
import java.util.ArrayList;

public class Database {
	
	private ArrayList<Item> database = new ArrayList<Item>();
	
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

}
