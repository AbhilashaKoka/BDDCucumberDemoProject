package utilityDemoTest.ArrayTest;

    import java.util.Arrays;

    public class SortArrayDemo {
        public static void main(String[] args) {
            int[] arr = {25, 10, 5, 40, 20};
            Arrays.sort(arr);  // Sorts in ascending order
            System.out.println("Sorted array: " + Arrays.toString(arr));
            // Output: [5, 10, 20, 25, 40]
        }
    }


