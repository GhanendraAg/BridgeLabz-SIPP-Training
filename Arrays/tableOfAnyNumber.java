package questions;
import java.util.Scanner;
public class tableOfAnyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int number = sc.nextInt();
		int sum = 0;
		for(int i =1;i<=10;i++) {
			sum = number*i;
			System.out.println(sum);
	}

	}
}