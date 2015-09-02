package laboratory04.dome;

public class Book extends Item implements Borrowable {
	
	private String author;
	private String isbn;
	private String publisher;
	private boolean isAvailable;

	public Book(String title, String author, String isbn, String publisher, boolean gotIt) {
		super(title, 0, gotIt);
		this.author=author;
		this.isbn=isbn;
		this.publisher=publisher;
	}

	/**
	 * 
	 * @return
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * 
	 * @return
	 */
	public String getIsbn() {
		return isbn;
	}

	/**
	 * 
	 * @return
	 */
	public String getPublisher() {
		return publisher;
	}

	/**
	 * 
	 * @return
	 */
	@Override
	public String toString() {
		StringBuilder aux = new StringBuilder();
		aux.append("Book: "+getTitle()+" Author: "+getAuthor()+" ISBN: "+getIsbn()+" Publisher: "+getPublisher());
		aux.append(" Owned: "+getOwn());
		if(!(getComment()==null))
			aux.append(" Comment: "+getComment());
		return aux.toString();
	}

	/**
	 * 
	 * @param item
	 * @return
	 */
	@Override
	boolean equals(Item item) {
		if((item instanceof Book) && (getTitle().equals(item.getTitle())) && (getIsbn().equals(((Book) item).getIsbn())))
			return true;
		return false;
	}
	
	@Override
	public boolean isAvailable() {
		return this.getOwn() && this.isAvailable;
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
