import java.util.Scanner;
import java.util.Arrays;

class ArraysPracticeSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ===== Level 1: Basic Arrays =====
        int[] arr1 = {10, 20, 30, 40, 50};
        System.out.println("Array arr1: " + Arrays.toString(arr1));
        
        int[] arr2 = {5, 15, 25, 35};
        System.out.println("Length of arr2: " + arr2.length);

        int[] arr3 = {2, 4, 6, 8};
        System.out.println("First element: " + arr3[0]);
        System.out.println("Last element: " + arr3[arr3.length - 1]);

        // User input array
        int[] userArr = new int[5];
        System.out.println("Enter 5 numbers for userArr:");
        for(int i=0;i<5;i++){
            userArr[i] = sc.nextInt();
        }
        System.out.println("User array: " + Arrays.toString(userArr));

        // Sum of arr1
        int sum = 0;
        for(int n : arr1) sum += n;
        System.out.println("Sum of arr1: " + sum);

        // ===== Level 2: Loops & Logic =====
        int[] arr4 = {3, 7, 1, 9};
        int max = arr4[0];
        for(int n : arr4) if(n>max) max=n;
        System.out.println("Maximum: " + max);

        int[] arr5 = {5, 10, 15, 20};
        int min = arr5[0];
        for(int n : arr5) if(n<min) min=n;
        System.out.println("Minimum: " + min);

        // Even numbers in arr3
        System.out.print("Even numbers in arr3: ");
        for(int n : arr3) if(n%2==0) System.out.print(n + " ");
        System.out.println();

        // Odd numbers in array
        int[] arr6 = {1,3,5,7,2};
        System.out.print("Odd numbers in arr6: ");
        for(int n : arr6) if(n%2!=0) System.out.print(n + " ");
        System.out.println();

        // Reverse print arr2
        System.out.print("arr2 in reverse: ");
        for(int i=arr2.length-1;i>=0;i--) System.out.print(arr2[i]+" ");
        System.out.println();

        // ===== Level 3: Advanced Logic =====
        int[] arrA = {1,2,3};
        int[] arrB = {4,5,6};
        int[] arrConcat = new int[arrA.length + arrB.length];
        for(int i=0;i<arrA.length;i++) arrConcat[i] = arrA[i];
        for(int i=0;i<arrB.length;i++) arrConcat[i+arrA.length] = arrB[i];
        System.out.println("Concatenated array: " + Arrays.toString(arrConcat));

        int[] arrDup = {1,2,2,3,3,3};
        System.out.print("Duplicate elements: ");
        for(int i=0;i<arrDup.length;i++){
            for(int j=i+1;j<arrDup.length;j++){
                if(arrDup[i]==arrDup[j]) {
                    System.out.print(arrDup[i]+" ");
                    break;
                }
            }
        }
        System.out.println();

        // Average of arr1
        sum=0;
        for(int n : arr1) sum+=n;
        System.out.println("Average of arr1: " + ((double)sum/arr1.length));

        // Sort arr6 ascending
        Arrays.sort(arr6);
        System.out.println("Sorted arr6: " + Arrays.toString(arr6));

        // Search for number in arr1
        System.out.print("Enter number to search in arr1: ");
        int search = sc.nextInt();
        int index = -1;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]==search) {index=i; break;}
        }
        if(index!=-1) System.out.println("Number found at index: " + index);
        else System.out.println("Number not found");

        // ===== Level 4: 2D Arrays =====
        int[][] matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        System.out.println("2D Array:");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        // Sum of all elements in 2D array
        sum = 0;
        for(int i=0;i<matrix.length;i++)
            for(int j=0;j<matrix[i].length;j++)
                sum += matrix[i][j];
        System.out.println("Sum of 2D array elements: " + sum);

        // Access specific element
        System.out.println("Element at row 2, col 3: " + matrix[1][2]);

        // Row sum
        for(int i=0;i<matrix.length;i++){
            int rowSum=0;
            for(int j=0;j<matrix[i].length;j++) rowSum+=matrix[i][j];
            System.out.println("Sum of row " + (i+1) + ": " + rowSum);
        }

        // Column sum
        for(int j=0;j<matrix[0].length;j++){
            int colSum=0;
            for(int i=0;i<matrix.length;i++) colSum+=matrix[i][j];
            System.out.println("Sum of column " + (j+1) + ": " + colSum);
        }
    }
}
