package laboratory04.dome;

public class DVD extends Item  {
	private String director;
	public DVD(String theTitle, String theDirector, int time) {
		super(theTitle, time);
		director = theDirector;
	}

	/**
	 * Getter. Gets the director name.
	 * 
	 * @return the name of the director as an String.
	 */
	public String getDirector() {
		return this.director;
	}

	@Override
	public String toString() {
		String aux;
		aux = "DVD: " + getTitle() + " Playing Time: " + getPlayingTime() + " Own:" + getOwn() + " Artist: "+getDirector()+" Comment: "+getComment();
		
		/*aux = "DVD: " + getTitle() + " (" + getPlayingTime() + " mins)";
		if (getOwn()) {
			aux=aux+"*";
		} else {
			//
		}
		aux=aux+" " + director;
		aux=aux+" " + getComment();*/
		
		return aux;
	}

	@Override
	public boolean equals(Item item) {
		if((item instanceof DVD) && (getTitle().equals(item.getTitle())) && (getDirector().equals(((DVD) item).getDirector())))
			return true;
		return false;
	}
}
