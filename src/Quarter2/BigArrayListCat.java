package Quarter2;

import java.io.File;
import java.io.IOException;
import java.sql.Array;
import java.util.Scanner;
import java.util.ArrayList;

public class BigArrayListCat {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/bigarraylist.dat"));
            int numCats = input.nextInt();
            input.nextLine();
            ArrayList<Cat> cats = new ArrayList<Cat>();

            for (int lcv = 0; lcv < numCats; lcv++) {
                String name = input.nextLine();
                double weight = input.nextDouble();
                int age = input.nextInt();
                double cost = input.nextDouble();
                input.nextLine();
                cats.add(new Cat(name, weight, age, cost));
            }


            System.out.println("1. All the cats: ");
            System.out.println("Name\tWeight\tAge\tCost");
            for (Cat cat : cats) {
                System.out.printf("%s\t%.2f\t%d\t%.2f\n", cat.getName(), cat.getWeight(), cat.getAge(), cat.getCost());
            }


            System.out.println("\n2. The third cat is named: " + cats.get(2).getName());
            System.out.println();



            cats.get(cats.size()-1).setWeight(cats.get(cats.size()-1).getWeight()+10);
            System.out.println("\n3. The updated weight is: " + cats.get(cats.size()-1).getWeight());
            System.out.println();



            for (int lcv = 0; lcv < cats.size(); lcv++) {
                if (cats.get(lcv).getName().equals("Rascal")) {
                    cats.remove(lcv);
                }
            }



            cats.add(1, new Cat("Angel", 3.6, 1, 25.99));



            cats.add(new Cat("Gimpy", 14.3, 10, 29.99));



            System.out.println("7. The updated list is: ");
            System.out.println("Name\tWeight\tAge\tCost");
            for (Cat cat : cats) {
                System.out.printf("%s\t%.2f\t%d\t%.2f\n", cat.getName(), cat.getWeight(), cat.getAge(), cat.getCost());
            }
            System.out.println();



            Cat temp = cats.get(2);
            cats.set(2, new Cat("Sugar", 23.6, 7, 33.25));
            cats.add(temp);



            temp = cats.get(1);
            cats.set(1, cats.get(3));
            cats.set(3, temp);



            System.out.println("10. The updated list is: ");
            System.out.println("Name\tWeight\tAge\tCost");
            for (Cat cat : cats) {
                System.out.printf("%s\t%.2f\t%d\t%.2f\n", cat.getName(), cat.getWeight(), cat.getAge(), cat.getCost());
            }
            System.out.println();



            System.out.println("\n11. The costs of the cats that are over $26 are: ");
            for (int lcv = 0; lcv < cats.size(); lcv++) {
                if (cats.get(lcv).getCost() < 26) cats.remove(lcv);
            }
            for (Cat cat : cats) {
                System.out.println("$" + cat.getCost() + "\t");
            }


            System.out.println("\n12. The cats being put on a diet are: ");
            for (int lcv = 0; lcv < cats.size(); lcv++) {
                Cat cat = cats.get(lcv);
                if (cat.getWeight() > 15) System.out.println(cat.getName() + "\t");
            }
            System.out.println();

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
