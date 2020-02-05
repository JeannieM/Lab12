package co.grandcircus.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import co.grandcircus.cars.Car;

class CarApp1Test {

	@Test
	void testReturnsANiceChart() {
		Car car = new Car("Volkswagon", "Beetle", 2019, 10);
		String format = String.format("%-17s %-17s  %-10d  $%-10.2f\n", "Volkswagon", "Beetle", 2019, 10);
		assertEquals(format, car.toString());
	}

}
