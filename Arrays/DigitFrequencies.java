package questions;
import java.util.Scanner;
public class DigitFrequencies {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int number = input.nextInt();

        if (number < 0) {
            System.out.println("Please enter a positive number.");
            return;
        }

        int[] digits = new int[20];
        int index = 0;

        if (number == 0) {
            digits[index++] = 0;
        } else {
            while (number > 0) {
                digits[index++] = number % 10;
                number /= 10;
            }
        }

        int[] frequency = new int[10];

        for (int i = 0; i < index; i++) {
            frequency[digits[i]]++;
        }

        System.out.println("Digit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i] + " time(s)");
            }
        }

        input.close();
    }
}
