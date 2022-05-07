import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            //Array of object selection
            String gameOptions[] = {"Rock", "Paper", "Scissor"};
            //computer choice is randomized to select the next integer based on the Index of the gameOption Array.
            //the Index comes from the length of the array which is passed into as gameOption.length.
            //new Random() is used with the Array with .nextInt() which is the length of the array.
            String computerChoice = gameOptions[new Random().nextInt(gameOptions.length)];

            //initialized outside the loop
            String playerMove;
            while (true) {
                System.out.println("Please enter your choice: (Rock, Paper, Scissors)");
                playerMove = scanner.nextLine();
                if (playerMove.equals("Rock") || playerMove.equals("Paper") || playerMove.equals("Scissors")) {
                    break;
                }
                System.out.println(playerMove + " is not a valid choice!");
            }
            System.out.println("Computer played " + computerChoice + ".");

            // first test for a tie
            if (playerMove.equals(computerChoice)) {
                System.out.println("This game is a TIE!");

            } else if (playerMove.equals("Rock")) {
                if (computerChoice.equals("Paper")) {
                    System.out.println("You lose!");

                } else if (computerChoice.equals("Scissors")) {
                    System.out.println("You Win!");

                } else if (playerMove.equals("Paper")) {
                    if (computerChoice.equals("Rock")) {
                        System.out.println("You win!");

                    } else if (computerChoice.equals("Scissors")) {
                        System.out.println("You lose!");
                    }


                } else if (playerMove.equals("Scissor")) {
                    if (computerChoice.equals("Paper")) {
                        System.out.println("You win!");

                      } else if (computerChoice.equals("Rock")) {
                        System.out.println("You lose!");
                     }
                }
                System.out.println("Play again? (y/n)");
                String playAgain = scanner.nextLine();
                if (!playAgain.equals("y")) {
                    break;
                }
            }
            scanner.close();
        }
    }
}




