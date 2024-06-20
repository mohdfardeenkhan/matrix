package arrayymatrix;

import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read dimensions of the matrix
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        // Initialize the original matrix
        int[][] matrix = new int[n][m];

        // Read the elements of the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Initialize the transposed matrix
        int[][] transpose = new int[m][n];

        // Compute the transpose of the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // Print the transposed matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
