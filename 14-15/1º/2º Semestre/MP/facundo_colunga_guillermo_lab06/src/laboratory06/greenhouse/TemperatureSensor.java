package laboratory06.greenhouse;

import java.util.Random;

public class TemperatureSensor extends Sensor implements Checkable 
{
	public int getTemperature() 
	{
		// random number [5,40]
		return new Random(System.currentTimeMillis()).nextInt(36) + 5;
	}

	@Override
	public void check() {
		System.out.println("Temperature Sensor - checked.");
	}
}
