package laboratory04.algorithms;

import static org.junit.Assert.*;
import laboratory04.dome.CD;

import org.junit.Before;
import org.junit.Test;

public class AlgorithmsTest {
	
	CD cd1 = new CD("The Who", "Who", 10, 120);
	CD cd2 = new CD("Sky", "Manolo", 9, 20);
	CD cd3 = new CD("Grand Piano", "Adele", 8, 10);
	CD cd4 = new CD("Cantajuegos", "Manolita", 7, 60);
	CD[] CDArray = {cd1,cd2,cd3, cd4};
	
	String[] StringArray = {"Hi","Caracola","What","s","up"};
	Integer[] intArray = {1,2,3,4,5};
	Character[] charArray = {'a','b','c','d'};
	
	Object[] mixedArray = {"A", 'A', 0, cd1};


	@Test
	public void searchTest() {
		
		//Array of Strings.
		assertEquals(0, Algorithms.search(StringArray, "Hi"));
		assertEquals(1, Algorithms.search(StringArray, "Caracola"));
		assertEquals(2, Algorithms.search(StringArray, "What"));
		assertEquals(3, Algorithms.search(StringArray, "s"));
		assertEquals(4, Algorithms.search(StringArray, "up"));
		
		//Array of Integers (as objects. Not primitive types.)
		assertEquals(0, Algorithms.search(intArray, 1));
		assertEquals(1, Algorithms.search(intArray, 2));
		assertEquals(2, Algorithms.search(intArray, 3));
		assertEquals(3, Algorithms.search(intArray, 4));
		assertEquals(4, Algorithms.search(intArray, 5));
		
		//Array of Characters (as objects. Not primitive types.)
		assertEquals(0, Algorithms.search(charArray, 'a'));
		assertEquals(1, Algorithms.search(charArray, 'b'));
		assertEquals(2, Algorithms.search(charArray, 'c'));
		assertEquals(3, Algorithms.search(charArray, 'd'));
		
		//Array of CD's.
		assertEquals(0, Algorithms.search(CDArray, cd1));
		assertEquals(1, Algorithms.search(CDArray, cd2));
		assertEquals(2, Algorithms.search(CDArray, cd3));
		assertEquals(3, Algorithms.search(CDArray, cd4));
		
		//MixedArray: Strings, Integers, Characters and CD's.
		assertEquals(0, Algorithms.search(mixedArray, "A"));
		assertEquals(1, Algorithms.search(mixedArray, 'A'));
		assertEquals(2, Algorithms.search(mixedArray, 0));
		assertEquals(3, Algorithms.search(mixedArray, cd1));
		
		//Error testing.
		//[ First with the ArrayString as not equals to the error. Then Random values and the error as result. ]
		assertNotEquals(Algorithms.ERROR, Algorithms.search(StringArray, "Hi"));
		assertNotEquals(Algorithms.ERROR, Algorithms.search(StringArray, "Caracola"));
		assertNotEquals(Algorithms.ERROR, Algorithms.search(StringArray, "What"));
		assertNotEquals(Algorithms.ERROR, Algorithms.search(StringArray, "s"));
		assertNotEquals(Algorithms.ERROR, Algorithms.search(StringArray, "up"));
		
		assertEquals(Algorithms.ERROR, Algorithms.search(StringArray, "H"));
		assertEquals(Algorithms.ERROR, Algorithms.search(StringArray, ""));
		assertEquals(Algorithms.ERROR, Algorithms.search(StringArray, null));
		assertEquals(Algorithms.ERROR, Algorithms.search(StringArray, 1));
		assertEquals(Algorithms.ERROR, Algorithms.search(StringArray, 'a'));
		assertEquals(Algorithms.ERROR, Algorithms.search(StringArray, cd1));
	}

}
