package laboratory04.dome;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class VideoGameTest {

	VideoGame vg1;
	VideoGame vg2;
	VideoGame vg3;
	@Before
	public void setUp() {
		vg1 = new VideoGame("Tomb rider: La cuna de la vida", 3, false, VideoGame.Platform.XBOX);
		vg2 = new VideoGame("Bob Esponja: La aventura", 5, true, VideoGame.Platform.NINTENDO);
		vg3 = new VideoGame("Spiderman y la araña", 1, true, VideoGame.Platform.PLAYSTATION);
	}
	
	@Test
	public void getTitleTest() 
	{
		//Testing with the setUp
		assertEquals("Tomb rider: La cuna de la vida", vg1.getTitle());
		assertEquals("Bob Esponja: La aventura", vg2.getTitle());
		assertEquals("Spiderman y la araña", vg3.getTitle());
	}
	
	@Test
	public void numberOfPlayersTest()
	{
		//Testing with the setUp
		assertEquals(3, vg1.getNumberOfPlayers());
		assertEquals(5, vg2.getNumberOfPlayers());
		assertEquals(1, vg3.getNumberOfPlayers());
		
		//Changing some NumberOfPlayers...
		vg1.setNumberOfPlayers(2);
		assertEquals(2, vg1.getNumberOfPlayers());
		vg2.setNumberOfPlayers(4);
		assertEquals(4, vg2.getNumberOfPlayers());
		vg3.setNumberOfPlayers(3);
		assertEquals(3, vg3.getNumberOfPlayers());
		
		//Testing some bad inputs
		vg1.setNumberOfPlayers(0);
		assertEquals(2, vg1.getNumberOfPlayers());
		vg1.setNumberOfPlayers(-1);
		assertEquals(2, vg1.getNumberOfPlayers());
	}
	
	@Test
	public void gotItTest()
	{
		//Testing with the setUp
		assertEquals(false, vg1.getOwn());
		assertEquals(true, vg2.getOwn());
		assertEquals(true, vg3.getOwn());
		
			//Positive testing.
			vg1.setOwn(true);
			assertEquals(true, vg1.getOwn());
			assertEquals(true, vg2.getOwn());
			assertEquals(true, vg3.getOwn());
			
			//Negative testing
			vg1.setOwn(false);
			assertEquals(false, vg1.getOwn());
			vg2.setOwn(false);
			assertEquals(false, vg2.getOwn());
			vg3.setOwn(false);
			assertEquals(false, vg3.getOwn());
	}
	
	@Test
	public void platformTest()
	{
		
		//Testing with the setUp
		assertEquals(VideoGame.Platform.XBOX, vg1.getPlatform());
		assertEquals(VideoGame.Platform.NINTENDO, vg2.getPlatform());
		assertEquals(VideoGame.Platform.PLAYSTATION, vg3.getPlatform());
		
		//Setter testing
		vg1.setPlatform(VideoGame.Platform.NINTENDO);
		assertEquals(VideoGame.Platform.NINTENDO, vg1.getPlatform());
		vg2.setPlatform(VideoGame.Platform.XBOX);
		assertEquals(VideoGame.Platform.XBOX, vg2.getPlatform());
		vg3.setPlatform(VideoGame.Platform.NINTENDO);
		assertEquals(VideoGame.Platform.NINTENDO, vg3.getPlatform());
		
		//Testing errors.
		vg1.setPlatform(null);
		assertEquals(VideoGame.Platform.NINTENDO, vg1.getPlatform());
		vg2.setPlatform(null);
		assertEquals(VideoGame.Platform.XBOX, vg2.getPlatform());
		vg3.setPlatform(null);
		assertEquals(VideoGame.Platform.NINTENDO, vg3.getPlatform());
	}
	
	@Test
	public void equalsTest() {
		VideoGame vg2 = new VideoGame("Tomb rider: La cuna de la vida", 3, false, VideoGame.Platform.XBOX);
		VideoGame vg3 = new VideoGame("Bob Esponja: La aventura", 5, true, VideoGame.Platform.NINTENDO);
		CD cd1 = new CD("The Who", "Who", 10, 120);
		DVD dvd1 = new DVD("La fabrica de pedos 2", "Falete", 200);
		Integer two = 2;
		
		//Positive testing.
		assertEquals(true, vg1.equals(vg2));
		
		//Negative Testing.
		assertEquals(false, vg1.equals(vg3));
		
		//Special case [ NEGATIVE ].
		assertEquals(false, vg1.equals(cd1));
		assertEquals(false, vg1.equals(dvd1));
		assertEquals(false, vg1.equals(two)); //Not an Item
		
		
	}
	
	@Test
	public void toStringTest() {
		//vg1 = new VideoGame("Tomb rider: La cuna de la vida", 3, false, VideoGame.Platform.XBOX);
		String aux = "VideoGame: Tomb rider: La cuna de la vida Players: 3 Own:false Platform: XBOX Comment: ";
		assertEquals(aux, vg1.toString());
	}



}
