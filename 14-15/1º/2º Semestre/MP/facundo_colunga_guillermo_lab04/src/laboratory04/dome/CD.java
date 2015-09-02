package laboratory04.dome;

import java.io.PrintStream;

public class CD extends Item {

	private String artist;
	private int numberOfTracks;
	
	public CD(String theTitle, String theArtist, int tracks, int time) {
		super(theTitle, time);
		artist = theArtist;
		numberOfTracks = tracks;
	}
	
	/**
	 * Getter. Gets the name of the Artist.
	 * 
	 * @return the name of the artist as an String.
	 */
	public String getArtist() {
		return this.artist;
	}
	
	/**
	 * Getter. Gets the number of tracks.
	 * 
	 * @return the number of tracks as an integer.
	 */
	public int getNumberOfTracks() {
		return this.numberOfTracks;
	}

	@Override
	public String toString() {
		String aux;
		aux = "CD: " + getTitle() + " Playing Time: " + getPlayingTime() + " Own:" + getOwn() + " Artist: "+getArtist()+" Tracks: "+getNumberOfTracks()+" Comment: "+getComment();
		
		/*aux = "CD: " + getTitle() + " (" + getPlayingTime() + " mins)";
		if (getOwn()) {
			aux=aux+"*";
		} else {
			//
		}
		aux=aux+" " + artist;
		aux=aux+" tracks: " + numberOfTracks;
		aux=aux+" " + getComment();*/
		
		return aux;
	}
	
	@Override
	public boolean equals(Item item) {
		if((item instanceof CD) && (getTitle().equals(item.getTitle())) && (getArtist().equals(((CD) item).getArtist())))
			return true;
		return false;
	}
}