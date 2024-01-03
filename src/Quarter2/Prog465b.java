package Quarter2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog465b {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog465b.dat"));

            int[][] mat = new int[3][4];
            int[] arr = new int[12];


            for (int r = 0; r < mat.length; r++) {
                for (int c = 0; c < mat[0].length; c++) {
                    mat[r][c] = input.nextInt();
                }
            }

            int cnt = 0;
            for (int r = 0; r < mat.length; r++) {
                for (int c = 0; c < mat[0].length; c++) {
                    if (mat[r][c] < 100) {
                        arr[cnt] = r + 1;
                        cnt++;
                        arr[cnt] = c + 1;
                        cnt++;
                    }
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

            System.out.println("Numbers Less Than 100:");
            System.out.println("Row\t\tColumn");

            for (int lcv = 0; lcv < cnt; lcv+=2) {
                System.out.println(arr[lcv] + "\t\t" + arr[lcv+1]);
            }

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
