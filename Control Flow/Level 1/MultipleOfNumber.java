package ControlFlow;
import java.util.Scanner;
public class MultipleOfNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Number");
		int number = input.nextInt();
		if((number >= 100) || (number <= 0)) {
			System.out.println("Invalid output");
		}
		else {
			System.out.println("multiple of " + number + " below 100 ");
			  for (int i = 100; i > 0; i--) {
	                if (i % number == 0) {
	                    System.out.println(i);
	                }
	            }
		}
		input.close();
		

	}

}
