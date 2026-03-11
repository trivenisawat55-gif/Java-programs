import java.io.*;

class MatrixMultiplication {
    public static void main(String[] args) {
        int N = 4; // Define the size of the matrix
        
        int mat1[][] = {
            {1, 1, 1, 1},
            {2, 2, 2, 2},
            {3, 3, 3, 3},
            {4, 4, 4, 4}
        };
        
        int mat2[][] = {
            {1, 1, 1, 1},
            {2, 2, 2, 2},
            {3, 3, 3, 3},
            {4, 4, 4, 4}
        };
        
        int res[][] = new int[N][N];
        int i, j, k;

        // Performing matrix multiplication
        for (i = 0; i < N; i++) {
            for (j = 0; j < N; j++) {
                res[i][j] = 0; // Initialize cell
                for (k = 0; k < N; k++) {
                    // Use += for dot product summation
                    res[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }

        // Printing the result
        System.out.println("Result Matrix is:");
        for (i = 0; i < N; i++) {
            for (j = 0; j < N; j++) {
                System.out.print(res[i][j] + " "); // Use print() to stay on one line
            }
            System.out.println(); // Move to next line after each row
        }
    }
}
