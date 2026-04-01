package utilityDemoTest.collectionTest;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamConcatDemo {
    public static void main(String[] args) {
        int[] arr1 = {7, 8, 9};
        int[] arr2 = {10, 11};
        int[] combined = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).toArray();
        System.out.println(Arrays.toString(combined));
        // Output: [7, 8, 9, 10, 11]
    }
}