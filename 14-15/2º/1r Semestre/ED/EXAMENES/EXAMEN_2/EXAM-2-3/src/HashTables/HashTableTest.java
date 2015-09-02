/**
 * 03.12.14 04.15
 * Guillermo_Facundo_Colunga
 * UO236856
 */
package HashTables;

import static org.junit.Assert.*;

import org.junit.Test;

public class HashTableTest {

	@Test @MartinTest
	public void fTest() {
		// Example from Martin. Re-do at home
		HashTable<Integer> a = new HashTable<Integer>(5, HashTable.LINEAR_PROBING, 0.5);
		assertEquals(2, a.f(7, 0));
		assertEquals(3, a.f(7, 1));
		assertEquals(4, a.f(7, 2));
		assertEquals(0, a.f(7, 3));
				
		// Example from Martin.Re-do at home
		HashTable<Integer> b = new HashTable<Integer>(5, HashTable.QUADRATIC_PROBING, 0.5);
		assertEquals(2, b.f(7, 0));
		assertEquals(3, b.f(7, 1));
		assertEquals(1, b.f(7, 2));
		assertEquals(1, b.f(7, 3));

		// Example from Martin.Re-do at home
		HashTable<Character> c = new HashTable<Character>(5, HashTable.LINEAR_PROBING, 0.5);
		assertEquals(0, c.f('A', 0));
		assertEquals(1, c.f('A', 1));
		assertEquals(2, c.f('A', 2));
		assertEquals(3, c.f('A', 3));
				
		// Example from Martin.Re-do at home
		HashTable<Character> d = new HashTable<Character>(5, HashTable.QUADRATIC_PROBING, 0.5);
		assertEquals(0, d.f('A', 0));
		assertEquals(1, d.f('A', 1));
		assertEquals(4, d.f('A', 2));
		assertEquals(4, d.f('A', 3));

		HashTable<Character> f = new HashTable<Character>(5, HashTable.LINEAR_PROBING, 0.5);
		System.out.println(f.toString());

	} 
	
	@Test
	public void AddSearchTest() {
		// Creating a hashTable.
		HashTable<Integer> a = new HashTable<Integer>(5, HashTable.LINEAR_PROBING, 1.0);
		a.add(4);
		a.add(13);
		a.add(24);
		a.add(3);
			
		assertEquals("[0] (1) = 24 - [1] (1) = 3 - [2] (0) = null - [3] (1) = 13 - [4] (1) = 4 - ", a.toString());
		assertEquals(true, a.search(3));
		assertEquals(false, a.search(12));
	}
	

	@Test
	public void testInt() {
		// Creating a hashTable.
		HashTable<Integer> a = new HashTable<Integer>(5, HashTable.LINEAR_PROBING, 0.5);
		assertEquals(2, a.f(7, 0));
		assertEquals(3, a.f(7, 1));
		assertEquals(4, a.f(7, 2));
		assertEquals(0, a.f(7, 3));

		// Creating a hashTable.
		HashTable<Integer> b = new HashTable<Integer>(5, HashTable.QUADRATIC_PROBING, 0.5);

		assertEquals(2, b.f(7, 0));
		assertEquals(3, b.f(7, 1));
		assertEquals(1, b.f(7, 2));
		assertEquals(1, b.f(7, 3));

	}

	@Test
	public void testChar() {
		// Creating a hashTable.
		HashTable<Character> a = new HashTable<Character>(5, HashTable.LINEAR_PROBING, 0.5);

		assertEquals(0, a.f('A', 0));
		assertEquals(1, a.f('A', 1));
		assertEquals(2, a.f('A', 2));
		assertEquals(3, a.f('A', 3));

		// Creating a hashTable.
		HashTable<Character> b = new HashTable<Character>(5, HashTable.QUADRATIC_PROBING, 0.5);

		assertEquals(0, b.f('A', 0));
		assertEquals(1, b.f('A', 1));
		assertEquals(4, b.f('A', 2));
		assertEquals(4, b.f('A', 3));

	}

	@Test
	public void testAdd() {
		// Creating a hashTable.
		HashTable<Integer> a = new HashTable<Integer>(5, HashTable.LINEAR_PROBING, 1.0);
		a.add(4);
		a.add(13);
		a.add(24);
		a.add(3);

		assertEquals("[0] (1) = 24 - [1] (1) = 3 - [2] (0) = null - [3] (1) = 13 - [4] (1) = 4 - ", a.toString());
		assertEquals(true, a.search(3));
		assertEquals(false, a.search(12));

		// Creating a hashTable.
		HashTable<Integer> b = new HashTable<Integer>(5, HashTable.QUADRATIC_PROBING, 1.0);
		b.add(4);
		b.add(13);
		b.add(24);
		b.add(3);

		assertEquals("[0] (1) = 24 - [1] (0) = null - [2] (1) = 3 - [3] (1) = 13 - [4] (1) = 4 - ", b.toString());
		
		//SearchMetod
		assertEquals(true, b.search(13));
		assertEquals(false, b.search(88));

	}

	@Test
	public void testRemove() {
		// Creating a hashTable.
		HashTable<Integer> a = new HashTable<Integer>(5, HashTable.LINEAR_PROBING, 1.0);
		
		//Adding some nodes.
		a.add(4);
		a.add(13);
		a.add(24);
		a.add(3);
		System.out.println(a.toString());
		
		//Removing one node.
		a.remove(24);
		
		//Checking that the remove method works.
		assertEquals(true, a.search(3));
		System.out.println(a.toString());
		assertEquals("[0] (2) = 24 - [1] (1) = 3 - [2] (0) = null - [3] (1) = 13 - [4] (1) = 4 - ", a.toString());
		
		//Adding one node.
		a.add(15);
		assertEquals(true, a.search(3));
		assertEquals("[0] (1) = 15 - [1] (1) = 3 - [2] (0) = null - [3] (1) = 13 - [4] (1) = 4 - ", a.toString());

	}
	
	@Test
	public void testPrimes() {
		
		//Possitive testing
			//Checking for some primes
			assertTrue(HashTable.isPrime(0));
			assertTrue(HashTable.isPrime(1));
			assertTrue(HashTable.isPrime(3));
			assertTrue(HashTable.isPrime(5));
			assertTrue(HashTable.isPrime(7));
			assertTrue(HashTable.isPrime(13));
			
			//Checking for negative values.
			assertTrue(HashTable.isPrime(-199));
		
		//Negative testing for isPrime.
			assertFalse(HashTable.isPrime(8));
			assertFalse(HashTable.isPrime(4));
			assertFalse(HashTable.isPrime(16));
		
		//Check the nextPrime
		assertEquals(5, HashTable.nextPrime(3));
		assertEquals(211, HashTable.nextPrime(199));
		assertEquals(211, HashTable.nextPrime(200));
		
		//Check the prevPrime
		assertEquals(5, HashTable.prevPrime(7));
		
		//Check the prevPrime
		assertEquals(367, HashTable.prevPrime(373));
	}
	
	//Martin Test.
	@Test @MartinTest
	public void martinPrimeNumber()
	{
		// Example
		HashTable<Integer> a = new HashTable<Integer>(5, HashTable.LINEAR_PROBING, 1.0);
		
		
		assertEquals(2, a.nextPrime(1));
		assertEquals(3, a.nextPrime(2));
		assertEquals(5, a.nextPrime(3));
		assertEquals(5, a.nextPrime(4));
		assertEquals(7, a.nextPrime(5));
		assertEquals(7, a.nextPrime(6));
		assertEquals(11, a.nextPrime(7));
		assertEquals(11, a.nextPrime(8));
		assertEquals(11, a.nextPrime(9));
		assertEquals(11, a.nextPrime(10));
		assertEquals(13, a.nextPrime(11));
		
		assertEquals(13, a.prevPrime(15));
		assertEquals(13, a.prevPrime(14));
		assertEquals(11, a.prevPrime(13));
		assertEquals(11, a.prevPrime(12));
		assertEquals(7, a.prevPrime(11));
		assertEquals(7, a.prevPrime(10));
		assertEquals(7, a.prevPrime(9));
		assertEquals(7, a.prevPrime(8));
		assertEquals(5, a.prevPrime(7));
		assertEquals(5, a.prevPrime(6));
		assertEquals(3, a.prevPrime(5));
		assertEquals(3, a.prevPrime(4));
		assertEquals(2, a.prevPrime(3));
	}
	
	@Test @MartinTest
	public void doubleHashingTest()
	{
		// Example
		HashTable<Integer> c = new HashTable<Integer>(5, HashTable.DOUBLE_HASHING, 0.5);
		assertEquals(2, c.f(7, 0));
		assertEquals(4, c.f(7, 1));
		assertEquals(1, c.f(7, 2));
		assertEquals(3, c.f(7, 3));
				
		/// Example
		HashTable<Character> d = new HashTable<Character>(5, HashTable.DOUBLE_HASHING, 0.5);
		assertEquals(0, d.f('A', 0));
		assertEquals(1, d.f('A', 1));
		assertEquals(2, d.f('A', 2));
		assertEquals(3, d.f('A', 3));
	}
	
	@Test @MartinTest
	public void completeTest()
	{
		// Example
		HashTable<Integer> c = new HashTable<Integer>(5, HashTable.DOUBLE_HASHING, 1.0);
		c.add(4);
		c.add(13);
		c.add(24);
		c.add(3);		
		assertEquals("[0] (0) = null - [1] (1) = 3 - [2] (1) = 24 - [3] (1) = 13 - [4] (1) = 4 - ", c.toString());
		c.remove(24);
		assertEquals("[0] (0) = null - [1] (1) = 3 - [2] (2) = 24 - [3] (1) = 13 - [4] (1) = 4 - ", c.toString());
		assertEquals(true, c.search(3));
		c.add(15);
		assertEquals(true, c.search(3));
		assertEquals("[0] (1) = 15 - [1] (1) = 3 - [2] (2) = 24 - [3] (1) = 13 - [4] (1) = 4 - ", c.toString());		
	}
	
	@Test @MartinTest
	public void dynamicResizingTest()
	{
		// Example
		HashTable<Integer> a = new HashTable<Integer>(5, HashTable.LINEAR_PROBING, 0.5);
		a.add(4);
		assertEquals (0.2, a.getLF(), 0.1);
		a.add(13);
		assertEquals (0.4, a.getLF(), 0.1);
		assertEquals ("[0] (0) = null - [1] (0) = null - [2] (0) = null - [3] (1) = 13 - [4] (1) = 4 - ", a.toString());
		 
		a.add(24); // DINAMIC RESIZING!
		assertEquals (0.27, a.getLF(), 0.1);
		assertEquals("[0] (0) = null - [1] (0) = null - [2] (1) = 24 - [3] (1) = 13 - [4] (1) = 4 - [5] (0) = null - [6] (0) = null - [7] (0) = null - [8] (0) = null - [9] (0) = null - [10] (0) = null - ", a.toString());

	}
}


