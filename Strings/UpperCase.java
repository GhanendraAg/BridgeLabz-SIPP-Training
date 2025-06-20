package Strings;
import java.util.Scanner;
public class UpperCase {

    public static String manualToUpper(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32);
            }
            result += ch;
        }
        return result;
    }

    public static boolean areEqual(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String input = sc.nextLine();

        String manual = manualToUpper(input);
        String builtIn = input.toUpperCase();

        boolean same = areEqual(manual, builtIn);

        System.out.println("Manual uppercase: " + manual);
        System.out.println("Built-in uppercase: " + builtIn);
        System.out.println("Are both same? " + same);
    }
}
