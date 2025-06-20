package ControlFlow;
import java.util.Scanner;
public class NaturalChecker {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your Number");
		int n = input.nextInt();
		if(n<=0) {
			System.out.println("It is not a natural number");
		}
		else {
			System.out.println("It is a natural number");
			int c =  n * (n+1) / 2 ;
			System.out.println("Sum of natural number is " + c);
			
		}

	}

}
