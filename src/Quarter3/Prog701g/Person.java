package Quarter3.Prog701g;

public class Person implements names {
    private String myFirst;
    private String myLast;

    public Person(String fn, String ln) {
        myFirst = fn;
        myLast = ln;
    }

    public String getFirst() { return myFirst; }
    public String getLast() { return myLast; }
    public String getName() { return myFirst + " " + myLast; }
}
