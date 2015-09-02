package laboratory04.dome;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DVDTest {
	
	DVD dvd1;

	@Before
	public void setUp() {
		dvd1 = new DVD("La guerra de los mundos", "Barcenas", 140);
	}
	
	@Test
	public void getTitleTest() {
		assertEquals("La guerra de los mundos", dvd1.getTitle());
	}
	
	@Test
	public void getDirectorTest() {
		assertEquals("Barcenas", dvd1.getDirector());
	}
	
	@Test
	public void getPlayingTimeTest() {
		assertEquals(140, dvd1.getPlayingTime());
	}
	
	@Test
	public void equalsTest() {
		DVD dvd2 = new DVD("La guerra de los mundos", "Barcenas", 140);
		DVD dvd3 = new DVD("La fabrica de pedos 2", "Falete", 200);
		CD cd1 = new CD("The Who", "Who", 10, 120);
		VideoGame vg1 = new VideoGame("Tomb rider: La cuna de la vida", 3, false, VideoGame.Platform.XBOX);
		Integer two = 2;
		
		//Positive testing.
		assertEquals(true, dvd1.equals(dvd2));
		
		//Negative Testing.
		assertEquals(false, dvd1.equals(dvd3));
		
		//Special case [ NEGATIVE ].
		assertEquals(false, dvd1.equals(cd1));
		assertEquals(false, dvd1.equals(vg1));
		assertEquals(false, dvd1.equals(two)); //Not an Item
	}
	
	@Test
	public void toStringTest() {
		String aux = "DVD: La guerra de los mundos Playing Time: 140 Own:false Artist: Barcenas Comment: ";
		assertEquals(aux, dvd1.toString());
	}

}
