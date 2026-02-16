class RecursionExample {

    // Method to calculate factorial using recursion
    static int factorial(int n) {

        // Base case: factorial of 0 or 1 is 1
        if (n == 0 || n == 1) {
            return 1;
        }

        // Recursive call: n * factorial of (n-1)
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        int num = 5; // Number whose factorial will be calculated

        // Print the result
        System.out.println("Factorial of " + num + " is: " + factorial(num));
    }
}
