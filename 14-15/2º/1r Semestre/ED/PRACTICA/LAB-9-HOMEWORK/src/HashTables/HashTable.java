package HashTables;

import java.util.ArrayList;

public class HashTable<T extends Comparable <T>> {
	
	protected final static int LINEAR_PROBING    = 0;
	protected final static int QUADRATIC_PROBING = 1;
	protected final static int ATTEMPS = 10;

	private int B = 7; 
	private int redispersionType = LINEAR_PROBING ;
	private double minLF = 0.5;
	private ArrayList<HashNode<T>> associativeArray;
	
	/**
	 * Main constructor.
	 * @param B
	 * @param redispersionType
	 * @param minLF
	 */
	public HashTable(int B, int redispersionType, double minLF)
	{
		setB(B);
		setRedispersionType(redispersionType);
		setMinLF(minLF);
		associativeArray = new ArrayList(B);
		for(int i = 0; i < B; i++){
			associativeArray.add(new HashNode<T>());
		}
	}

	/**
	 * @return the b
	 */
	public int getB() {
		return B;
	}

	/**
	 * @param b the b to set
	 */
	public void setB(int b) {
		if ( b < 0 ) {
			throw new IllegalArgumentException("B can not be negative.");
		} else { B = b; }
	}

	/**
	 * @return the redispersionType
	 */
	public int getRedispersionType() {
		return redispersionType;
	}

	/**
	 * @param redispersionType the redispersionType to set
	 */
	public void setRedispersionType(int redispersionType) {
		this.redispersionType = redispersionType;
	}

	/**
	 * @return the minLF
	 */
	public double getMinLF() {
		return minLF;
	}

	/**
	 * @param minLF the minLF to set
	 */
	public void setMinLF(double minLF) {
		if ( minLF < 0 ) {
			throw new IllegalArgumentException("B can not be negative.");
		} else { this.minLF = minLF; }
	}
	
	public ArrayList<HashNode<T>> getAssociativeArray()
	{
		return this.associativeArray;
	}
	
	
	//IMPORTANT METHODS
	
	/**
	* Hashing function
	* 
	* @param element to be stored.
	* @param i Attempt number.
	* @return slot in the array where the element should be placed
	*/
	protected int f (T element, int i)
	{
		
	    switch (redispersionType) {
	        case LINEAR_PROBING:  return (( Math.abs(element.hashCode()) + i) % B );
	    }   return (( Math.abs(element.hashCode()) + (i*i)) % B );
	}

	//[Slot] (Node’s status) = element.toString() -
	public String toString()
	{
		String aux = "";
		int i=0;
		if (associativeArray != null) {
			for(HashNode<T> element : associativeArray)
			{
				aux = aux + ("["+i+"]"+element.toString() +" = "+element.getElement() + " - ");
				i++;
			}
		} return aux;
	}
	
	/**
	 * Gets the LF
	 * @return the LF
	 */
	public double getLF() {
		return 0.5;
	}
	

	public void add(T element)
	{
		boolean success = false;
		int i = -1;
		
		do{
			i++;
			
			/*HashNode.EMPTY;
			HashNode.DELETED;*/
			if(associativeArray.get(f(element, i)).getStatus() != HashNode.VALID)
			{
				associativeArray.get(f(element, i)).setElement(element);
				associativeArray.get(f(element, i)).setStatus(HashNode.VALID);
				success = true;
			}
		} while ( !success && i < ATTEMPS );
	}
	
	/**
	 * Search.
	 * 
	 * @param element
	 * @return
	 */
	public boolean search(T element)
	{
		int pos = f(element,0);
		if(associativeArray.get(pos).getStatus() == HashNode.EMPTY) {
			return false;
		} else if (associativeArray.get(pos) == element) {
			return true;
		}
		return true;
	}
}
