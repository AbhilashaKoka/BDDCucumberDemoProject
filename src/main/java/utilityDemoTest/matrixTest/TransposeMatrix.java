package utilityDemoTest.matrixTest;

import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];

        // Input
        for(int i = 0; i < r; i++)
            for(int j = 0; j < c; j++)
                matrix[i][j] = sc.nextInt();

        // Transpose matrix
        int[][] transpose = new int[c][r];

        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // Output
        for(int i = 0; i < c; i++) {
            for(int j = 0; j < r; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}