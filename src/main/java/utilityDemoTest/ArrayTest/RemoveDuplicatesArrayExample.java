package utilityDemoTest.ArrayTest;

import java.util.Arrays;

public class RemoveDuplicatesArrayExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 3, 4, 4, 5};

        // Sort the array
        Arrays.sort(numbers);

        // Remove duplicates
        int[] tempArray = new int[numbers.length];
        int j = 0;

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] != numbers[i + 1]) {
                tempArray[j++] = numbers[i];
            }
        }
        tempArray[j++] = numbers[numbers.length - 1];

        // Create an array with the new length
        int[] uniqueNumbers = Arrays.copyOf(tempArray, j);

        // Print the array without duplicates
        System.out.print("Array without duplicates: ");
        for (int num : uniqueNumbers) {
            System.out.print(num + " ");
        }
    }
}