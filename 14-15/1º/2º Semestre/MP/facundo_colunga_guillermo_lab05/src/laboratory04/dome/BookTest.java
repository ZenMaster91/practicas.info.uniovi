package laboratory04.dome;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BookTest {

	Book b1;
	
	@Before
	public void setUp() {
		b1 = new Book("Capitán", "Eduardo", "978-84-8181-227-5", "EDB", true);
	}

	@Test
	public void getTitleTest() {
		assertEquals("Capitán", b1.getTitle());
	}
	
	@Test
	public void getAuthorTest() {
		assertEquals("Eduardo", b1.getAuthor());
	}
	
	@Test
	public void getISBNTest() {
		assertEquals("978-84-8181-227-5", b1.getIsbn());
	}
	
	@Test
	public void getPublisher() {
		assertEquals("EDB", b1.getPublisher());
	}
	
	@Test
	public void toStringTest() {
		String aux = "Book: Capitán Author: Eduardo ISBN: 978-84-8181-227-5 Publisher: EDB Owned: true Comment: ";
		assertEquals(aux, b1.toString());
	}

	@Test
	public void equalsTest() {
		Book b2 = new Book("Capitán", "Eduardo", "978-84-8181-227-5", "EDB", true);
		Book b3 = new Book("Perseo", "María", "730-17-6732-847-4", "Lucanor", false);
		
		assertEquals(true, b1.equals(b2));
		assertEquals(false, b1.equals(b3));
	}
	
	@Test
	public void isAvailableTest() throws Exception {
		Book b2 = new Book("Capitán", "Eduardo", "978-84-8181-227-5", "EDB", true);
		Book b3 = new Book("Perseo", "María", "730-17-6732-847-4", "Lucanor", true);
		b1.giveBack();
		b3.giveBack();
		
		//Positive testing.
		assertEquals(true, b1.isAvailable());
		assertEquals(true, b3.isAvailable());
		
		//Negative testing
		assertEquals(false, b2.isAvailable());
		b1.borrow();
		assertEquals(false, b1.isAvailable());
	}
	
	@Test
	public void giveBackTest() {
		Book b2 = new Book("Capitán", "Eduardo", "978-84-8181-227-5", "EDB", true);
		Book b3 = new Book("Perseo", "María", "730-17-6732-847-4", "Lucanor", true);
		
		assertEquals(false, b1.isAvailable());
		assertEquals(false, b2.isAvailable());
		assertEquals(false, b3.isAvailable());
		
		b1.giveBack();
		b2.giveBack();
		b3.giveBack();
		
		assertEquals(true, b1.isAvailable());
		assertEquals(true, b2.isAvailable());
		assertEquals(true, b3.isAvailable());
	}
}
