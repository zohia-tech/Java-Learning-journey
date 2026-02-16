class VarArgsExample {

    // Method that takes variable number of arguments (VarArgs)
    static int sum(int... arr) {   
        int result = 0; // Variable to store sum

        // Loop through all numbers passed in arr
        for (int a : arr) {
            result += a; // Add each number to result
        }

        return result; // Return final sum
    }

    public static void main(String[] args) {

        // Calling sum() method with 2 arguments
        System.out.println(sum(2, 3));

        // Calling sum() method with 3 arguments
        System.out.println(sum(2, 3, 4));

        // Calling sum() method with 4 arguments
        System.out.println(sum(2, 3, 4, 5));
    }
}
