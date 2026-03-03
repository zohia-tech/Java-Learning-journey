public class ErrorsExample {
    public static void main(String[] args) {

        // Syntax Error example (uncomment to see compile-time error)
        // int x = ;  

        // Runtime Error example
        int[] arr = {1, 2, 3};
        // System.out.println(arr[5]); // ArrayIndexOutOfBoundsException

        // Logical Error example
        int a = 5, b = 10;
        int sum = a - b; // should be a + b
        System.out.println("Sum: " + sum); // logical error, output wrong
    }
}
