package Quarter2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog465a {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog465a.dat"));

            int[][] mat = new int[4][4];
            int[][] mat2 = new int[4][4];
            int[][] mat3 = new int[4][4];

            for (int r = 0; r < mat.length; r++) {
                for (int c = 0; c < mat[0].length; c++) {
                    mat[r][c] = input.nextInt();
                }
            }

            for (int r = 0; r < mat2.length; r++) {
                for (int c = 0; c < mat2[0].length; c++) {
                    mat2[r][c] = input.nextInt();
                }
            }

            for (int r = 0; r < mat2.length; r++) {
                for (int c = 0; c < mat2[0].length; c++) {
                    mat3[r][c] = Math.max(mat[r][c], mat2[r][c]);
                }
            }

            System.out.println("Matrix 1");
            for (int r = 0; r < mat.length; r++) {
                for (int c = 0; c < mat[0].length; c++) {
                    System.out.print(mat[r][c] + " ");
                }
                System.out.println();
            }
            System.out.println();

            System.out.println("Matrix 2");
            for (int r = 0; r < mat2.length; r++) {
                for (int c = 0; c < mat[0].length; c++) {
                    System.out.print(mat2[r][c] + " ");
                }
                System.out.println();
            }
            System.out.println();

            System.out.println("Matrix 3");
            for (int r = 0; r < mat3.length; r++) {
                for (int c = 0; c < mat3[0].length; c++) {
                    System.out.print(mat3[r][c] + " ");
                }
                System.out.println();
            }

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
