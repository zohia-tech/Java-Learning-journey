public class Nested { // Class name
    public static void main(String[] args) { // Main method starts here
        
        for (int i = 1; i < 5; i++) { // Outer loop for rows (table number)
            
            for (int j = 1; j < 5; j++) { // Inner loop for columns (multiplier)
                System.out.println(i + " * " + j + " = " + i * j); // Print multiplication result
            }
            
            System.out.println(); // Print a blank line after each table
        }
    }
}
