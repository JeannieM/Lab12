package co.grandcircus.cars;
/**
 * @author JeannieMcCarthy
 *
 */
public class Car {
	
	protected String make = "None";
	protected String model = "None";
	protected int year = 0;
	protected double price = 0;
	
	public Car() {
		
	}
	
	public Car(String make, String model, int year, double price) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}

	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return String.format("%-17s %-17s  %-10d  $%-10.2f\n", getMake(), getModel(), getYear(), getPrice());
	}
	
	
	
	
}
