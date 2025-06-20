package ControlFlow;
import java.util.Scanner;
public class LargestCheck {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter First Number");
		int num1 = input.nextInt();
		System.out.println("Enter Second Number");
		int num2 = input.nextInt();
		System.out.println("Enter Third Number");
		int num3 = input.nextInt();
		boolean isFirstLargest = (num1>num2)&&(num1>num3);
		boolean isSecondLargest = (num2>num1)&&(num2>num3);
		boolean isThirdLargest = (num3>num1)&&(num3>num2);
		System.out.println("Is the first number the largest: " + isFirstLargest);
		System.out.println("Is the Second number the largest: " + isSecondLargest);
		System.out.println("Is the Third number the largest: " + isThirdLargest);
		input.close();
		
		
		
	}

}
