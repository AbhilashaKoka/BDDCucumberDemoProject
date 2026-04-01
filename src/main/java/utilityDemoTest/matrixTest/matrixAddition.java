package utilityDemoTest.matrixTest;

import java.util.Scanner;

public class matrixAddition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int r = input.nextInt();
        int c = input.nextInt();

        int[][] a = new int[r][c];
        int[][] b = new int[r][c];
        int[][] sum = new int[r][c];

        // Input matrix A
        for(int i = 0; i < r; i++)
            for(int j = 0; j < c; j++)
                a[i][j] = input.nextInt();

        // Input matrix B
        for(int i = 0; i < r; i++)
            for(int j = 0; j < c; j++)
                b[i][j] = input.nextInt();

        // Addition
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                sum[i][j] = a[i][j] + b[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println(); // ✅ correct place
        }
    }
}