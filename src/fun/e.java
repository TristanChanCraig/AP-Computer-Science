package fun;

public class e {
    public static int Problem2(int threshold) {
        /* Your code here */
        double num = 0;
        int count = 0;
        for (int lcv = 1; num < threshold; lcv++) {
            num += Math.sqrt(lcv);
            count++;
        }
        return count;  // Remove
    }

    public static void main(String[] args) {
        System.out.println(Problem2(10));
    }
}
