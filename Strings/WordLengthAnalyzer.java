package Strings;
import java.util.Scanner;
public class WordLengthAnalyzer {

    public static int getLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {}
        return count;
    }

    public static String[] manualSplit(String text) {
        int len = getLength(text);
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

    public static String[][] getWordLengthArray(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getLength(words[i]));
        }
        return result;
    }

    public static int[] findMinMaxIndexes(String[][] wordData) {
        int minIndex = 0, maxIndex = 0;
        for (int i = 1; i < wordData.length; i++) {
            int len = Integer.parseInt(wordData[i][1]);
            int minLen = Integer.parseInt(wordData[minIndex][1]);
            int maxLen = Integer.parseInt(wordData[maxIndex][1]);
            if (len < minLen) minIndex = i;
            if (len > maxLen) maxIndex = i;
        }
        return new int[]{minIndex, maxIndex};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] words = manualSplit(input);
        String[][] wordData = getWordLengthArray(words);
        int[] indexes = findMinMaxIndexes(wordData);

        System.out.println("\nWords and Lengths:");
        System.out.println("Word\tLength");
        for (String[] word : wordData)
            System.out.println(word[0] + "\t" + Integer.parseInt(word[1]));

        System.out.println("\nShortest Word: " + wordData[indexes[0]][0]);
        System.out.println("Longest Word: " + wordData[indexes[1]][0]);
    }
}
