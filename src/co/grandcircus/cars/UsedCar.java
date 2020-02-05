package co.grandcircus.cars;
/**
 * @author JeannieMcCarthy
 *
 */
public class UsedCar extends Car{
	//instance fields
	private double mileage;
	//constructor
	public UsedCar(String make, String model, int year, double price, double mileage) {
		super(make, model, year, price);
		this.mileage = mileage;
	}
	//Getters & Setters
	private Object getMileage() {
		return mileage;
	}
	//tostring
	@Override
	public String toString() {
		return String.format("%-17s %-17s  %-10d  $%-10.2f   %-10.2f\n", "(Used)"+getMake(), getModel(), getYear(), getPrice(), getMileage());
	}
	
}
