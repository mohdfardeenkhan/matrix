package arrayymatrix;

import java.util.Scanner;

public class SquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the dimension of the square matrix
        int N = scanner.nextInt();

        // Initialize the matrix
        int[][] matrix = new int[N][N];

        // Read the elements of the matrix
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Process the matrix by adding 1 to each element and print the result
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print((matrix[i][j] + 1) + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
