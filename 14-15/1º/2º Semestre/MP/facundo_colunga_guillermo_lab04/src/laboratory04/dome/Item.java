package laboratory04.dome;

import java.io.PrintStream;

public abstract class Item {

	private String title, comment;
	private int playingTime;
	private boolean gotIt;

	public Item(String title, int playTime, boolean gotIt) {
		super();
		this.title=title;
		this.playingTime=playTime;
		setOwn(gotIt);
	}
	
	public Item(String title, int playingTime) {
		super();
		this.title=title;
		this.playingTime=playingTime;
		setOwn(false);
		setComment("");
	}

	protected void setComment(String comment) {
		this.comment = comment;
	}

	protected String getComment() {
		if (!(comment == null))
			return comment;
		return "";
	}

	protected void setOwn(boolean ownIt) {
		gotIt = ownIt;
	}

	protected boolean getOwn() {
		return gotIt;
	}

	protected String getTitle() {
		return this.title;
	}

	protected int getPlayingTime() {
		return this.playingTime;
	}
	
	public abstract String toString();

	abstract boolean equals(Item item);

}