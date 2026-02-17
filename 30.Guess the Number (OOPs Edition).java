import java.util.Random;
import java.util.Scanner;

class GuessTheNumber {

    private int number;      // Random number to be guessed
    private int attempts = 0; // Counts number of attempts

    // Constructor: generates a random number between 1 and 100
    GuessTheNumber() {
        Random r = new Random();
        number = r.nextInt(100) + 1; // 1 to 100
    }

    // Method to check the guessed number
    boolean checkNumber(int guess) {
        attempts++; // Increase attempts each time user guesses

        if (guess == number) {
            System.out.println("Correct! You guessed in " + attempts + " attempts.");
            return true; // Game ends
        } 
        else if (guess < number) {
            System.out.println("Too low!");
        } 
        else {
            System.out.println("Too high!");
        }
        return false; // Game continues
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);          // For user input
        GuessTheNumber game = new GuessTheNumber();   // Create game object
        int guess;

        // Loop until the correct number is guessed
        do {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt(); // Take user input
        } 
        while (!game.checkNumber(guess)); // Call method to check guess
    }
}
