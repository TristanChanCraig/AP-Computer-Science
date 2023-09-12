package Quarter1;
import java.util.*;

public class GradeCalc {
    public static void main(String[] args) {
        // Input Section
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your grade as a percent: ");
        double gp = input.nextDouble();

        // Calculation Section
        // boolean test = (gp >= 90);
        // System.out.println(test);

        String grade = "";
        if (gp >= 90) grade = "A";
        else if (gp >= 80) grade = "B";
        else if (gp >= 70) grade = "C";
        else if (gp >= 60) grade = "D";
        else grade = "F";

        // Output Section
        System.out.println("Your grade is a(n) " + grade);
    }
}
