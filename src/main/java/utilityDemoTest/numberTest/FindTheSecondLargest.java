package utilityDemoTest.numberTest;

import java.util.Scanner;

public class FindTheSecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int num : arr) {
            if(num > first) {
                second = first;   // ✅ update second
                first = num;
            }
            else if(num > second && num != first) {
                second = num;
            }
        }

        // Handle case when second largest doesn't exist
        if(second == Integer.MIN_VALUE) {
            System.out.println("No second largest element");
        } else {
            System.out.println("Second largest: " + second);
        }
    }
}