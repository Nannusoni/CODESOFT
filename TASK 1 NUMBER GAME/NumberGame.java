import java.util.Random;
import java.util.Scanner;
public class NumberGame {
    public static void main(String[] args) {
        // Generate a random number between 1 and 100
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        // Get user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("I'm thinking of a number between 1 and 100.");
        System.out.println("Try to guess it!");
        // Keep track of the number of guesses
        int guesses = 0;
        // Loop until the user guesses the number
        while (true) {
            // Get the user's guess
            System.out.print("Guess: ");
            int guess = scanner.nextInt();
            // Increment the number of guesses
            guesses++;
            // Check if the guess is correct
            if (guess == number) {
                System.out.println("You guessed it!");
                System.out.println("It took you " + guesses + " guesses.");
                break;
            } else if (guess < number) {
                System.out.println("Your guess is too low.");
            } else {
                System.out.println("Your guess is too high.");
            }
        }
        // Close the scanner
        scanner.close();
    }
}
