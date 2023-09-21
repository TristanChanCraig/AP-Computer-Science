package Quarter1;

public class Prog166f {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 100;
        int ogNum1 = 1;
        int ogNum2 = 100;
        int sum = 0;

        while (ogNum2 <= 110) {
            while (num1 < num2) {
                sum += num1 + num2;
                num1++;
                num2--;
            }
            if (num1 == num2) {
                sum = sum + num1;
            }
            System.out.printf("The sum of numbers from %d to %d is %d\n", ogNum1, ogNum2, sum);
            ogNum2++;
            num2 = ogNum2;
            num1 = 1;
            sum = 0;
        }
    }
}
/*
The sum of numbers from 1 to 100 is 5050
The sum of numbers from 1 to 101 is 5151
The sum of numbers from 1 to 102 is 5253
The sum of numbers from 1 to 103 is 5356
The sum of numbers from 1 to 104 is 5460
The sum of numbers from 1 to 105 is 5565
The sum of numbers from 1 to 106 is 5671
The sum of numbers from 1 to 107 is 5778
The sum of numbers from 1 to 108 is 5886
The sum of numbers from 1 to 109 is 5995
The sum of numbers from 1 to 110 is 6105
 */