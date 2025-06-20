package questions;
import java.util.*;
public class MeanHeight {
    public static void main(String[] args) {
        double [] height = new double[11];
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        System.out.println("Enter the heights of the footballers");
        for (int i = 0; i < height.length; i++) {
            System.out.print("player"+(i+1)+":");
            height[i] = sc.nextDouble();
            sum += height[i];
        }
        double mean = sum/11;
        System.out.println("The  mean height of the football team is: "+mean);
        sc.close();
    }
}
