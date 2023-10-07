package Quarter1.Prog54bCl;

public class Prog54bCl {
    public static void main(String[] args) {
        Cl54b wow = new Cl54b(475, 821, 369, 562);
        wow.calc();

        int sum = wow.getSum();
        double avg = wow.getAvg();

        System.out.println("The sum of the four numbers is " + sum);
        System.out.print("The average of the four numbers is " + avg);
    }
}
/*
The sum of the four numbers is 2227
The average of the four numbers is 556.75
 */