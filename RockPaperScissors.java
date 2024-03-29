import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Rock Paper Scissors game!");
        System.out.println("Enter rock, paper, or scissors: ");

        String playerChoice = scanner.nextLine();
        String computerChoice = generateComputerChoice();

        System.out.println("You chose " + playerChoice + ".");
        System.out.println("The computer chose " + computerChoice + ".");

        String winner = determineWinner(playerChoice, computerChoice);

        System.out.println(winner + " wins!");
    }
 private static String generateComputerChoice() {
        int randomNumber = (int) (Math.random() * 3);

        switch (randomNumber) {
            case 0:
                return "rock";
            case 1:
                return "paper";
            case 2:
                return "scissors";
            default:
                return "invalid";
        }
    }

    private static String determineWinner(String playerChoice, String computerChoice) {
        if (playerChoice.equals(computerChoice)) {
            return "Tie";
        } else if (playerChoice.equals("rock") && computerChoice.equals("scissors")) {
            return "Player";
        } else if (playerChoice.equals("scissors") && computerChoice.equals("paper")) {
            return "Player";
        } else if (playerChoice.equals("paper") && computerChoice.equals("rock")) {
            return "Player";
        } else {
            return "Computer";
        }
    }
}
