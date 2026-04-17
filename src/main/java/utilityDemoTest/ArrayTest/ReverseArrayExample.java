package utilityDemoTest.ArrayTest;


import java.util.Arrays;

public class ReverseArrayExample {
        public static void main(String[] args) {
            int[] numbers = {1, 2, 3, 4, 5};
            System.out.println(Arrays.toString(reverseArrayDemo(numbers)));
        }
            public static int[] reverseArrayDemo(int[] numbers) {
                int length = numbers.length;

                // Iterate over the array to reverse it
                for (int i = 0; i < length / 2; i++) {
                    int temp = numbers[i];
                    numbers[i] = numbers[length - 1 - i];
                    numbers[length - 1 - i] = temp;
                }

                // Print the reversed array
                System.out.print("Reversed array: ");
                for (int num : numbers) {
                    System.out.print(num + " ");
                }
                return numbers;
            }
    }

