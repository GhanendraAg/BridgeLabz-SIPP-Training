package questions;
import java.util.Scanner;
public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();

        int[] physics = new int[numStudents];
        int[] chemistry = new int[numStudents];
        int[] math = new int[numStudents];
        double[] percentages = new double[numStudents];
        char[] grades = new char[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");
            physics[i] = getValidMarks(sc, "Physics");
            chemistry[i] = getValidMarks(sc, "Chemistry");
            math[i] = getValidMarks(sc, "Math");

            percentages[i] = (physics[i] + chemistry[i] + math[i]) / 3.0;
            grades[i] = calculateGrade(percentages[i]);
        }

        System.out.println("\nStudent Results:");
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("Student %d: Physics: %d, Chemistry: %d, Math: %d, Percentage: %.2f%%, Grade: %c%n",
                    (i + 1), physics[i], chemistry[i], math[i], percentages[i], grades[i]);
        }

        sc.close();
    }

    private static int getValidMarks(Scanner sc, String subject) {
        int marks;
        do {
            System.out.print(subject + " marks (0-100): ");
            marks = sc.nextInt();
            if (marks < 0 || marks > 100) {
                System.out.println("Invalid input. Please enter a value between 0 and 100.");
            }
        } while (marks < 0 || marks > 100);
        return marks;
    }

    private static char calculateGrade(double percentage) {
        if (percentage >= 80) {
            return 'A';
        } else if (percentage >= 70) {
            return 'B';
        } else if (percentage >= 60) {
            return 'C';
        } else if (percentage >= 50) {
            return 'D';
        } else if (percentage >= 40) {
            return 'E';
        } else {
            return 'R';
        }
    }
}