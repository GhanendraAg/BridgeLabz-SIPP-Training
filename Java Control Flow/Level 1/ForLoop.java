package ControlFlow;
import java.util.Scanner;
public class ForLoop {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the countdown number");
		int number = input.nextInt();
		for(int i = number; i>0;i--) {
			System.out.println(i);
		}
		System.out.println("Blast off");
		input.close();
		
	}

}
