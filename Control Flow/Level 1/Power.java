package ControlFlow;
import java.util.Scanner;
public class Power {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter base number");
		int number = input.nextInt();
		System.out.println("Enter power");
		int power = input.nextInt();
		int result = 1;
		for(int i =1;i<=power;i++) {
			result *= number;
		}
		 System.out.println(number + " raised to the power " + power + " is: " + result);
		 input.close();

	}

}
