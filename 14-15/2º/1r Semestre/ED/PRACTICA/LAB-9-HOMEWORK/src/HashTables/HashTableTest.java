package HashTables;

import static org.junit.Assert.*;

import org.junit.Test;

public class HashTableTest {

	@Test
	public void fTest() {
		// Example from Martin.
		HashTable<Integer> a = new HashTable<Integer>(5, HashTable.LINEAR_PROBING, 0.5);
		assertEquals(2, a.f(7, 0));
		assertEquals(3, a.f(7, 1));
		assertEquals(4, a.f(7, 2));
		assertEquals(0, a.f(7, 3));
				
		// Example from Martin.
		HashTable<Integer> b = new HashTable<Integer>(5, HashTable.QUADRATIC_PROBING, 0.5);
		assertEquals(2, b.f(7, 0));
		assertEquals(3, b.f(7, 1));
		assertEquals(1, b.f(7, 2));
		assertEquals(1, b.f(7, 3));

		// Example from Martin.
		HashTable<Character> c = new HashTable<Character>(5, HashTable.LINEAR_PROBING, 0.5);
		assertEquals(0, c.f('A', 0));
		assertEquals(1, c.f('A', 1));
		assertEquals(2, c.f('A', 2));
		assertEquals(3, c.f('A', 3));
				
		// Example from Martin.
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
		// Example
			HashTable<Integer> a = new HashTable<Integer>(5, HashTable.LINEAR_PROBING, 1.0);
			a.add(4);
			a.add(13);
			a.add(24);
			a.add(3);
			
			assertEquals("[0] (1) = 24 - [1] (1) = 3 - [2] (0) = null - [3] (1) = 13 - [4] (1) = 4 - ", a.toString());
			assertEquals(true, a.search(3));
			assertEquals(false, a.search(12));
	}

}
