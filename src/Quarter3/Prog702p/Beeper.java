package Quarter3.Prog702p;

public class Beeper extends Animal {
    private String mySpWord;

    public Beeper(String name, String spWord) {
        super(name);
        mySpWord = spWord;
    }

    public String getSpWord() { return mySpWord; }
}
