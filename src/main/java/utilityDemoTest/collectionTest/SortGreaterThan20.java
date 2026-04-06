     package utilityDemoTest.collectionTest;
     import java.util.ArrayList;
     import java.util.Arrays;
     import java.util.Collections;
     import java.util.List;

     public class SortGreaterThan20 {
         public static void main(String[] args) {
             int[] arr = {23, 44, 56, 63, 11};
             int[] arr2 = greaterThan20UsingList(arr);
             System.out.println(Arrays.toString(arr2));
             int[] arr3 = {2, 4, 5, 6, 21};
             int[] arr4 = SortArrayOnly(arr3);
             System.out.println(Arrays.toString(arr4));
         }

         public static int[] greaterThan20UsingList(int[] arr) {
             List<Integer> greaterThan20 = new ArrayList<>();
             for (int a : arr) {
                 if (a > 20) {
                     greaterThan20.add(a);
                 }
             }
             Collections.sort(greaterThan20);
             return greaterThan20.stream().mapToInt(Integer::intValue).toArray();
         }

         public static int[] SortArrayOnly(int[] arr) {
             int count = 0;// Step 1: Count elements > 20
             for (int a : arr) {
                 if (a > 20) count++;
             }
            int[] filtered = new int[count];  // Step 2: Copy them into new array
             int index = 0;
             for (int a : arr) {
                 if (a > 20) {
                     filtered[index++] = a;
                 }
             }
            Arrays.sort(filtered);// Step 3: Sort
             return filtered;// Step 4: Return the filtered array
         }
     }



