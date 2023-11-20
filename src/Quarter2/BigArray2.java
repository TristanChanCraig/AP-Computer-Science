package Quarter2;

import java.io.File;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;
import Quarter2.Cat;

public class BigArray2 {
    public static void printCat(Cat cat) {
        System.out.println(cat.getName() + "\t" + cat.getWeight() + "\t"
                            + cat.getAge() + "\t" + cat.getCost());
    }

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/bigarraylist.dat"));
            int numCats = input.nextInt();
            input.nextLine();
            Cat[] cats = new Cat[50];

            for(int lcv = 0; lcv < numCats; lcv++) {
                String name = input.nextLine();
                double weight = input.nextDouble();
                int age = input.nextInt();
                double cost = input.nextDouble();
                input.nextLine();
                cats[lcv] = new Cat(name, weight, age, cost);
            }
//            1. Print out all the cats (there is no toString() available)
            System.out.println("1. All the cats: ");
            System.out.println("Name\tWeight\tAge\tCost");
            for (int lcv = 0; lcv < numCats; lcv++) printCat(cats[lcv]);
//
//            2. Print the name of the 3 rd cat.
            System.out.println("\n2. The Third cat is named: " + cats[2].getName());
//
//            3. The last cat has gained 10 pounds. Update the weight on the object. Print the new weight.
            cats[numCats-1].setWeight(cats[numCats-1].getWeight() + 10);
            System.out.println("3. The updated weight is: " + cats[numCats-1].getWeight());
//
//            4. The cat named Rascal died. Find that cat and remove it from the list.
            int rascalIndex = 0;
            for (int lcv = 0; lcv < numCats; lcv++) if (cats[lcv].getName().equals("Rascal")) rascalIndex = lcv;
            for (int lcv = rascalIndex; lcv < numCats-1; lcv++) cats[lcv] = cats[lcv+1];
            numCats--;
//
//            5. A new kitten was brought in (Angel, 3.6, 1, 25.99). Insert it into the 2nd cell.
            for (int lcv = numCats; lcv > 1; lcv--) cats[lcv] = cats[lcv-1];
            cats[1] = new Cat("Angel", 3.6, 1, 25.99);
            numCats++;
//
//            6. A new geriatric cat was found (Gimpy, 14.3, 10, 29.99). Put him on the list.
            cats[numCats] = new Cat("Gimpy", 14.3, 10, 29.99);
            numCats++;
//
//            7. Print the updated list with a for-each loop
            System.out.println("\n7. The updated list is: ");
            for (Cat cat : cats) if (cat != null) System.out.println(cat.getName());
//
//            8. Replace the 3 rd cat with (Sugar, 23.6, 7, 33.25) put the removed cat at the end of the list.
            Cat temp = cats[2];
            cats[2] = new Cat("Sugar", 23.6, 7, 33.25);
            cats[numCats] = temp;
            numCats++;
//
//            9. Switch the 2 nd and 4 th cats.
            Cat tempCat = cats[1];
            cats[1] = cats[3];
            cats[3] = tempCat;
//
//            10. Print the names of the cats on the list.

//            11. Remove all cats under $26. Print the costs of each cat remaining on the list.
            for (int lcv = 0; lcv < numCats; lcv++) if (cats[lcv].getCost() < 26) cats[lcv] = null;

//            12. All cats heavier than 15 pounds need to go on a diet <-- no for-each this time.
//              Print the names of the cats being put on a diet.
            while (input.hasNext()) {

            }

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}