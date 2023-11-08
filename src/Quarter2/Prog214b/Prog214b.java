package Quarter2.Prog214b;

import Quarter2.Prog435g.Cl435g;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog214b {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog214b.dat"));;

            Cl214b[] eek = new Cl214b[100];
            int cnt = 0;

            while (input.hasNextLine()) {
                int eNum = input.nextInt();
                double YTDpay = input.nextDouble();
                double rate = input.nextDouble();
                double SF = input.nextDouble();
                double hours = input.nextDouble();
                Cl214b gah = new Cl214b(eNum, YTDpay, rate, SF, hours);

                eek[cnt] = gah;
                cnt++;
            }

            for (int lcv = 0; lcv < cnt; lcv++) eek[lcv].calc();

            for (int lcv = 0; lcv < cnt; lcv++) System.out.println(eek[lcv].toString());


        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
/*
Employee Number: 1001
Hours: 34.50	Rate: 4.50	Shift Factor: 1.25
	Current			Year-to Date
Gross Pay: 194.06	1056.10
Withholding: 23.29
FICA:		11.74
Net Pay:	159.03

Employee Number: 1002
Hours: 25.00	Rate: 3.25	Shift Factor: 1.00
	Current			Year-to Date
Gross Pay: 81.25	3970.00
Withholding: 0.00
FICA:		4.92
Net Pay:	76.33

Employee Number: 1003
Hours: 30.00	Rate: 4.00	Shift Factor: 1.00
	Current			Year-to Date
Gross Pay: 120.00	12485.50
Withholding: 9.60
FICA:		7.26
Net Pay:	103.14

Employee Number: 1004
Hours: 38.50	Rate: 5.25	Shift Factor: 1.50
	Current			Year-to Date
Gross Pay: 303.19	15587.40
Withholding: 53.06
FICA:		18.34
Net Pay:	231.79

Employee Number: 1005
Hours: 40.00	Rate: 6.25	Shift Factor: 1.00
	Current			Year-to Date
Gross Pay: 250.00	17188.50
Withholding: 37.50
FICA:		15.13
Net Pay:	197.38

Employee Number: 1006
Hours: 48.00	Rate: 8.95	Shift Factor: 1.50
	Current			Year-to Date
Gross Pay: 644.40	19109.40
Withholding: 112.77
FICA:		0.00
Net Pay:	531.63

Employee Number: 1007
Hours: 35.00	Rate: 5.00	Shift Factor: 1.50
	Current			Year-to Date
Gross Pay: 262.50	15600.00
Withholding: 39.38
FICA:		15.88
Net Pay:	207.24
 */