package Quarter2.StudentDB;

public class Student {
    private String myFirstName;
    private String myLastName;
    private int myId;
    private double myGPA;

    public Student(String firstname, String lastname, int id, double gpa) {
        myFirstName = firstname;
        myLastName = lastname;
        myId = id;
        myGPA = gpa;
    }

    public String getFirstName() { return myFirstName; }
    public String getLastName() { return myLastName; }
    public int getId() { return myId; }
    public double getGPA() { return myGPA; }
    public void setGPA(double gpa) { myGPA = gpa; }
}
