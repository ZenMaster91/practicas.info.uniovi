package lab11;


import java.util.Random;

/**
 * <p>Title: File</p>
 * <p>Description: Class that simulates a file.</p>
 * <p>Copyright: Copyright (c) 2012</p>
 * <p>Computer Science Engineering School</p>
 * <p>Programming Methodology</p>
 * 
 * @author Lectures of Programming Methodology
 * @version 1.0
 */
class File {
	public static boolean probabilityEnabled = true;
	
	private String fileName;
	private boolean isOpen;
	
	public boolean isOpen() {
		return this.isOpen;
	}
	
	File(String fileName) {
		this.fileName = fileName;
		System.out.printf("Initializing the \"%s\" file.\n", this.fileName);
	}
	
	void open() throws IllegalStateException, IllegalAccessError {
		System.out.printf("Opening the \"%s\" file.\n", fileName);
		if( trueWithProbability(5) )
			throw new IllegalStateException("The file "+fileName+" does not exists.");
		else if( trueWithProbability(5) )
			throw new IllegalAccessError("The file "+fileName+" connot be openned.");
		isOpen = true;
	}
	
	void close() throws IllegalStateException {
		System.out.printf("Closing the \"%s\" file.\n", fileName);	
		if( trueWithProbability(5) ) throw new IllegalStateException("The file "+fileName+" cannot be closed.");
	}
	
	Object read() throws IllegalStateException {
		System.out.printf("Reading from the \"%s\" file.\n", fileName);
		if( trueWithProbability(5) )
			throw new IllegalStateException("The file "+fileName+" cannot be readed. The file is corrupted");
		return null;
	}
	
	void write(Object object) throws IllegalStateException {
		System.out.printf("Writing in the \"%s\" file.\n", fileName);
		if( trueWithProbability(5) ) throw new IllegalStateException("The file "+fileName+" can't be written."
									+ "There's no space...");
	}
	
	private Random random = new Random();
	
	/**
	 * Returns a true value with the probability pointed out by the percentage value 
	 * @param percentage The percentage to return true
	 * @return true with the probability pointed out by the percentage value
	 */
	private boolean trueWithProbability(int percentage) {
		if ( !File.probabilityEnabled ) return false;
		return random.nextInt() % (100/percentage) == 0;
	}
	
}
