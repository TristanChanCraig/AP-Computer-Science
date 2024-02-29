package Quarter3.tinyfarm;

public class husky {
    private String myName;
    private int myAge;
    public husky(String name, int age) {
        myName = name;
        myAge = age;
    }

    public void woof() {
        System.out.println(myName + ": woof");
    }

    public void sleep() {
        System.out.println(myName + ": zzz");
        myAge++;
    }

    public int getAge() { return myAge; }
    public String getName() { return myName; }
}
