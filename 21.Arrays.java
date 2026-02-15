class ArraysExample {
    public static void main(String[] args) {

        // 1. Array declaration and initialization
        int[] numbers = {10, 20, 30, 40, 50};

        // 2. Print array elements using for loop
        System.out.println("Array elements:");
        for(int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // 3. Sum of array elements
        int sum = 0;
        for(int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum of elements: " + sum);

        // 4. Access a specific element
        System.out.println("First element: " + numbers[0]);
        System.out.println("Last element: " + numbers[numbers.length - 1]);
    }
}
