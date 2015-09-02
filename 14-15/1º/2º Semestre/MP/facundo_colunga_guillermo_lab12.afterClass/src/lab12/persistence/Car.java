package lab12.persistence;

public class Car extends Vehicle {

	public Car(int cc, int horsepower, int years, String brand) {
		super(cc, horsepower, years, brand);
	}

	@Override
	public String toString() {
		StringBuilder aux = new StringBuilder();
		aux.append("car\t"+this.getCc());
		aux.append("\t"+this.getHorsepower());
		aux.append("\t"+this.getYears());
		aux.append("\t"+this.getBrand());
		return aux.toString();
	}

	@Override
	public float roadTax() {
		float tax = ((60+this.getHorsepower()+(7*this.getYears())+this.getCc())/12);
		return tax;
	}

}
