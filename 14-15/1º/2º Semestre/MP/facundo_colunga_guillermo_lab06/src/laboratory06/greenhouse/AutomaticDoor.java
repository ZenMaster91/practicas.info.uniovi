package laboratory06.greenhouse;

public class AutomaticDoor extends Door implements Checkable
{
	public AutomaticDoor() {
		super();
	}
	
	@Override
	public void open() {
		if (!isOpened) {
			System.out.println("  The automatic door is being opened.");
			isOpened = true;
		}
	}

	@Override
	public void close() {
		if (isOpened) {
			System.out.println("  The automatic door is being closed.");
			isOpened = false;
		}
	}

	@Override
	public void check() {
		System.out.println("Automatic Door - checked.");
	}

	
}
