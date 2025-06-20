package Strings;
import java.util.*;
public class RockPaperScissors {
    static int playerWins = 0, computerWins = 0, ties = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many games? ");
        int rounds = sc.nextInt();

        for (int i = 0; i < rounds; i++) {
            System.out.print("rock / paper / scissors: ");
            String player = sc.next().toLowerCase();
            String computer = getChoice();
            System.out.println("Computer: " + computer);
            checkWinner(player, computer);
        }

        showStats(rounds);
    }

    static String getChoice() {
        String[] choices = {"rock", "paper", "scissors"};
        return choices[(int)(Math.random() * 3)];
    }

    static void checkWinner(String p, String c) {
        if (p.equals(c)) {
            ties++;
            System.out.println("Tie!");
        } else if ((p.equals("rock") && c.equals("scissors")) ||
                   (p.equals("paper") && c.equals("rock")) ||
                   (p.equals("scissors") && c.equals("paper"))) {
            playerWins++;
            System.out.println("You win!");
        } else {
            computerWins++;
            System.out.println("Computer wins!");
        }
    }

    static void showStats(int total) {
        System.out.println("\n--- Game Stats ---");
        System.out.printf("You: %d (%.1f%%)\n", playerWins, 100.0 * playerWins / total);
        System.out.printf("Computer: %d (%.1f%%)\n", computerWins, 100.0 * computerWins / total);
        System.out.printf("Ties: %d (%.1f%%)\n", ties, 100.0 * ties / total);
    }
}