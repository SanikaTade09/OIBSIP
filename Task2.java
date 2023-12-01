
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;
        int upperBound = 100;
        int generatedNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;

        int maxAttempts = 5;
        int attempts = 0;

        System.out.println("Welcome to the Guess the Number game!");
        System.out.println("I have selected a number between " + lowerBound + " and " + upperBound);

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            scanner.nextLine();

            if (userGuess < lowerBound || userGuess > upperBound) {
                System.out.println("Please enter a number within the specified range.");
                continue;
            }

            attempts++;

            if (userGuess == generatedNumber) {
                System.out.println("Congratulations! You guessed the correct number: " + generatedNumber);
                System.out.println("Attempts: " + attempts);
                break;
            } else if (userGuess < generatedNumber) {
                System.out.println("Try again! The number is higher.");
            } else {
                System.out.println("Try again! The number is lower.");
            }

            int remainingAttempts = maxAttempts - attempts;
            System.out.println("Remaining attempts: " + remainingAttempts);
        }

        if (attempts == maxAttempts) {
            System.out.println("Sorry, you've run out of attempts. The correct number was: " + generatedNumber);
        }

        scanner.close();
    }
}
