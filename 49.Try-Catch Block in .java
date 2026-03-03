public class TryCatchExample {
    public static void main(String[] args) {
        try {
            int a = 10 / 0; // ArithmeticException
        } catch (Exception e) {
            System.out.println("Exception caught: " + e);
        }
        System.out.println("Program continues...");
    }
}
