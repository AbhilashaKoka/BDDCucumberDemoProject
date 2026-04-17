package utilityDemoTest.ArrayTest;

public class MergeArraysExample {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 5};
        int[] array2 = {2, 4, 6};

        // Merge the two arrays
        int[] mergedArray = new int[array1.length + array2.length];
        int index = 0;

        for (int i = 0; i < array1.length; i++) {
            mergedArray[index++] = array1[i];
        }

        for (int i = 0; i < array2.length; i++) {
            mergedArray[index++] = array2[i];
        }

        // Print the merged array
        System.out.print("Merged array: ");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
    }
}
