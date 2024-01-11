package Quarter2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog477a {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog477a  .dat"));

            int[][] mat = new int[33][2];
            int[][] mat2 = new int[6][3];
//            int mA = 0;
//            int mB = 0;
//            int mC = 0;
//            int mD = 0;
//            int mF = 0;
//            int fA = 0;
//            int fB = 0;
//            int fC = 0;
//            int fD = 0;
            while (input.hasNext()) {
                for (int r = 0; r < mat.length; r++)
                    for (int c = 0; c < mat[0].length; c++)
                        mat[r][c] = input.nextInt();
            }

            for (int r = 0; r < mat.length; r++) {
                for (int c = 0; c < mat[0].length; c++) {
                    if (c == 0) {
                        if (r == 1) mat2[]
                    }
                }
            }

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
