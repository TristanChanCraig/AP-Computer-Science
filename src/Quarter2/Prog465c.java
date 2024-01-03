package Quarter2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog465c {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog465c.txt"));

            int[][] mat = new int[input.nextInt()][input.nextInt()];
            int totalEdges = 0;

            for (int r = 0; r < mat.length; r++) {
                for (int c = 0; c < mat[0].length; c++) {
                    mat[r][c] = input.nextInt();
                    if (r == 0 || r == mat.length - 1 || c == 0 || c == mat[0].length - 1) totalEdges += mat[r][c];
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

            System.out.print("The total of the edges is " + totalEdges);

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
