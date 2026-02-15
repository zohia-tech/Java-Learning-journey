class MultiDimensionalArrayExample {
    public static void main(String[] args) {

        // 1. 2D Array declaration and initialization
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // 2. Print 2D array elements
        System.out.println("2D Array elements:");
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // 3. Sum of all elements
        int sum = 0;
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        System.out.println("Sum of elements: " + sum);

        // 4. Access specific element
        System.out.println("Element at row 2, col 3: " + matrix[1][2]); // indexing starts from 0
    }
}
