package ControlFlow;
import java.util.Scanner;
public class Factorialfor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("The input is not a positive integer. Please enter a non-negative integer.");
        } else {
            long factorial = 1;

            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            System.out.println("The factorial of " + number + " is: " + factorial);
        }

        scanner.close();
    }
}



