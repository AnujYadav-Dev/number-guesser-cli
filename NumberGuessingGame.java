import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int maxRounds = 5; // You can adjust the number of rounds
        int maxAttempts = 5; // Number of allowed attempts per round
        int score = 0; // To keep track of user's score across rounds
        boolean playAgain = true;

        System.out.println("===== Welcome to the Number Guessing Game! =====");

        while (playAgain) {
            int roundsPlayed = 0;
            score = 0;

            System.out.print("How many rounds would you like to play? (1 to " + maxRounds + ") : ");
            int rounds = scanner.nextInt();
            rounds = Math.min(rounds, maxRounds); // Limit the maximum number of rounds
            
            while (roundsPlayed < rounds) {
                roundsPlayed++;
                System.out.println("\n===== Round " + roundsPlayed + " =====");

                // Generate random number between 1 and 100
                int randomNumber = random.nextInt(100) + 1;
                int attempts = 0;
                boolean hasWon = false;

                System.out.println("Guess the number between 1 and 100. You have " + maxAttempts + " attempts!");

                while (attempts < maxAttempts && !hasWon) {
                    System.out.print("Enter your guess: ");
                    int guess = scanner.nextInt();
                    attempts++;

                    if (guess < randomNumber) {
                        System.out.println("Too low!");
                    } else if (guess > randomNumber) {
                        System.out.println("Too high!");
                    } else {
                        System.out.println("Correct! You guessed the number in " + attempts + " attempt(s).");
                        hasWon = true;
                        score += (maxAttempts - attempts + 1); // The faster they guess, the more points
                    }

                    if (attempts == maxAttempts && !hasWon) {
                        System.out.println("You've used all attempts! The correct number was: " + randomNumber);
                    }
                }
            }

            System.out.println("\n===== Game Over! =====");
            System.out.println("Your score for this session: " + score);

            System.out.print("Do you want to play again? ([Y]es / [N]o): ");
            scanner.nextLine(); // consume newline left-over
            String answer = scanner.nextLine();
            
            // Accept "yes", "no", "y", and "n" as valid inputs
            playAgain = answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y");
        }

        System.out.println("Thanks for playing! Goodbye!");
        scanner.close();
    }
}
