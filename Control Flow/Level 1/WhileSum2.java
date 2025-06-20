package ControlFlow;
import java.util.Scanner;
public class WhileSum2 {

	public static void main(String[] args) {
		double total = 0.0;
		double userInput;
		Scanner input = new Scanner(System.in);
		System.out.println("\"Enter numbers to sum. Enter 0 or a negative number to stop:\"");
		while(true) {
			userInput = input.nextDouble();
			if(userInput <=0) {
				break;
			}
			total += userInput;
		}
		System.out.println("Total sum: " + total);
		input.close();
		
		


	}

}
