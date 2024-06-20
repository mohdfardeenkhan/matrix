package arrayymatrix;

import java.util.Scanner;

public class RectangularMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the dimensions of the rectangular matrix
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        // Initialize the matrix
        int[][] matrix = new int[N][M];

        // Read the elements of the matrix
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Process the matrix by adding 1 to each element and print the result
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print((matrix[i][j] + 1) + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}

