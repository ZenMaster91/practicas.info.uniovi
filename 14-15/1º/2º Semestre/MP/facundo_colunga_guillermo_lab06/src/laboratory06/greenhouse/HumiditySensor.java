package laboratory06.greenhouse;

import java.util.Random;

public class HumiditySensor extends Sensor implements Checkable 
{
	/**
	 * Getter. Generates a random value for the humidity.
	 * 
	 * @return a random number between 5 and 50.
	 */
	public int getHumidity() 
	{
		// random number [5,40]
		return new Random(System.currentTimeMillis()).nextInt(36) + 5;
	}

	@Override
	public void check() {
		System.out.println("Humidity Sensor - checked.");
	}
}
