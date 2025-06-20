package questions;
import java.util.Scanner;
public class DigitsAnalysis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int number = input.nextInt();

        if (number <= 0) {
            System.out.println("Invalid input. Enter a positive number.");
            return;
        }

        int maxDigits = 10;
        int[] digits = new int[maxDigits];
        int index = 0;

        while (number != 0) {
            int digit = number % 10;
            digits[index] = digit;
            index++;
            number /= 10;

            if (index == maxDigits) {
                maxDigits *= 2;
                int[] temp = new int[maxDigits];
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }
                digits = temp;
            }
        }

        int largest = -1;
        int secondLargest = -1;

        for (int i = 0; i < index; i++) {
            int current = digits[i];

            if (current > largest) {
                secondLargest = largest;
                largest = current;
            } else if (current > secondLargest && current != largest) {
                secondLargest = current;
            }
        }

        System.out.println("Digits in the number:");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i] + " ");
        }

        System.out.println("\nLargest digit: " + largest);
        if (secondLargest == -1) {
            System.out.println("Second largest digit: Not found (all digits are the same)");
        } else {
            System.out.println("Second largest digit: " + secondLargest);
        }

        input.close();
    }
}
