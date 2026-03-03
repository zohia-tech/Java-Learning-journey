public class NestedTryCatchExample {
    public static void main(String[] args) {
        try {
            try {
                int a = 10 / 0; // ArithmeticException
            } catch (ArithmeticException e) {
                System.out.println("Inner catch: " + e);
            }
            int[] arr = {1, 2};
            System.out.println(arr[5]); // ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer catch: " + e);
        }
        System.out.println("Program continues...");
    }
}
