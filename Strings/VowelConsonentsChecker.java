package Strings;
import java.util.Scanner;
public class VowelConsonentsChecker {

    public static String checkCharType(char ch) {
        if (ch >= 'A' && ch <= 'Z') ch = (char)(ch + 32);
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                return "Vowel";
            else
                return "Consonant";
        } else {
            return "Not a Letter";
        }
    }

    public static String[][] analyzeString(String text) {
        int len = getLength(text);
        String[][] result = new String[len][2];
        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = checkCharType(ch);
        }
        return result;
    }

    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {}
        return count;
    }

    public static void displayTable(String[][] data) {
        System.out.println("Char\tType");
        System.out.println("----\t----");
        for (String[] row : data) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[][] result = analyzeString(input);
        displayTable(result);
    }
}
