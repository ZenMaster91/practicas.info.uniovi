package laboratory06.greenhouse;

public class ManualDoor extends Door 
{
	public ManualDoor() {
		super();
	}
	
	@Override
	public void open() {
		if (!isOpened) {
			System.out.println("  The manual door is being opened.");
			isOpened = true;
		}
	}

	@Override
	public void close() {
		if (isOpened) {
			System.out.println("  The manual door is being closed.");
			isOpened = false;
		}
	}
}
