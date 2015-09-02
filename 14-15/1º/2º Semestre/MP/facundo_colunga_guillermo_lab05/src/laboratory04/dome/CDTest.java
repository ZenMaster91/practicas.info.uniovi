package laboratory04.dome;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CDTest {
	
	CD cd1;

	@Before
	public void seUp(){
		cd1 = new CD("The Who", "Who", 10, 120);
	}
	
	@Test
	public void getTitleTest() {
		assertEquals("The Who", cd1.getTitle());
	}
	
	@Test
	public void getAuthorTest() {
		assertEquals("Who", cd1.getArtist());
	}
	
	@Test
	public void getNumberOfTracksTest() {
		assertEquals(10, cd1.getNumberOfTracks());
	}

	@Test
	public void getPlayingTimeTest() {
		assertEquals(120, cd1.getPlayingTime());
	}
	
	@Test
	public void getAndSetCommentTest() {
		String comment = "test";
		cd1.setComment(comment);
		assertEquals(comment, cd1.getComment());
	}
	
	@Test
	public void equalsTest() {
		CD cd2 = new CD("The Who", "Who", 10, 120);
		CD cd3 = new CD("Abba: the final", "Abba", 5, 30);
		DVD dvd1 = new DVD("La guerra de los mundos", "Barcenas", 140);
		VideoGame vg1 = new VideoGame("Tomb rider: La cuna de la vida", 3, false, VideoGame.Platform.XBOX);
		Integer two = 2;
		
		//Positive testing.
		assertEquals(true, cd1.equals(cd2));
		
		//Negative Testing.
		assertEquals(false, cd1.equals(cd3));
		
		//Special case [ NEGATIVE ].
		assertEquals(false, cd1.equals(dvd1));
		assertEquals(false, cd1.equals(vg1));
		assertEquals(false, cd1.equals(two)); //Not an Item
		
		
	}
	
	@Test
	public void toStringTest() {
		String aux = "CD: The Who Playing Time: 120 Own:false Artist: Who Tracks: 10 Comment: ";
		assertEquals(aux, cd1.toString());
	}


}
