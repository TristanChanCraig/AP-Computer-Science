package Quarter2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog465h {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog465h.dat"));

            while (input.hasNext()) {
                int[][] mat = new int[input.nextInt()][input.nextInt()];

                int cnt = 0;
                for (int r = 0; r < mat.length; r++)
                    for (int c = 0; c < mat[0].length; c++) {
                        mat[r][c] = input.nextInt();
                        if (mat[r][c] != 0) cnt++;
                    }

                int[][] mat2 = new int[cnt][3];

                int cnt2 = 0;
                for (int r = 0; r < mat.length; r++)
                    for (int c = 0; c < mat[0].length; c++)
                        if (mat[r][c] != 0) {
                            mat2[cnt2][0] = r+1;
                            mat2[cnt2][1] = c+1;
                            mat2[cnt2][2] = mat[r][c];
                            cnt2++;
                        }

                for

            }

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
