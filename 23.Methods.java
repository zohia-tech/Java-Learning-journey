import java.util.Scanner;

class MethodsExample {

    // 1. Method with no parameters and no return
    static void greet() {
        System.out.println("Hello! Welcome to Java Methods.");
    }

    // 2. Method with parameters and no return
    static void printSum(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    // 3. Method with parameters and return value
    static int multiply(int a, int b) {
        return a * b;
    }

    // 4. Method to check even or odd
    static void checkEvenOdd(int n) {
        if(n % 2 == 0) System.out.println(n + " is Even");
        else System.out.println(n + " is Odd");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Calling method 1
        greet();

        // Calling method 2
        System.out.print("Enter two numbers to sum: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        printSum(x, y);

        // Calling method 3
        int product = multiply(x, y);
        System.out.println("Product: " + product);

        // Calling method 4
        System.out.print("Enter a number to check Even/Odd: ");
        int num = sc.nextInt();
        checkEvenOdd(num);
    }
}
