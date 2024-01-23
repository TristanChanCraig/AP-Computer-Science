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

            ArrayList<String> str = new ArrayList<>();
            for (int lcv = 0; lcv < gen1.length; lcv++) {
                String apple = input.nextLine();
                str.add(apple);
                for (int lcv2 = 0; lcv2 < gen1[0].length; lcv2++) {
                    gen1[lcv][lcv2] = str.get(lcv).substring(lcv2, lcv2+1);
                }
            }

            for (String[] cells : gen1) {
                for (String cell : cells)
                    System.out.print(cell + " ");
                System.out.println();
            }
            System.out.println();
            System.out.println();
            System.out.println();

            int neighbors = 0;
            for (int lcv = 0; lcv < gen1.length; lcv++) {
                for (int lcv2 = 0; lcv2 < gen1[0].length; lcv2++) {
                    neighbors = 0;
                    if (lcv != 0 && lcv != gen1.length - 1 && lcv2 != 0 && lcv2 != gen1[0].length - 1) {
                        if (gen1[lcv - 1][lcv2 - 1].equals("*")) neighbors++;
                        if (gen1[lcv][lcv2 - 1].equals("*")) neighbors++;
                        if (gen1[lcv + 1][lcv2 - 1].equals("*")) neighbors++;
                        if (gen1[lcv - 1][lcv2].equals("*")) neighbors++;
                        if (gen1[lcv + 1][lcv2].equals("*")) neighbors++;
                        if (gen1[lcv - 1][lcv2 + 1].equals("*")) neighbors++;
                        if (gen1[lcv][lcv2 + 1].equals("*")) neighbors++;
                        if (gen1[lcv + 1][lcv + 1].equals("*")) neighbors++;

                        if (lcv == 13 && lcv2 == 11) System.out.println(neighbors);

                        if (neighbors == 3 && gen1[lcv][lcv2].equals(".")) gen2[lcv][lcv2] = "*";
                        else if ((neighbors == 2 || neighbors == 3) && (gen1[lcv][lcv2].equals("*"))) gen2[lcv][lcv2] = "*";
                        else gen2[lcv][lcv2] = ".";
                    }
                    else
                        gen2[lcv][lcv2] = ".";

                }
            }
            for (String[] cells : gen2) {
                for (String cell : cells)
                    System.out.print(cell + " ");
                System.out.println();
            }

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}






/*

0 0
0 1
0 2
0 3
0 4
0 5
0 6
0 7
0 8
0 9
0 10
0 11
0 12
0 13
0 14
0 15
0 16
0 17
0 18
0 19
0 20
0 21
0 22
0 23
0 24
0 25
0 26
0 27
0 28
0 29
1 0
1 29
2 0
2 29
3 0
3 29
4 0
4 29
5 0
5 29
6 0
6 29
7 0
7 29
8 0
8 29
9 0
9 29
10 0
10 29
11 0
11 29
12 0
12 29
13 0
4
13 29
14 0
14 29
15 0
15 29
16 0
16 29
17 0
17 29
18 0
18 29
19 0
19 29
20 0
20 29
21 0
21 29
22 0
22 29
23 0
23 29
24 0
24 29
25 0
25 29
26 0
26 29
27 0
27 29
28 0
28 29
29 0
29 1
29 2
29 3
29 4
29 5
29 6
29 7
29 8
29 9
29 10
29 11
29 12
29 13
29 14
29 15
29 16
29 17
29 18
29 19
29 20
29 21
29 22
29 23
29 24
29 25
29 26
29 27
29 28
29 29
 */