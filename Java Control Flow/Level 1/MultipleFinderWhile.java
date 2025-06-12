package ControlFlow;
import java.util.Scanner;
public class MultipleFinderWhile {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a positive number below 100");
		int number = input.nextInt();
		if(number <= 0 || number >= 100 ) {
			System.out.println("Invalid input");
		}
		else {
			  int counter = number - 1;

	            System.out.println("Multiples of " + number + " below 100 are:");
	            while (counter > 0) {
	                if (counter * number < 100) {
	                    System.out.println(counter * number);
	                }
	                counter--;
	            }
	        }
		}
	}


