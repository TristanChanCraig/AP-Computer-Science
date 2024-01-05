package Quarter2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog475a {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/ .dat"));

            int[][] mat = new int[11][2];

            String[][] directFlight =

            for (int r = 0; r < mat.length - 1; r++) {
                for (int c = 0; c < mat[0].length - 1; c+=2) {
                    mat[r][0] = input.nextInt();
                    mat[r][1] = input.nextInt();
                }
            }


        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
