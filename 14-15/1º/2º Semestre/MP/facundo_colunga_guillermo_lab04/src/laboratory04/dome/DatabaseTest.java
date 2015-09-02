package laboratory04.dome;

import static org.junit.Assert.*;

import java.io.PrintStream;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class DatabaseTest {
	
	private Database db;
	private CD cd1, cd2, cd3, cd4;
	private DVD dvd1, dvd2, dvd3, dvd4;
	private VideoGame vg1, vg2, vg3;
	
	@Before
	public void setUp() {
		//Creating the database.
		db = new Database();
		
		//Creating some CD's.
		cd1 = new CD("The Who", "Who", 10, 120);
		cd2 = new CD("Sky", "Manolo", 9, 20);
		cd3 = new CD("Grand Piano", "Adele", 8, 10);
		cd4 = new CD("Cantajuegos", "Manolita", 7, 60);
		
		//Creating some DVD's
		dvd1 = new DVD("La guerra de los mundos", "Barcenas", 140);
		dvd2 = new DVD("Camino al infierno", "Pepe", 180);
		dvd3 = new DVD("A veces pasa", "Se�orSonoro", 20);
		dvd4 = new DVD("Solo en casa 2", "Steven", 160);
		
		//Creating some VideoGames
		vg1 = new VideoGame("Tomb rider: La cuna de la vida", 3, false, VideoGame.Platform.XBOX);
		vg2 = new VideoGame("Bob Esponja: La aventura", 5, true, VideoGame.Platform.NINTENDO);
		vg3 = new VideoGame("Spiderman y la araña", 1, true, VideoGame.Platform.PLAYSTATION);
	
	}

	@Test
	public void getDatabaseTest() {
		//Adding parameters to the DataBase.
		db.add(cd1); db.add(cd2); db.add(cd3); db.add(cd4);
		db.add(dvd1); db.add(dvd2); db.add(dvd3); db.add(dvd4);
		db.add(vg1); db.add(vg2); db.add(vg3);
		
		//Creating a result example.
		ArrayList<Item> result = new ArrayList<Item>();
		result.add(cd1); result.add(cd2); result.add(cd3); result.add(cd4);
		result.add(dvd1); result.add(dvd2); result.add(dvd3); result.add(dvd4);
		result.add(vg1); result.add(vg2); result.add(vg3);
		
		//Testing...
		assertEquals(result, db.getDatabase());
		db.list();
	}
	
	@Test
	public void addTest(){
		//Positive tests.
		//CD.
		assertEquals(true, db.add(cd1));
		assertEquals(true, db.add(cd2));
		assertEquals(true, db.add(cd3));
		assertEquals(true, db.add(cd4));
		//DVD
		assertEquals(true, db.add(dvd1));
		assertEquals(true, db.add(dvd2));
		assertEquals(true, db.add(dvd3));
		assertEquals(true, db.add(dvd4));
		
		//Negative test.
		//CD
		assertEquals(false, db.add(cd1));
		assertEquals(false, db.add(cd2));
		assertEquals(false, db.add(cd3));
		assertEquals(false, db.add(cd4));
		//DVD
		assertEquals(false, db.add(dvd1));
		assertEquals(false, db.add(dvd2));
		assertEquals(false, db.add(dvd3));
		assertEquals(false, db.add(dvd4));
	}

	@Test
	public void searchTest()
	{
		//Adding some items to the DataBase.
		db.add(cd1);
		db.add(dvd1);
		db.add(vg1);
		
		//Creating some like"objects".
		CD likecd1 = cd1;
		DVD likedvd1 = dvd1;
		VideoGame likevg1 = vg1;
		CD notNullcd = new CD("The Who", "Who", 1, 12); //CD in the db only same title and artist.
		CD nullcd = new CD("blabla", "False", 9, 20); //CD not in the db.
		
		assertEquals(cd1, db.search(likecd1));
		assertEquals(cd1, db.search(notNullcd));//CD with different playtime and tracks
		assertEquals(dvd1, db.search(likedvd1));
		assertEquals(vg1, db.search(likevg1));
		
		assertEquals(null, db.search(nullcd));
		
	}
}
