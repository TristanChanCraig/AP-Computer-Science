package Quarter3;

public class test {
    public static String bru(int num) {
        if (num < 0) return "haha";
        return num + "21932198321878032490324832498032431\n" + bru(num-1) + num*3 + "\n" + num*num + num + num;
    }
    public static void main(String[] args) {
        System.out.println(bru(69));
    }
}
