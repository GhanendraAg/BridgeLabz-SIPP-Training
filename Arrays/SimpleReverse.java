package questions;
import java.util.*;
public class SimpleReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive number");
        int number = sc.nextInt();
        if(number<=0){
            System.err.println("Error !Please enter a valid number");
            return;
        }
        int temp = number;
        int count = 0;
        while(temp>0){
            count++;
            temp /= 10;
        }
        int []digits = new int[count];
        temp = number;
        for (int i = 0; i < count; i++) {
            digits[i] = temp%10;
            temp /= 10;
        }
        System.out.println("Reversed numbers: ");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i]);
        }
        sc.close();
    }
}