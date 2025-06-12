package ControlFlow;
import java.util.Scanner;
public class SpringSeasonCheckor {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Month(1-12)");
		int month = input.nextInt();
		System.out.println("Enter Day(1-31)");
		int day = input.nextInt();
		if((month == 3 && day >= 20)|| (month == 4)||(month == 5)||(month == 6 && day <=20)) {
			System.out.println("It is a Spring Season");
		}
		else {
			System.out.println("It is not a Spring Season");
		}
		input.close();
	}

}
