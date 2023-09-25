package Quarter1;

import java.util.Scanner;

public class LP4_1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of copies to be printed:");
        int copies = input.nextInt();
        double costPerCopy = 0;
        double totalCost = 0;
        if (copies < 100) {
            costPerCopy = 0.30;
        } else if (copies < 500) {
            costPerCopy = 0.28;
        } else if (copies < 750) {
            costPerCopy = 0.27;
        } else if (copies <= 1000) {
            costPerCopy = 0.26;
        } else {
            costPerCopy = 0.25;
        }
        totalCost = costPerCopy * copies;
        System.out.println("Price per copy is: $" + costPerCopy);
        System.out.println("Total cost is: $" + totalCost);
    }
}
