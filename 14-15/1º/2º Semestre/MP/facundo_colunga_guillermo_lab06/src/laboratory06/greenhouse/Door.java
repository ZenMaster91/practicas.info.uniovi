package laboratory06.greenhouse;

public abstract class Door {

	protected boolean isOpened = false;

	public Door() {
		super();
	}

	public boolean isOpened() {
		return isOpened;
	}

	public abstract void open();

	public abstract void close();

}