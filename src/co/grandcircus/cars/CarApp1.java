package co.grandcircus.cars;

/**
 * @author JeannieMcCarthy
 *
 */
import java.util.*;

public class CarApp1 {
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		ArrayList<Car> cars = new ArrayList<>();
		
		String make = "None";
		String model = "None";
		int year = 0;
		double price = 0;
		boolean goAgain = false;
		
		System.out.println("Welcome to Bean's Car Lot Admin Panel");
		do {

			make = Validator.getString(scnr, "Enter the make:");
			model = Validator.getString(scnr, "Enter the model:");
			year = Validator.getInt(scnr, "Enter year:", 1900, 2020);
			price = Validator.getDouble(scnr, "Enter price: ", 0, 999999999);
			Car car = new Car(make, model, year, price);
			cars.add(car);

			System.out.println("\nAdd another?");

			goAgain = Validator.goAgain(scnr);
		} while (goAgain);
		
		
		System.out.println("\nInventory:\n");
		System.out.printf("%-17s %-17s  %-10s  %-10s\n", "Make", "Model", "Year", "Price");
		System.out.println(".............................................................\n");


		for (Car car : cars) {
			System.out.println(car.toString());
		}

	}
}
