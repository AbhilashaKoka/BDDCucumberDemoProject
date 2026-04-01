package utilityDemoTest.numberTest;

import java.util.Scanner;

public class AmstrongNumber {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int temp=n; int sum=0;

        while(n!=0){
            int digit=n%10;
            sum+=digit*digit*digit;
            n/=10;
        }


        System.out.println(temp==sum?"Armstrong":"Not Armstrong");
    }
}
