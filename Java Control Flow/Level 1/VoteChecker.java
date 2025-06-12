package ControlFlow;
import java.util.Scanner;
public class VoteChecker {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your Age");
		int Age = input.nextInt();
		if(Age<=18) {
			System.out.println("The person's age is "  + Age + " and cannot vote.");
			
		}
		else {
			System.out.println("The person's age is "  + Age + " and can vote.");
		}
		
	}

}
