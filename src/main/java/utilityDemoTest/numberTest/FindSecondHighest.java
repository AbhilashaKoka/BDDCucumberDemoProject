package utilityDemoTest.numberTest;

public class FindSecondHighest {

    public static void main(String[] args){
       System.out.println(findSecondHighest(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));
    }
    private static int findSecondHighest(int[] array) {
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int i : array) {
            if (i > highest) {
                secondHighest = highest;
                highest = i;
            } else if (i > secondHighest) {
                secondHighest = i;
            }

        }
        return secondHighest;
    }
}
