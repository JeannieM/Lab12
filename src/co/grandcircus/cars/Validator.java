package co.grandcircus.cars;

import java.util.Scanner;

public class Validator {

	/**
	 * Get any valid integer.
	 */
	public static int getInt(Scanner scnr, String prompt) {
		// This approach use "hasNext" look ahead.
		System.out.print(prompt);
		while (!scnr.hasNextInt()) {
			scnr.nextLine(); // clear bad line.
			System.out.println("Sorry, I can't read that. Enter a whole number, using digits.");
			System.out.println(prompt);
		}
		int result = scnr.nextInt();
		scnr.nextLine(); // clear for next line of input.
		return result;
	}

	/**
	 * Get any valid double.
	 */
	public static double getDouble(Scanner scnr, String prompt) {
		// This approach use "hasNext" look ahead.
		boolean isValid = false;
		do {
			System.out.print(prompt);
			isValid = scnr.hasNextDouble();
			if (!isValid) {
				scnr.nextLine(); // clear bad line.
				System.out.println("Sorry, I can't read that. Enter a number, using digits.");
			}
		} while (!isValid);

		double number = scnr.nextDouble();
		scnr.nextLine(); // clear for next line of input.
		return number;
	}

	/**
	 * Get any string.
	 */
	public static String getString(Scanner scnr, String prompt) {
		// This approach uses exception handling.
		System.out.print(prompt);
		return scnr.nextLine();
	}

	/**
	 * Get any valid integer between min and max.
	 */
	public static int getInt(Scanner scnr, String prompt, int min, int max) {
		boolean isValid = false;
		int number;
		do {
			number = getInt(scnr, prompt);

			if (number < min) {
				isValid = false;
				System.out.println("The number must be at least " + min);
			} else if (number > max) {
				isValid = false;
				System.out.println("The number must not be larger than " + max);
			} else {
				isValid = true;
			}

		} while (!isValid);
		return number;
	}

	/**
	 * Get any valid double between min and max.
	 */
	public static double getDouble(Scanner scnr, String prompt, double min, double max) {
		boolean isValid = false;
		double number;
		do {
			number = getDouble(scnr, prompt);

			if (number < min) {
				isValid = false;
				System.out.println("The number must be at least " + min);
			} else if (number > max) {
				isValid = false;
				System.out.println("The number must not be larger than " + max);
			} else {
				isValid = true;
			}

		} while (!isValid);
		return number;
	}

	/**
	 * Get a string of input from the user that must match the given regex.
	 */
	public static String getStringMatchingRegex(Scanner scnr, String prompt, String regex) {
		boolean isValid = false;
		String input;
		do {
			input = getString(scnr, prompt);

			if (input.matches(regex)) {
				isValid = true;
			} else {
				System.out.println("Input must match the appropriate format.");
				isValid = false;
			}

		} while (!isValid);
		return input;
	}
	/**
	 * Get a yes or no from the user.
	 */
	public static String yesOrNo(Scanner scnr) {
		
		String input;
		//boolean tryAgain = true;//see below
		input = scnr.nextLine();
		//scnr.nextLine();//My pathetic attempts to clear the scanner lol
		do {
			
			if (input.toLowerCase().startsWith("y")) {
				return "yes";
			}
			else if (input.toLowerCase().startsWith("n")){
				return "no";	
			}
			else {
				System.err.println("Please enter either yes or no: ");
				input = scnr.nextLine();
				//scnr.nextLine();//clear?
			}
			
		}while(true);//use this to always loop unless the loop has been escaped! 
		//If use variable boolean instead, method isn't sure that the variable will always be true
		//and method will require a return value outside the loop
		//return "Error reading user input. No yes or no detected.";
	}
	/**
	 * Return a true or a false based on the response for the above Validator
	 */
	public static boolean goAgain(Scanner scnr) {
		if (yesOrNo(scnr).equalsIgnoreCase("yes")) {
			return true;
		}else {
			return false;
		}
	}
	//add more methods here to validate other needs as they come up

}