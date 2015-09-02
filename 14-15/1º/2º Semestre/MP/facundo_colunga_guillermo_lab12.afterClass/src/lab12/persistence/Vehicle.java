package lab12.persistence;

public abstract class Vehicle {
	
	private int cc;
	private int horsepower;
	private int years;
	private String brand;
	
	public Vehicle(int cc, int horsepower, int years, String brand) {
		this.cc = cc;
		this.horsepower = horsepower;
		this.years = years;
		this.brand = brand;
	}
	
	/**
	 * @return the cc
	 */
	public int getCc() {
		return cc;
	}
	
	/**
	 * @param cc the cc to set
	 */
	public void setCc(int cc) {
		this.cc = cc;
	}
	
	/**
	 * @return the horsepower
	 */
	public int getHorsepower() {
		return horsepower;
	}
	
	/**
	 * @param horsepower the horsepower to set
	 */
	public void setHorsepower(int horsepower) {
		this.horsepower = horsepower;
	}
	
	/**
	 * @return the years
	 */
	public int getYears() {
		return years;
	}
	
	/**
	 * @param years the years to set
	 */
	public void setYears(int years) {
		this.years = years;
	}
	
	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}
	
	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public abstract String toString();
	public abstract float roadTax();
}
