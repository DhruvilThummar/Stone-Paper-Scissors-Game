
import java.util.Random;
import java.util.Scanner;

class StonePaperScissors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"Stone", "Paper", "Scissors"};

        while (true) {
            System.out.println("Enter your choice (Stone, Paper, Scissors): ");
            String userChoice = scanner.nextLine();

            int computerChoiceIndex = random.nextInt(3);
            String computerChoice = choices[computerChoiceIndex];

            System.out.println("Computer chose: " + computerChoice);

            if (userChoice.equalsIgnoreCase(computerChoice)) {
                System.out.println("It's a tie!");
            } else if ((userChoice.equalsIgnoreCase("Stone") && computerChoice.equalsIgnoreCase("Scissors"))
                    || (userChoice.equalsIgnoreCase("Paper") && computerChoice.equalsIgnoreCase("Stone"))
                    || (userChoice.equalsIgnoreCase("Scissors") && computerChoice.equalsIgnoreCase("Paper"))) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }

            System.out.println("Play again? (yes/no): ");
            String playAgain = scanner.nextLine();

            if (!playAgain.equalsIgnoreCase("yes")) {
                break;
            }
        }

        scanner.close();
    }
}
