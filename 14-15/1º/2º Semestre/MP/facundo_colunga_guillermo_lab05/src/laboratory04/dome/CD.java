package laboratory04.dome;

public class CD extends Item implements Borrowable{

	private String artist;
	private int numberOfTracks;
	private boolean isAvailable;
	
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
		return aux;
	}
	
	@Override
	public boolean equals(Item item) {
		if((item instanceof CD) && (getTitle().equals(item.getTitle())) && (getArtist().equals(((CD) item).getArtist())))
			return true;
		return false;
	}

	@Override
	public boolean isAvailable() {
		return ( this.getOwn() && this.isAvailable );
	}

	@Override
	public boolean borrow() throws Exception {
		if (isAvailable()) {
			boolean previousValue = this.isAvailable;
			this.isAvailable = false;
			return previousValue;
		} throw new Exception("ERROR: The element is not available, you cannot borrow it.");
	}

	@Override
	public void giveBack() {
		this.isAvailable = true;
		
	}

	@Override
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
		
	}
}