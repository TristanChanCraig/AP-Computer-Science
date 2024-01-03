package Quarter2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog464d {

    /**
     * Performs matrix transposition on a 2D array of integers.
     * @param mat The 2D array to be transposed.
     * @return The transposition of {@code mat}
     */

    public static int[][] transpose(int[][] mat) {
        int[][] transposed = new int[mat[0].length][mat.length];
        for (int row = 0; row < mat.length; row++)
            for (int col = 0; col < mat[0].length; col++)
                transposed[col][row] = mat[row][col];
        return transposed;
    }

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog464a.dat"));
            int[][] mat = new int[5][5]; // 5 rows, 5 cols;

            // Read in matrix in Row-Major Orders
            for (int r = 0; r < mat.length; r++)
                for (int c = 0; c < mat[0].length; c++)
                    mat[r][c] = input.nextInt();

            int[][] mat_T = transpose(mat);

            System.out.println("Original Matrix");
            for (int[] row : mat) {
                for (int c : row)
                    System.out.print(c + " ");
                System.out.println();
            }

            System.out.println("\nTransposed Matrix");
            for (int row = 0; row < mat_T.length; row++) {
                for (int col = 0; col < mat_T[0].length; col++)
                    System.out.print(mat_T[row][col] + " ");
                System.out.println();
            }

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
