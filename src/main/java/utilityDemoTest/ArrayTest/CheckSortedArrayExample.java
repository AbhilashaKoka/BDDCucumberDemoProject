package utilityDemoTest.ArrayTest;

public class CheckSortedArrayExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // Method to check if the array is sorted
        boolean isSorted = true;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                isSorted = false;
                break;
            }
        }

        // Print whether the array is sorted or not
        if (isSorted) {
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is not sorted.");
        }
    }
}