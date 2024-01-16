package Quarter2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog477a {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog477a.dat"));

            int[][] mat = new int[33][2];
            int[][] mat2 = new int[6][3];

            while (input.hasNext()) {
                for (int r = 0; r < mat.length; r++)
                    for (int c = 0; c < mat[0].length; c++)
                        mat[r][c] = input.nextInt();
            }

            for (int r = 0; r < mat.length; r++) {
                for (int c = 0; c < mat[0].length-1; c++) {
                    if (mat[r][0] == 1) {
                        if (mat[r][1] == 1) mat2[0][0]++;
                        else if (mat[r][1] == 2) mat2[1][0]++;
                        else if (mat[r][1] == 3) mat2[2][0]++;
                        else if (mat[r][1] == 4) mat2[3][0]++;
                        else mat2[4][0]++;
                    } else {
                        if (mat[r][1] == 1) mat2[0][1]++;
                        else if (mat[r][1] == 2) mat2[1][1]++;
                        else if (mat[r][1] == 3) mat2[2][1]++;
                        else if (mat[r][1] == 4) mat2[3][1]++;
                        else mat2[4][1]++;
                    }
                }
            }

            for (int r = 0; r < mat2.length; r++)
                for (int c = 0; c < mat2[0].length-1; c++) {
                    mat2[r][2] += mat2[r][c];
                }

            for (int r = 0; r < mat2.length-1; r++)
                for (int c = 0; c < mat2[0].length; c++) {
                    mat2[5][c] += mat2[r][c];
                }

            System.out.println("Grade\tMale\tFemale\tTotal");
            for (int r = 0; r < mat2.length-1; r++) {
                String str = "ABCDF";
                System.out.printf("%s\t\t%d\t\t%d\t\t%d\n", str.substring(r, r + 1), mat2[r][0], mat2[r][1], mat2[r][2]);
            }
            System.out.println("------------------------------------------");
            System.out.printf("Totals\t%d\t\t%d\t\t%d", mat2[5][0], mat2[5][1], mat2[5][2]);

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
/*
Grade	Male	Female	Total
A		2		4		6
B		4		4		8
C		4		7		11
D		2		3		5
F		3		0		3
------------------------------------------
Totals	15		18		33
 */