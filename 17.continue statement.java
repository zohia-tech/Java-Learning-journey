public class JavaContinue { // Class name
    public static void main(String[] args) { // Main method starts here
        
        for (int n = 1; n <= 20; n++) { // Loop from 1 to 20
            
            if (n % 2 == 0) { // Check if the number is even
                
                if (n == 12) { // Check if the number is 12
                    continue; // Skip this iteration and go to next number
                }
                
                System.out.println(n); // Print the even number (except 12)
            }
        }
    }
}
