package Quarter2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog465h {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog465h.dat"));

            while (input.hasNext()) {
                int row = input.nextInt();
                int col = input.nextInt();
                int[][] mat = new int[row][col];

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

                System.out.println("Original Matrix");
                for (int[] r : mat) {
                    for (int num : r)
                        System.out.print(num + "\t");
                    System.out.println();
                }
                System.out.println();

                for (int[] r : mat2) {
                    for (int num : r)
                        System.out.print(num + "\t");
                    System.out.println();
                }
                System.out.println();

                if (cnt2 * 3 < row * col) System.out.println("The Original Matrix is Sparse");
                else if (cnt2 * 3 > row * col) System.out.println("The Original Matrix is Abundant");
                else System.out.println("The Original Matrix and the Sparse Matrix are Equally Efficient");
                System.out.println();

                System.out.println();
            }

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
/*
Original Matrix
0	0	7	0	0	0
0	0	0	0	-8	0
0	0	0	0	0	0
2	0	0	0	0	0
0	0	0	0	0	0

1	3	7
2	5	-8
4	1	2

The Original Matrix is Sparse


Original Matrix
0	2	0	3	0	1
8	0	4	0	1	0
0	3	0	1	0	-7
5	0	9	0	6	0
0	2	0	-1	0	7

1	2	2
1	4	3
1	6	1
2	1	8
2	3	4
2	5	1
3	2	3
3	4	1
3	6	-7
4	1	5
4	3	9
4	5	6
5	2	2
5	4	-1
5	6	7

The Original Matrix is Abundant


Original Matrix
0	0	1	0	0	2
3	0	0	4	0	0
0	0	5	0	0	6
7	0	0	8	0	0
0	0	9	0	0	1

1	3	1
1	6	2
2	1	3
2	4	4
3	3	5
3	6	6
4	1	7
4	4	8
5	3	9
5	6	1

The Original Matrix and the Sparse Matrix are Equally Efficient
 */