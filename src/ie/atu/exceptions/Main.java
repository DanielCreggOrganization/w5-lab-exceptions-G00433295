package ie.atu.exceptions;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Prints 'Hello, World!' to the console.
        System.out.println("Exception handling program is running!");

        // section 1 - Introduction DIY exercise
        String text = null;
        if (text != null) {
            System.out.println("Text length: " + text.length());
        } else {
            System.out.println("Text is null. Cannot retrieve length.");
        }

        // section 2 - DIY Exercise with ArithmeticException
        try {
            int numerator = 10;
            int denominator = 0;
            int result = numerator / denominator;
            System.out.println("Result " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }

        // section 3 DIY Exercise with finally block
        System.out.println("\nSimulating file processing: ");
        try {
            System.out.println("Opening file...");
            throw new Exception("Error reading file");
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
        } finally {
            System.out.println("File processing complete.");
        }

        // section 4 - DIY Exercise with try-with-resources
        System.out.println("\nEnter a number to calculate its square: ");
        try (Scanner scanner = new Scanner(System.in)) {
            int number = scanner.nextInt();
            System.out.println("Square: " + (number * number));
        } catch (InputMismatchException e) {
            System.out.println("Caught InputMismatchException: Please enter a valid integer.");

        }
    }
}
