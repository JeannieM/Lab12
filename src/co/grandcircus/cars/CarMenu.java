package co.grandcircus.cars;

import java.util.*;

/**
 * @author JeannieMcCarthy
 *
 */
public class CarMenu {

	public static ArrayList<Car> getCarList() {

		ArrayList<Car> cars = new ArrayList<>();
		cars.add(new Car("Volkswagon", "Beetle", 2019, 10));
		cars.add(new Car("Porsche", "Boxer", 1999, 20));
		cars.add(new Car("Honda", "Civic", 2004, 7));
		cars.add(new UsedCar("HotWheels", "Flyer", 1967, 4, 79));
		cars.add(new UsedCar("Maserati", "Eruption", 1942, 7, 4));
		cars.add(new UsedCar("Ford", "Luna", 1982, 12, 37));
		return cars;
	}

//	public static HashMap<Integer, Car> getMenu() {
//		HashMap<Integer, Car> menu = new HashMap<>();
//		ArrayList<Car> cars = getCarList();
//		int i = 0;
//		for (Car car : cars) {
//			menu.put(i, car);
//			i++;
//		}
//		return menu;
//	}

	public static void printMenu(ArrayList<Car> cars) {
		System.out.println("\nInventory:\n");
		System.out.printf("   %-17s %-17s  %-10s  %-10s   %-10s\n", "Make", "Model", "Year", "Price", "Mileage");
		System.out.println("........................................................................\n");
		int i = 1;
		for (Car car : cars) {
			if (car instanceof UsedCar) {
				System.out.println(i + "  " + ((UsedCar) car).toString());
			} else {
				System.out.println(i + "  " + car.toString());
			}
			i++;
		}
		System.out.println("" + (cars.size()+1) + " Quit");
	}
}
