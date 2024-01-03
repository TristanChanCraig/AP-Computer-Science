package Quarter2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog470b {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/ .dat"));


        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
