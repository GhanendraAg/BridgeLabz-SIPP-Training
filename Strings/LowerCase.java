package Strings;
import java.util.Scanner;
public class LowerCase {

    public static String manualToLower(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);
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

        String manual = manualToLower(input);
        String builtIn = input.toLowerCase();

        boolean same = areEqual(manual, builtIn);

        System.out.println("Manual lowercase: " + manual);
        System.out.println("Built-in lowercase: " + builtIn);
        System.out.println("Are both same? " + same);
    }
}
