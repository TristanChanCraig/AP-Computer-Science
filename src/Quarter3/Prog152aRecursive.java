package Quarter3;

public class Prog152aRecursive {
    public static int recursive(int num) {
        int sum = num;
        if (num >= 9669) return sum;
        return sum += recursive(num + 3);
    }
    public static void main(String[] args) {
        System.out.println("The sum of the multiples of 3, from 3 to 9669 is: " + recursive(3));
    }
}
// The sum of the multiples of 3, from 3 to 9669 is: 15586428