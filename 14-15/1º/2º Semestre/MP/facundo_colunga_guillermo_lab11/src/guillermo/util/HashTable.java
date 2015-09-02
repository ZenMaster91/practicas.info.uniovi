/**
 * 03.12.14 04.15
 * Guillermo_Facundo_Colunga
 * UO236856
 */
package guillermo.util;

import java.util.ArrayList;

public class HashTable<T extends Comparable <T>> {
	
	protected final static int LINEAR_PROBING    = 0;
	protected final static int QUADRATIC_PROBING = 1;
	protected final static int DOUBLE_HASHING = 2;
	protected final static int ATTEMPS = 10;

	private int B = 7; 
	private int redispersionType = LINEAR_PROBING ;
	private double minLF = 0.5;
	private int n = 0;
	private int R = 5;
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
		this.R = prevPrime(B);
		setRedispersionType(redispersionType);
		setMinLF(minLF);
		associativeArray = new ArrayList<HashNode<T>>(B);
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
	        case DOUBLE_HASHING:  return (( Math.abs(element.hashCode()) + i*(R-Math.abs(element.hashCode() % R ))) % B );
	    }   return (( Math.abs(element.hashCode()) + (i*i)) % B );
	}
	
	//[Slot] (Node???s status) = element.toString() -
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
		System.out.println ("Hello there" + (double) n);
		return (double)n / (double)B;
	}
	

	public void add(T element)
	{
		boolean success = false;
		int i = -1;
		
		do{
			i++;
			
			if(associativeArray.get(f(element, i)).getStatus() != HashNode.VALID)
			{
				associativeArray.get(f(element, i)).setElement(element);
				associativeArray.get(f(element, i)).setStatus(HashNode.VALID);
				success = true;
			}
		} while ( !success && i < ATTEMPS );
		n++;
		if (getLF() > minLF) {
			dynamicResize(); }
	}
	
	/**
	 * Search.
	 * 
	 * @param element
	 * @return
	 */
	public boolean search(T element)
	{
		boolean success = false;
		int i = -1;

		do {
			i++;
			HashNode<T> hashNode = associativeArray.get(f(element, i));
			if (hashNode.getStatus() == HashNode.VALID) {
				if (hashNode.getElement().equals(element))
					success = true;
			}
		} while (!success && i < ATTEMPS);

		return success;
	}
	
	/**
	 * Remove method. Given an element as a parameter this method removes it from the hash table.
	 * @param element to be removed.
	 */
	public void remove(T element)
	{
		boolean success = false;
		int i = -1;

		do {
			i++;
			HashNode<T> hashNode = associativeArray.get(f(element, i));
			
			if (hashNode.getStatus() == HashNode.VALID && hashNode.getElement().equals(element)) {
					hashNode.setStatus(HashNode.DELETED); }
			
		} while (!success && i < ATTEMPS);

		n--;
	}
	
	/**
	 * Given an integer number as a parameter it returns true only in the case that this number
	 * is a pime number. False otherwise
	 * 
	 * @param number to check if it's prime or not
	 * @return true if the parameter is a prime number and false otherwise.
	 */
	protected static boolean isPrime(int prime) {
		if ( prime < 0 ) {
			prime = Math.abs(prime);
		} for ( int i=2; i<prime; i++ ) {
			if ( prime % i == 0 ) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Returns the next prime number given an integer number as a parameter
	 * 
	 * @param number where you start to check for the next prime number
	 * @return an integer number that will be the next prime with respect to the parameter.
	 */
	protected static int nextPrime(int prime) {
		int prim = prime + 1;
		while( !isPrime(prim) ) {
			prim++;
		} return prim;
	}
	
	/**
	 * Returns the previous prime number given an integer number as a parameter
	 * 
	 * @param number where you start to check for the previous prime number
	 * @return an integer number that will be the previous prime with respect to the parameter.
	 */
	protected static int prevPrime(int prime) {
		int prim = (prime - 1);
		while( !isPrime(prim) ) {
			prim--;
		} return prim;
	}
	
	public void dynamicResize()
	{
		dynamicResize(nextPrime(2*B));
	}
	
	
	public void dynamicResize(int size)
	{
		HashTable<T> auxTable = new HashTable<T>(size, HashTable.DOUBLE_HASHING, minLF);
		for(HashNode<T> element : associativeArray) {
			if(element.getStatus() == HashNode.VALID) {
				auxTable.add(element.getElement());
			}
		}
		this.associativeArray = auxTable.getAssociativeArray();
		this.B = size;
		this.R = prevPrime(B);
		
	}
}
