package questions;
import java.util.*;
public class VoteEligibilityCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []ages = new int[10];
        for (int i = 0; i < ages.length; i++) {
            System.out.println("Enter ages of students"+(i+1)+":");
            ages[i] = sc.nextInt();
        }
        System.out.println("Voting Eligibility Result");
        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];
            if(age<0){
                System.out.println("Student"+(i+1)+":Invalid age");
            }else if(age>=18){
                System.out.println("student"+(i+1)+" with age "+age+" can vote");
            }else{
                System.out.println("student"+(i+1)+"with age"+age+"cannot vote");
            }
        }
        sc.close();
    }
}