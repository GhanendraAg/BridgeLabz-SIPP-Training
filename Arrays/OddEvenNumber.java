package questions;
import java.util.Scanner;
public class OddEvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a natural no");
        int number = sc.nextInt();
        if(number<=0){
            System.out.println("Error !please give a valid no");
            return;
        }
        int[] evenNumber = new int[number/2+1];
        int[] oddNumber = new int[number/2+1];
        int evenIndex = 0;
        int oddIndex = 0;
        for (int i = 1; i <= number; i++) {
            if(i%2==0){
                evenNumber[evenIndex++] = i;
            }else{
                oddNumber[oddIndex++] = i;
            }
        }
        System.out.println("Odd numbers");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumber[i]+ " ");
        }
        System.out.println();
        System.out.println("Even number");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumber[i]+" ");
        }
        System.out.println();
    }
}