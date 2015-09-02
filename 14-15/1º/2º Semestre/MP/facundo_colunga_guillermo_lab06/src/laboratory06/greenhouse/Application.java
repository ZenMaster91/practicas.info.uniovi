package laboratory06.greenhouse;

public class Application 
{	
	public static void main(String[] args) 
	{
		new Application().run();
	}

	public void run() 
	{
		Greenhouse greenhouse = new Greenhouse();

		for (int i = 0; i < 10; i++) {
			greenhouse.add(new TemperatureSensor());
			greenhouse.add(new ManualDoor());
			greenhouse.add(new AutomaticDoor());
			
		}

		greenhouse.operatorLooksThru();
		greenhouse.operatorLooksThru();
		greenhouse.operatorLooksThru();
	}
}
