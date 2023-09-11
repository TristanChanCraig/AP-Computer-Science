package Quarter1;

public class Prog88a {
    public static void main(String[] args) {
        // Enter number 1-13
        // Enter number 2-20
        // Math.random() * (man - min) + min
        int num1 = (int)(Math.random() * (13 - 1)) + 1;
        int num2 = (int)(Math.random() * (20 - 1)) + 1;
        // Sum, difference, product, average, abs, value of difference, max, and min
        int sum = num1 + num2;
        int dif = num1 - num2;
        int absdif = Math.abs(dif);
        int max, min;
        // The code inside 'if' will only run if the condition is true
        if (num1 > num2) {
            max = num1;
            // min = num2;
        } else { // Otherwise...
            max = num2;
            // min = num1;
        }

        // Check if 'max' and 'num1' are the same value using ==
        if (max == num1) {
            min = num2;
        } else {
            min = num1;
        }

        System.out.println("Original numbers are " + num1 + " and " + num2);

        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
    }
}
