package Strings;
import java.util.Scanner;
public class StringCharArrCompare {

    public static char[] getCharsManually(String text) {
        char[] chars = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            chars[i] = text.charAt(i);
        }
        return chars;
    }

    public static boolean compareCharArrays(char[] a, char[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.next();

        char[] manualChars = getCharsManually(input);
        char[] builtInChars = input.toCharArray();

        boolean same = compareCharArrays(manualChars, builtInChars);

        System.out.print("Manual char array: ");
        for (char c : manualChars) {
            System.out.print(c + " ");
        }

        System.out.print("\nBuilt-in char array: ");
        for (char c : builtInChars) {
            System.out.print(c + " ");
        }

        System.out.println("\nAre both arrays same? " + same);
    }
}
