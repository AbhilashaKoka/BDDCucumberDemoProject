package utilityDemoTest.collectionTest;

import java.util.Arrays;

public class CopyArrayLoopDemo {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30};
        int[] arr2 = {40, 50};
        int[] combined = new int[arr1.length + arr2.length];
        // Copy arr1
        for (int i = 0; i < arr1.length; i++) {
            combined[i] = arr1[i];
        }
        // Copy arr2
        for (int i = 0; i < arr2.length; i++) {
            combined[arr1.length + i] = arr2[i];
        }
        System.out.println(Arrays.toString(combined));
        // Output: [10, 20, 30, 40, 50]
    }
}
