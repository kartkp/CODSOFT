//Number Game Basic Task 01

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int score = 0;

        boolean playAgain = true;

        while (playAgain) {
            int numberToGuess = random.nextInt(100) + 1;
            int numberOfAttempts = 0;
            boolean guessedCorrectly = false;
            int maxAttempts = 5;

            System.out.println("Guess the number between 1 and 100. You have " + maxAttempts + " attempts.");

            while (numberOfAttempts < maxAttempts && !guessedCorrectly) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                numberOfAttempts++;

                if (userGuess == numberToGuess) {
                    System.out.println("Congratulations! You've guessed the correct number.");
                    guessedCorrectly = true;
                    score += (maxAttempts - numberOfAttempts + 1);
                } else if (userGuess < numberToGuess) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            }

            if (!guessedCorrectly) {
                System.out.println("Sorry, you've run out of attempts. The correct number was " + numberToGuess);
            }

            System.out.println("Your current score is: " + score);
            System.out.print("Do you want to play again? (yes/no): ");
            String response = scanner.next();

            playAgain = response.equalsIgnoreCase("yes");
        }

        System.out.println("Thank you for playing! Your final score is: " + score);
        scanner.close();
    }}
