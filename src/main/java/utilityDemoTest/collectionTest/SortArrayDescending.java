package utilityDemoTest.collectionTest;
import java.util.*;

public class SortArrayDescending {
    public static void main(String[] args) {
        Integer[] arr = {25, 10, 5, 40, 20};
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Sorted array (descending): " + Arrays.toString(arr));
        // Output: [40, 25, 20, 10, 5]
    }
}

