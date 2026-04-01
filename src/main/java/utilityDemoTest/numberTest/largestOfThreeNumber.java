package utilityDemoTest.numberTest;

import java.util.Scanner;

public class largestOfThreeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        int max=Math.max(a,Math.max(b,c));

        System.out.println(max);
    }
}
