package laboratory04.dome;

import java.io.PrintStream;

public class VideoGame extends Item {

	//Properties
	private int numberOfPlayers;
	
	public enum Platform {XBOX, PLAYSTATION, NINTENDO};
	private Platform platform;
	
	/**
	 * Main constructor.
	 * 
	 * @param title The title of the VideoGame
	 * @param numberOfPlayers The number of players for this game.
	 * @param gotIt True if it is owned, false otherwise.
	 * @param platform The platform as an String. Values accepted {XBox, PlayStation or Nintendo}.
	 */
	public VideoGame(String title, int numberOfPlayers, boolean gotIt, Platform platform) {
		super(title, 0, gotIt);
		setNumberOfPlayers(numberOfPlayers);
		setPlatform(platform);
	}
	
	/**
	 * Getter. Gets the number of players for this game.
	 * 
	 * @return the number of players as an integer.
	 */
	public int getNumberOfPlayers() {
		return numberOfPlayers;
	}
	
	/**
	 * Setter. Sets the number of players.
	 * 
	 * @param numberOfPlayers for this game.
	 */
	public void setNumberOfPlayers(int numberOfPlayers) {
		if ( numberOfPlayers > 0 )
			this.numberOfPlayers = numberOfPlayers;
	
	}
	
	/**
	 * Getter. Gets the platform for this game.
	 * 
	 * @return th platform as an String.
	 */
	public Platform getPlatform() {
		return platform;
	}
	
	/**
	 * Setter. Sets the platform.
	 * 
	 * @param platform of the current game. (String)
	 */
	public void setPlatform(Platform platform) {
		if(!(platform == null))
			this.platform = platform;
	}
	
	/**
	 * Print method. Overrides the information of the superclass print method and prints
	 * all the necessary information about the game.
	 */
	@Override
	public String toString() {
		String aux;
		aux = "CD: " + getTitle() + " Players: " + getNumberOfPlayers() + " Own:" + getOwn() + " Platform: "+getPlatform()+ " Comment: "+getComment();
		
		/*aux = ("VideoGame: " + getTitle() + " (" + getNumberOfPlayers() + " players)");
		if (getOwn()) {
			aux = aux+("*");
		} else {
			//
		}
		aux = aux + (" for " + getPlatform());
		if (!(getComment()==null))
			aux = aux+(" " + getComment());*/
		
		return aux;
	}
	
	
	@Override
	public boolean equals(Item item) {
		if((item instanceof VideoGame) && (getTitle().equals(item.getTitle())) && (getPlatform().equals(((VideoGame) item).getPlatform())))
			return true;
		return false;
	}
}
