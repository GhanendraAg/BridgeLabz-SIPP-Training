package Strings;
import java.util.Scanner;
public class SimpleSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Get input
        System.out.print("Enter a word: ");
        String text = sc.next();
        System.out.print("Start index: ");
        int start = sc.nextInt();
        System.out.print("End index: ");
        int end = sc.nextInt();

        // Step 2: Make substring using charAt()
        String sub1 = "";
        for (int i = start; i < end; i++) {
            sub1 += text.charAt(i);
        }

        // Step 3: Make substring using built-in method
        String sub2 = text.substring(start, end);

        // Step 4: Compare
        boolean same = sub1.equals(sub2);

        // Step 5: Show result
        System.out.println("Using charAt(): " + sub1);
        System.out.println("Using substring(): " + sub2);
        System.out.println("Are they equal? " + same);
    }
}