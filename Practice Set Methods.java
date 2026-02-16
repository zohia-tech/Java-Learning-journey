class MethodPracticeSet {

    // Q1: Method to print table of a number
    static void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    // Q2: Method to calculate sum of first n natural numbers
    static int sumOfNaturalNumbers(int n) {
        return n * (n + 1) / 2;
    }

    // Q3: Method to find maximum of two numbers
    static int maxNumber(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }

    // Main method
    public static void main(String[] args) {

        // Calling Q1
        System.out.println("Table of 5:");
        printTable(5);

        // Calling Q2
        System.out.println("\nSum of first 10 natural numbers: " + sumOfNaturalNumbers(10));

        // Calling Q3
        System.out.println("Maximum of 12 and 20: " + maxNumber(12, 20));
    }
}
