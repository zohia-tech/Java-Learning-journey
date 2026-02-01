import java.util.Scanner; // Imports Scanner class for taking user input

public class Main { // Main class
    public static void main(String[] args) { // Main method (program starts here)

        System.out.println("Taking input from the user"); // Displays a message on the screen

        Scanner sc = new Scanner(System.in); // Creates Scanner object to read input from keyboard

        System.out.println("Enter number 1:"); // Asks user to enter first number
        int a = sc.nextInt(); // Reads first integer from user

        System.out.println("Enter number 2:"); // Asks user to enter second number
        int b = sc.nextInt(); // Reads second integer from user

        int sum = a + b; // Adds both numbers and stores result in sum

        System.out.println("The sum of the two numbers is:"); // Displays result message
        System.out.println(sum); // Prints the sum
    }
}
