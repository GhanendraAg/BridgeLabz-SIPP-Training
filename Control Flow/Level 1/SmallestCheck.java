package ControlFlow;
import java.util.Scanner;
public class SmallestCheck {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter First Number");
		int num1 = input.nextInt();
		System.out.println("Enter Second Number");
		int num2 = input.nextInt();
		System.out.println("Enter Third Number");
		int num3 = input.nextInt();
		boolean isSmallest = (num1<num2)&&(num2<num3);
		System.out.println("Is the first number the smallest? " + isSmallest);
		input.close();
		 
		
		
		
		
	}

}
