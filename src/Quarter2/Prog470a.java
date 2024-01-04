package Quarter2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog470a {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog464a.dat"));

            int[][] mat = new int[6][5];

            for (int r = 0; r < mat.length-1; r++)
                for (int c = 0; c < mat[0].length; c++)
                    mat[r][c] = input.nextInt();

            int sum = 0;
            for (int c = 0; c < mat[0].length; c++) {
                for (int r = 0; r < mat.length - 1; r++) {
                    sum += mat[r][c];
                }
                mat[5][c] = sum;
                sum = 0;
            }

            for (int[] row : mat) {
                for (int c : row)
                    System.out.print(c + "\t");
                System.out.println();
            }

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
