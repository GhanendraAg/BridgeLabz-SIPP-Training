package questions;
import java.util.Scanner;
public class NumberChecker{
    public static void main(String[] args) {
        int [] number = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a five digits");
        for (int i = 0; i < number.length; i++) {
            number[i] = sc.nextInt();
        }
        for(int numbers:number){
            if(numbers>0){
                if(numbers%2==0){
                    System.out.println("Positive & Even");
                }else{
                    System.out.println("Positive & odd");
                }
            } else if(numbers<0){
                System.out.println("Negative");
            }
            else{
                System.out.println("zero");
            }

        }
        if(number[0]>number[(number.length)-1]){
            System.out.println("The first element is large");
        } else if(number[0]<number[(number.length)-1]) {
            System.out.println("The last element is large");
        }else{
            System.out.println("Both elements are equal");
        }

    }
}