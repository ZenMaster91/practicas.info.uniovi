package laboratory04.dome;

/**
 * This interface is given as a contract to the Borrowable Items.
 * It is composed by the basic methods to ensure its performance.
 * @author Guillermo Facundo Colunga
 * @version 2015.02.27
 *
 */
public interface Borrowable {
	
	/**
	 * If an element is Borrowable and it's available this method returns true, false otherwise.
	 * @return true if available, false otherwise.
	 */
	public boolean isAvailable();
	
	/**
	 * Borrow and item. Free implementation. It can throw an exception.
	 * @return true if borrowed successfully. False otherwise
	 * @throws Exception --> If you want to control the existence and the availability of the object you can use it.
	 */
    public boolean borrow() throws Exception;
    
    /**
     * As long as the element exists this methods will give back the object by setting its availability to true.
     */
    public void giveBack();
    
    /**
	 * Setter. Sets the availablitlity of an Item.
	 * @param isAvailable
	 */
	void setAvailable(boolean isAvailable);

}
