package Quarter2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog465b {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/ .dat"));

            int[][] mat = new int[3][4];
            int[][] mat2 = new int[3][4];


            for (int r = 0; r < mat.length; r++) {
                for (int c = 0; c < mat[0].length; c++) {
                    mat[r][c] = input.nextInt();
                }
            }

            for (int r = 0; r < mat.length; r++) {
                for (int c = 0; c < mat[0].length; c++) {
                    if (mat[r][c] < 100) mat2[r][c] = mat[r][c];
                }
            }

            System.out.println("Original Table");
            for (int r = 0; r < mat.length; r++) {
                for (int c = 0; c < mat[0].length; c++) {
                    System.out.print(mat[r][c] + " ");
                }
                System.out.println();
            }
            System.out.println();

            System.out.println("Numbers Less Than 100");
            System.out.print("Row\t\tColumn");


        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
