package questions;


import java.util.Scanner;

public class TableBetweenSixToNine {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to generate multiplication table from 6 to 9: ");
        int number = scanner.nextInt();
        int sum = 0;
        
        for(int i=1;i<=10;i++) {
        	if(number>=6 && number<=9) {
        		sum = number*i;
        		System.out.println (number+"*"+i+"="+sum);
        	}
        	else {
            	System.err.println("Error !invalid number");
            	break;
        }
        }
        System.out.println();
        scanner.close();

       
        
        
        
        
    }   
}