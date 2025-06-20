package ControlFlow;
import java.util.Scanner;
public class GreatestFactor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number");
		int number = input.nextInt();
		
		int greatestFactor = 1;
		int counter = number - 1;
		
		while (counter > 1) {
	            if (number % counter == 0) {
	                greatestFactor = counter;
	                break;
	            }
	            counter--;
	        }
	        System.out.println("The greatest factor of " + number + " (besides itself) is: " + greatestFactor);

	        input.close();
		
	}

}
