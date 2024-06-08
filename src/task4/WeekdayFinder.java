package task4;

import java.util.Scanner;

public class WeekdayFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Array of weekdays
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        // Create a scanner object for input
        Scanner scanner = new Scanner(System.in);

        try {
            // Ask the user for a day position
            System.out.print("Enter day position (0-6): ");
            int dayPosition = scanner.nextInt();

            // Print the corresponding day name
            System.out.println("The day is: " + weekdays[dayPosition]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle the exception and print a proper message
            System.out.println("Invalid day position. Please enter a number between 0 and 6.");
        } finally {
            // Close the scanner
            scanner.close();
        }
    }

	}


