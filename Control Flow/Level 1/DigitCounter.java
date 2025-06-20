package ControlFlow;
import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int count = 0;
        int originalNumber = Math.abs(number); // Handle negative numbers

        while (originalNumber != 0) {
            originalNumber /= 10;
            count++;
        }

        if (count == 0) {
            count = 1; // For input `0`, count is 1.
        }

        System.out.println("The number of digits is: " + count);
        scanner.close();
    }
}
