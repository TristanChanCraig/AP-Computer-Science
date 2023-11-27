package Quarter2.Prog410t;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog410t {
    public static void main(String[] args) {
        try {
            Scanner s1 = new Scanner(new File("Langdat/survey.dat"));
            Scanner s2 = new Scanner(new File("Langdat/survey2.dat"));


            while (s1.hasNext()) {

            }

            while (s2.hasNext()) {

            }

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}