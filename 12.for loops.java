public class ForEach1 { // Class name
    public static void main(String[] args) { // Main method where program starts
        
        int[] prime = {1, 3, 5, 7, 11, 13, 17, 19}; // Array of prime numbers
        
        System.out.println("Prime numbers are:"); // Print message
        
        for (int i : prime) { // For-each loop to access each element of the array
            System.out.println(i); // Print each prime number
        }
    }
}
