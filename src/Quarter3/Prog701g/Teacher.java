package Quarter3.Prog701g;

public class Teacher extends Person {
    private int myNumStus;

    public Teacher(String fn, String ln, int stu) {
        super(fn, ln);
        myNumStus = stu;
    }

    public int getNumStus() { return myNumStus; }
}
