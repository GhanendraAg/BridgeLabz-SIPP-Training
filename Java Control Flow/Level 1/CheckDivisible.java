package ControlFlow;
import java.util.Scanner;

public class CheckDivisible {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your Number");
		int number = input.nextInt();
		System.out.println("is the number " + number + " divisible by 5? " + (number % 5 == 0));  
	}

}
