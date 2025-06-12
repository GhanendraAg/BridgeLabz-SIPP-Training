package ControlFlow;
import java.util.Scanner;
public class PositiveNegativeZeroCheck {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your number");
		int num = input.nextInt();
		if(num>0) {
			System.out.println("positive");
		}
		else if(num==0) {
			System.out.println("zero");
		}
		else {
			System.out.println("negative");
		}
		
	}

}
