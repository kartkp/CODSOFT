//Number Game Basic Task 01

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("***** Welcome to the Ultimate Number Guessing Challenge *****");
        
        while (true) {
            System.out.println("Choose your difficulty level:");
            System.out.println("1. Easy\n2. Medium\n3. Hard");
            int difficulty = scanner.nextInt();
            int maxAttempts = 0;
            
            switch (difficulty) {
                case 1:
                    maxAttempts = 10;
                    break;
                case 2:
                    maxAttempts = 7;
                    break;
                case 3:
                    maxAttempts = 4;
                    break;
                default:
                    System.out.println("Invalid choice. Defaulting to Easy level.");
                    maxAttempts = 10;
            }
            
            int targetNumber = rand.nextInt(100) + 1;
            int attemptsLeft = maxAttempts;
            boolean hasWon = false;
            
            System.out.println("Try to guess the number between 1 and 100:");

            while (attemptsLeft > 0) {
                System.out.println("Attempts remaining: " + attemptsLeft);
                int playerGuess = scanner.nextInt();
                
                if (playerGuess < targetNumber) {
                    System.out.println("Too low! Try a higher number.");
                } else if (playerGuess > targetNumber) {
                    System.out.println("Too high! Try a lower number.");
                } else {
                    System.out.println("Congratulations! You've guessed the number.");
                    hasWon = true;
                    break;
                }
                attemptsLeft--;
            }

            if (!hasWon) {
                System.out.println("Sorry, you've run out of attempts. The number was: " + targetNumber);
            }

            System.out.println("Would you like to play again? (yes/no)");
            String playAgain = scanner.next();
            if (playAgain.equalsIgnoreCase("no")) {
                break;
            }
        }

        System.out.println("Thank you for playing the Number Guessing Game!");
        scanner.close();
    }
}


        System.out.println("Thank you for playing! Your final score is: " + score);
        scanner.close();
    }}
