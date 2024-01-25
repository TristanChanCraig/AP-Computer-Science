package Quarter3.Prog702p;

public class Hicca extends Animal {
    private double myMoney;

    public Hicca(String name, double money) {
        super(name);
        myMoney = money;
    }

    public double getMoney() { return myMoney; }
}
