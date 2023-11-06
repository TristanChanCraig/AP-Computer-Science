package Quarter2;

public class ArrayTest {
    public static void main(String[] args) {
        int[] nums = new int[100];
        for (int lcv = 0; lcv < 100; lcv++) nums[lcv] = lcv + 1;

        for (int lcv = 0; lcv < 100; lcv++) System.out.print(nums[lcv] + " ");
        System.out.println();

        char[] hello = "Hello, world".toCharArray();
        // For-each Loop:
        // for (var x in array) {}
        for (char x : hello) System.out.print(x);
        System.out.println();

        String[] words = {"hello", "world", "wow", "cool", "wowsers", "cool beans"};
        // for (string temp : words) { do stuff }
        for (int lcv = 0; lcv < words.length; lcv++) System.out.println(words[lcv]);
    }
}
