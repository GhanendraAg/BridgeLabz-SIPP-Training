package ControlFlow;
import java.util.Scanner;

public class WhileSum {
    public static void main(String[] args) {

        double total = 0.0;
        double userInput;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers to sum. Enter 0 to stop:");
        while (true) {
            userInput = scanner.nextDouble();
            if (userInput == 0) {
                break;
            }
            total += userInput;
        }
        System.out.println("The total sum of the numbers is: " + total);
        scanner.close();
    }
}
