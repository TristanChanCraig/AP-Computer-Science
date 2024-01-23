package Quarter3.Prog701g;

public class Student extends Person {
    private double myGPA;

    public Student(String fn, String ln, double gpa) {
        super(fn, ln);
        myGPA = gpa;
    }

    public double getGPA() { return myGPA; }
}
