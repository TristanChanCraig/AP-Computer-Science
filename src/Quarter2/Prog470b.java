package Quarter2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog470b {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog464a.dat"));

            int[][] mat = new int[5][5];

            int mDsum = 0;
            int oDsum = 0;

            for (int r = 0; r < mat.length; r++)
                for (int c = 0; c < mat[0].length; c++) {
                    mat[r][c] = input.nextInt();
                    if (r == c) mDsum += mat[r][c];
                    if (r + c == 4) oDsum += mat[r][c];
                }

            System.out.println("Original Matrix:");
            for (int[] row : mat) {
                for (int c : row)
                    System.out.print(c + "\t");
                System.out.println();
            }
            System.out.println();

            System.out.println("Main Diagonal Sum: " + mDsum);
            System.out.println("Other Diagonal Sum: " + oDsum);

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
