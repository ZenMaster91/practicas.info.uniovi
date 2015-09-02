package lab12.persistence;

public class Truck extends Vehicle {
	
	private int numberOfAxes;
	private int tare;

	public Truck(int cc, int horsepower, int years, String brand, int numberOfAxes, int tare) {
		super(cc, horsepower, years, brand);
		this.numberOfAxes = numberOfAxes;
		this.tare = tare;
	}
	
	public void setTare(int tare) {
		this.tare = tare;
	}
	public int getTare() {
		return this.tare;
	}
	
	public void setNumberOfAxes(int axes) {
		this.numberOfAxes = axes;
	}
	public int getNumberOfAxes() {
		return this.numberOfAxes;
	}

	@Override
	public String toString() {
		StringBuilder aux = new StringBuilder();
		aux.append("truck\t"+this.getCc());
		aux.append("\t"+this.getHorsepower());
		aux.append("\t"+this.getYears());
		aux.append("\t"+this.getBrand());
		aux.append("\t"+this.getNumberOfAxes());
		aux.append("\t"+this.getTare());
		return aux.toString();
	}

	@Override
	public float roadTax() {
		float tax = (float) (100+this.numberOfAxes*10+this.getYears()*20+this.getCc()/6);
		return tax;
	}

}
