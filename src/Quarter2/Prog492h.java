package Quarter2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Prog492h {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog492h.dat"));

            String[][] gen1 = new String[30][30];
            String[][] gen2 = new String[30][30];

            for (int lcv = 0; lcv < gen1.length; lcv++) {
                ArrayList<String> str = new ArrayList<>();
                String apple = input.nextLine();
                str.add(apple);
                for (int lcv2 = 0; lcv2 < gen1[0].length; lcv2++) {
                    gen1[lcv][lcv2] = str.get(lcv).substring(lcv2, lcv2+1);
                }
            }
            while (true) {
                int neighbors = 0;
                for (int lcv = 0; lcv < gen1.length; lcv++) {
                    for (int lcv2 = 0; lcv2 < gen1[0].length; lcv2++) {
                        if (lcv != 0 && lcv != gen1.length - 1 && lcv2 != 0 && lcv2 != gen1[0].length - 1) {
                            if (gen1[lcv - 1][lcv2 - 1].equals("*") ||
                                    gen1[lcv][lcv2 - 1].equals("*") ||
                                    gen1[lcv + 1][lcv2 - 1].equals("*") ||
                                    gen1[lcv - 1][lcv2].equals("*") ||
                                    gen1[lcv + 1][lcv2].equals("*") ||
                                    gen1[lcv - 1][lcv2 + 1].equals("*") ||
                                    gen1[lcv][lcv2 + 1].equals("*") ||
                                    gen1[lcv + 1][lcv + 1].equals("*")) neighbors++;
                            if (neighbors == 3) gen2[lcv][lcv2] = "*";
                            else if (neighbors <= 1) gen2[lcv][lcv2] = ".";
                            else if (neighbors >= 4) gen2[lcv][lcv2] = ".";
                        }
                        else gen2[lcv][lcv2] = ".";
                    }
                }
                for (String cells[] : gen2) {
                    for (String cell : cells)
                        System.out.println(cell + "\t");
                    System.out.println();
                }
            }

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}






