class ThrowThrowsExample {

    // Method using 'throws' to declare exception
    static void division(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero"); // throw exception
        }
        System.out.println("Result: " + (a / b));
    }

    public static void main(String[] args) {
        try {
            division(10, 0); // calling method that may throw exception
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e);
        }
    }
}
