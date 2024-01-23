package Quarter3.Prog701g;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prog701g {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog701g.dat"));
            List<Person> list = new ArrayList<>();


        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
