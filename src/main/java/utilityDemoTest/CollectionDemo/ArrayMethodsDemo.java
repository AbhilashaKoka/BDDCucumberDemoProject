package utilityDemoTest.CollectionDemo;

import java.util.Arrays;

public class ArrayMethodsDemo {
    public static void main(String[] args) {
        // Print Array Content
        int[] numbers = {10, 20, 30, 40};
        System.out.println(Arrays.toString(numbers));
        // Output: [10, 20, 30, 40]
        //Sort an array
        int[] numbers2 = {420, 10, 30, 20};
        Arrays.sort(numbers2);
        System.out.println(Arrays.toString(numbers2));
        // Output: [10, 20, 30, 40]

        //Search for an element
        int[] numbers3 = {10, 20, 30, 40};
        int index = Arrays.binarySearch(numbers3, 30);
        System.out.println("Index of 30: " + index);
        // Output: Index of 30: 2

      //Compare two arrays
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        System.out.println(Arrays.equals(arr1, arr2));
        // Output: true

        //Copy an array
        int[] original = {1, 2, 3, 4};
        int[] copy = Arrays.copyOf(original, 6);
        System.out.println(Arrays.toString(copy));
        // Output: [1, 2, 3, 4, 0, 0]

        //Fill array with a value
        int[] arr = new int[5];
        Arrays.fill(arr, 7);
        System.out.println(Arrays.toString(arr));
        // Output: [7, 7, 7, 7, 7]


        //Multi Dimensional Array
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        // Output:
        // 1 2 3
        // 4 5 6
    }

//Storing marks of students: int[] marks = new int[50];
//Handling fixed datasets: Days of the week, months, etc.
//Matrix operations: Using 2D arrays for mathematical computations.
//Low-level performance needs: Arrays are faster than dynamic collections when size is known.

}

