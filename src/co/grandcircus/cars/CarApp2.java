package co.grandcircus.cars;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author JeannieMcCarthy
 *
 */
public class CarApp2 {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		int userChoice;
		boolean buy = false;
		boolean goAgain = true;
		ArrayList<Car> cars = CarMenu.getCarList();

		System.out.println("Welcome to Bean's Car Lot");
		do {
			CarMenu.printMenu(cars);

			userChoice = Validator.getInt(scnr, "Enter the number of the car you're interested in: ", 1,
					cars.size() + 1);
			try {
				System.out.println(cars.get(userChoice - 1));
				System.out.println("Would you like to buy this car? (y/n)");
				buy = Validator.goAgain(scnr);// The name of the validator method doesn't really make sense here but the
												// method is applicable
				if (buy) {
					cars.remove(userChoice-1);
				}
			} catch (Exception e) {
				System.out.println("Thank you! Goodbye.");
				break;
			}
		} while (goAgain);
	}

}
