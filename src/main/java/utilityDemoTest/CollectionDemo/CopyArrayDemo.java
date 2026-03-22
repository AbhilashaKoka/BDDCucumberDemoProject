package utilityDemoTest.CollectionDemo;

import java.util.Arrays;

public class CopyArrayDemo {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};

        // Create new array with combined length
        int[] combined = new int[arr1.length + arr2.length];

        // Copy arr1 into combined
        System.arraycopy(arr1, 0, combined, 0, arr1.length);

        // Copy arr2 into combined
        System.arraycopy(arr2, 0, combined, arr1.length, arr2.length);

        System.out.println(Arrays.toString(combined));
        // Output: [1, 2, 3, 4, 5, 6]
    }
}
