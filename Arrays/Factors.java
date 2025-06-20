package questions;
import java.util.*;
public class Factors{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("enter the number");
        int n = sc.nextInt();
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                arr.add(i);
            }
        }
        arr.add(n);
        System.out.println(arr);
    }
}