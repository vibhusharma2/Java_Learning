//https://docs.google.com/document/d/1eEv8JMCr_ZBoE5JSsZxdT5Zq53vq388-EIbE_mi7QME/edit

//Q. Enter 3 numbers from the user & make a function to print their average.

import java.util.Scanner;

public class Qustions {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input three numbers from the user
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble();

        // Calculate and print the average
        double average = calculateAverage(num1, num2, num3);
        System.out.println("The average of the three numbers is: " + average);

        // Close the scanner
        scanner.close();
    }

    // Function to calculate the average of three numbers
    public static double calculateAverage(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3;
    }
}

