 package laboratory06.greenhouse;

import java.util.ArrayList;

public class Greenhouse 
{
	public static final double MAX_TEMPERATURE = 22;
	public static final double MIN_TEMPERATURE = 19;
	public static final double MAX_HUMIDITY = 22;
	public static final double MIN_HUMIDITY = 19;
	private static final double PERCENTAGE_OF_DOORS = 0.1;
	private static final double PERCENTAGE_OF_SENSORS = 0.1;
	
	private ArrayList<Sensor> sensors = new ArrayList<Sensor>();
	private ArrayList<Door> doors = new ArrayList<Door>();
	private ArrayList<Checkable> checkable = new ArrayList<Checkable>();

	public void add(Sensor sensor) 
	{
		this.sensors.add(sensor);
		if(sensor instanceof Checkable)
			checkable.add((Checkable) sensor);
	}

	public void add(Door door) 
	{
		this.doors.add(door);
		if(door instanceof Checkable)
			checkable.add((Checkable) door);
	}
	
	/**
	 * Simulates the work of an operator that opens and closes the doors
	 * according to the current average temperature.
	 * 
	 * <p>Outside is cold, so opening the doors always involves cooling inside.
	 * 
	 * <p>When the average temperature is greater than {@code MAX_TEMPERATURE}:
	 * <ul>
	 * <li>Some doors should be opened for cooling (if possible)
	 * <li>Each degree of difference (<i>average temperature</i> - {@code MAX_TEMPERATURE}) 
	 *     involves opening the 10% of the doors (if possible)
	 * <li>Shows a message telling how many doors are about to be opened (if possible)
	 * </ul>
	 * 
	 * <p>When the average temperature is lower than {@code MIN_TEMPERATURE}:
	 * <ul>Some doors should be closed for heating (if possible)
	 * <li>Each degree of difference ({@code MIN_TEMPERATURE} - <i>average temperature</i>)
	 *     involves opening 10% of the doors (if possible)
	 * <li>Shows a message telling how many doors are about to be closed (if possible)
	 * </ul>
	 * 
	 * <p>Otherwise, a message showing the average temperature is simply shown in the console.
	 */
	public void operatorLooksThru() 
	{
		if (getAverageTemperature() > MAX_TEMPERATURE) {
			int doorsToBeOpened = (int)((getAverageTemperature() - MAX_TEMPERATURE)*doors.size()*PERCENTAGE_OF_DOORS);
			openSomeDoors(doorsToBeOpened);
		} else if (getAverageTemperature() < MAX_TEMPERATURE) {
			int doorsToBeClosed = (int)((MAX_TEMPERATURE-getAverageTemperature())*doors.size()*PERCENTAGE_OF_DOORS);
			closeSomeDoors(doorsToBeClosed);
		} else if (getAverageHumidity() > MAX_HUMIDITY ) {
			int doorsToBeClosed = (int)((MAX_HUMIDITY-getAverageHumidity())*sensors.size()*PERCENTAGE_OF_SENSORS);
			System.out.println("Openning "+doorsToBeClosed+"irrigations system");
		}else if (getAverageHumidity() < MIN_HUMIDITY ) {
			int doorsToBeClosed = (int)((getAverageHumidity()-MIN_HUMIDITY)*sensors.size()*PERCENTAGE_OF_SENSORS);
			System.out.println("Closing "+doorsToBeClosed+"irrigations system");
		}
	}

	/**
	 * This method Opens some doors agree
	 */
	private void openSomeDoors(int doorsToBeOpened)
	{
		int i=0;
		if(getOpenedDoors() < doorsToBeOpened) {
			doorsToBeOpened = getOpenedDoors(); 
		}
		while( i<doorsToBeOpened ) {
			if(!doors.get(i).isOpened()) {
				doors.get(i).open();
				i++;
			}
		}
		System.out.println("Doors to be opened: "+doorsToBeOpened);
	}
	
	private void closeSomeDoors(int doorsToBeClosed)
	{
		int i=0;
		if(getClosedDoors() < doorsToBeClosed ) {
			doorsToBeClosed = getOpenedDoors(); 
		}
		while( i<doorsToBeClosed ) {
			if(!doors.get(i).isOpened()) {
				doors.get(i).open();
				i++;
			}
		}
		System.out.println("Doors to be opened: "+doorsToBeClosed);
	}

	/**
	 * Gets the current average temperature in the greenhouse. It is the average
	 * of the temperature measurements of all the sensors in the greenhouse. 
	 * 
	 * @return a double value which represents the current average temperature
	 *         in the greenhouse.
	 */
	private double getAverageTemperature() 
	{
		double temperatureSum = 0;
		for(Sensor sensor: sensors)
			if (sensor instanceof TemperatureSensor)
				temperatureSum += ((TemperatureSensor)sensor).getTemperature();
		return temperatureSum / sensors.size();
	}
	
	private double getAverageHumidity()
	{
		double average = 0;
		for (Sensor sensor : sensors)
			if (sensor instanceof HumiditySensor)
				average += ((HumiditySensor)sensor).getHumidity();
		return average / sensors.size();
	}
	
	/**
	 * Getter. Gets the number of opened doors.
	 * 
	 * @return the number of opened doors.
	 */
	private int getOpenedDoors() {
		int aux = 0;
		for (Door current : doors)
			if(current.isOpened()) aux++;
		return aux;
	}
	
	/**
	 * Getter. Gets the number of closed doors.
	 * 
	 * @return the number of opened doors.
	 */
	private int getClosedDoors() {
		int aux = 0;
		for (Door current : doors)
			if(!current.isOpened()) aux++;
		return aux;
	}
	
	/**
	 * Once a month the greenhouse should call to the Electrician to check the 
	 * electronic devices.
	 */
	public void onceAMonthCheck() {
		Electrician.check(checkable);
	}
}
