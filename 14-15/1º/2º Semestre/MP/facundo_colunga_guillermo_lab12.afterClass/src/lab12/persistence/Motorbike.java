package lab12.persistence;

public class Motorbike extends Vehicle {

	public Motorbike(int cc, int horsepower, int years, String brand) {
		super(cc, horsepower, years, brand);
	}

	@Override
	public String toString() {
		StringBuilder aux = new StringBuilder();
		aux.append("motorbike\t"+this.getCc());
		aux.append("\t"+this.getHorsepower());
		aux.append("\t"+this.getYears());
		aux.append("\t"+this.getBrand());
		return aux.toString();
	}

	@Override
	public float roadTax() {
		float tax = (float) (30+this.getCc()*0.5+10*this.getYears());
		return tax;
	}

}
