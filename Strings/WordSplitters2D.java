package Strings;
import java.util.Scanner;
public class WordSplitters2D {
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {}
        return count;
    }

    public static String[] splitIntoWords(String text) {
        int len = findLength(text);
        String[] words = new String[len];
        int wordIndex = 0;
        String temp = "";

        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            if (ch != ' ') temp += ch;
            else {
                if (!temp.equals("")) {
                    words[wordIndex++] = temp;
                    temp = "";
                }
            }
        }
        if (!temp.equals("")) words[wordIndex++] = temp;

        String[] result = new String[wordIndex];
        for (int i = 0; i < wordIndex; i++) result[i] = words[i];
        return result;
    }

    public static String[][] getWordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String input = scanner.nextLine();
        String[] words = splitIntoWords(input);
        String[][] wordData = getWordsWithLengths(words);
        System.out.println("\nWord\tLength");
        System.out.println("----\t------");
        for (int i = 0; i < wordData.length; i++) {
            System.out.println(wordData[i][0] + "\t" + Integer.parseInt(wordData[i][1]));
        }
        scanner.close();
    }
}
