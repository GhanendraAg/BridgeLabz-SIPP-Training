package Strings;
import java.util.*;
public class StudentGrade {
    public static void main(String[] args) {
        int[][] scores = generateScores(10);
        String[][] result = calculateGrades(scores);
        displayResults(scores, result);
    }

    static int[][] generateScores(int n) {
        int[][] scores = new int[n][3];
        Random rand = new Random();
        for (int i = 0; i < n; i++)
            for (int j = 0; j < 3; j++)
                scores[i][j] = rand.nextInt(91) + 10;
        return scores;
    }

    static String[][] calculateGrades(int[][] scores) {
        String[][] result = new String[scores.length][2];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double percentage = Math.round((total / 3.0) * 100.0) / 100.0;
            result[i][0] = String.valueOf(percentage);
            result[i][1] = percentage >= 80 ? "A" : percentage >= 70 ? "B" :
                           percentage >= 60 ? "C" : percentage >= 50 ? "D" :
                           percentage >= 40 ? "E" : "R";
        }
        return result;
    }

    static void displayResults(int[][] scores, String[][] result) {
        System.out.printf("%-10s%-10s%-10s%-10s%-15s%-10s%n", "Physics", "Chemistry", "Math", "Total", "Percentage", "Grade");
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            System.out.printf("%-10d%-10d%-10d%-10d%-15s%-10s%n", scores[i][0], scores[i][1], scores[i][2], total, result[i][0], result[i][1]);
        }
    }
}