package questions;
import java.util.Scanner;
public class FizzBuzz{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = sc.nextInt();
        String results[] = new String[number];
        for (int i = 1; i <= number; i++) {
            if(number%3==0 && number%5==0){
                results[i-1] = "FizzBuzz";
            }else if(number%3==0){
                results[i-1] = "Fizz";
            }else if(number%5==0){
                results[i-1] = "Buzz";
            }else{
                results[i-1] = String.valueOf(i);
            }

        }
        for (int i = 0; i < number; i++) {
            System.out.println("Position " + (i + 1) + " = " + results[i]);
        }

        sc.close();
    }
}