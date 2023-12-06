/*
Write a program to print Fibonacci series of n terms where n is input by user :
0 1 1 2 3 5 8 13 21 .....

 */
import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of terms from the user
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int n = scanner.nextInt();

        // Print the Fibonacci series
        System.out.println("Fibonacci Series of " + n + " terms:");
        printFibonacciSeries(n);

        // Close the scanner
        scanner.close();
    }

    // Function to print Fibonacci series
    public static void printFibonacciSeries(int n) {
        int firstTerm = 0, secondTerm = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(firstTerm + " ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
