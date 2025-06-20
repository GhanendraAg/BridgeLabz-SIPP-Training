package Strings;
import java.util.Scanner;
public class ManualTrim {

    public static int[] findTrimIndices(String text) {
        int start = 0, end = text.length() - 1;

        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    public static String getSubstringUsingCharAt(String text, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    public static boolean areStringsEqual(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string with leading and trailing spaces: ");
        String input = sc.nextLine();

        int[] indices = findTrimIndices(input);
        String trimmedManual = getSubstringUsingCharAt(input, indices[0], indices[1]);
        String trimmedBuiltIn = input.trim();

        boolean isSame = areStringsEqual(trimmedManual, trimmedBuiltIn);

        System.out.println("Manual Trim Result: '" + trimmedManual + "'");
        System.out.println("Built-in Trim Result: '" + trimmedBuiltIn + "'");
        System.out.println("Are both results same? " + isSame);
    }
}
