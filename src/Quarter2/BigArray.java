package Quarter2;

public class BigArray {
    public static void main(String[] args) {
        int[] array = new int[19];
        for(int lcv = 0; lcv < array.length; lcv++) {
            array[lcv] = (int)(Math.random()*(91-20)+20);
        }

        for (int lcv = 0; lcv < array.length; lcv++) {
            System.out.print(array[lcv] + " ");
        }
        System.out.println();

        for (int temp: array) {
            System.out.print(temp + " ");
        }
        System.out.println();

        System.out.println("The middle number is " + array[array.length/2]);

        double avg = array[0] + array[array.length-1] + array[array.length/2];
        System.out.println("Average of the first, middle, and last numbers is " + (avg/3));

        int smallest = array[0];
        int largest = array[0];
        for (int num : array) {
            if (num < smallest) smallest = num;
            if (num > largest) largest = num;
        }
        System.out.println("The smallest number is " + smallest);
        System.out.println("The largest number is " + largest);

        for (int lcv = 0; lcv < array.length; lcv++) {
            if (array[lcv] == smallest) array[lcv] = largest;
            else if (array[lcv] == largest) array[lcv] = smallest;
        }

        for (int x : array) System.out.print(x + " ");
        System.out.println();

        int randNum = (int)(Math.random()*10+1);
        array[array.length/2] = randNum;

        for (int x : array) System.out.print(x + " ");
        System.out.println();

        for (int lcv = 0; lcv < array.length; lcv++) {
            array[lcv] += 10;
        }
        for (int x : array) System.out.print(x + " ");
        System.out.println();

        int myThird = array[2];
        array[2] = 5;
        System.out.println("The number that was ousted is " + myThird);
    }
}
