package ControlFlow;
import java.util.Scanner;
public class ForLoopTwo {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter a natural number (n): ");
		        int n = scanner.nextInt();

		        if (n <= 0) {
		            System.out.println("The input is not a natural number. Please enter a positive integer.");
		        } else {
		            int sumFormula = n * (n + 1) / 2;
		            int sumLoop = 0;

		            for (int i = 1; i <= n; i++) {
		                sumLoop += i;
		            }

		            System.out.println("Sum calculated using formula: " + sumFormula);
		            System.out.println("Sum calculated using for loop: " + sumLoop);

		            if (sumFormula == sumLoop) {
		                System.out.println("The results match. The computation is correct.");
		            } else {
		                System.out.println("The results do not match. There is an error in the computation.");
		            }
		        }

		        scanner.close();
		    }
		

	}


