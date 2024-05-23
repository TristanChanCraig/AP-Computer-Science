package Quarter4.Prog7000l;

import java.util.*;
import java.io.*;

public class Prog7000l {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog7000l.csv"));

            ArrayList<Double[]> X = new ArrayList<>();
            ArrayList<Double> y = new ArrayList<>();
            // Home, Price, SqFt, Bedrooms, Bathrooms, Offers, Brick, Neighborhood
            input.nextLine();
            while (input.hasNextLine()) {
                String line = input.nextLine();
                String[] data = line.split(",");
                Double[] row = {
                  Double.parseDouble(data[2]),
                  Double.parseDouble(data[0])
                };
                y.add(Double.parseDouble(data[1]));
                X.add(row);
            }
            double[][] X_train = new double[X.size()][2];
            for (int i = 0; i < X.size(); i++) {
                X_train[i][0] = X.get(i)[0];
                X_train[i][1] = X.get(i)[1];
            }

            double[] y_train = new double[y.size()];
            for (int i = 0; i < y.size(); i++) y_train[i] = y.get(i);

            var lr = new LinearRegression(60, 100,
                                            0.0000001, 0.00001);
            lr.fit(X_train, y_train, 100);
            System.out.println(lr);

            double sqFoot = 1897;
            // Find comparable data point
            double closestPoint = X_train[0][0];
            int closestIndex = 0;
            for (int i = 1; i < X_train.length; i++) {
                if (Math.abs(X_train[i][0] - sqFoot) < Math.abs(closestPoint - sqFoot)) {
                    closestPoint = X_train[i][0];
                    closestIndex = i;
                }
            }
            System.out.println("Predicted output for " + sqFoot + ": " + lr.predict(sqFoot));
            System.out.println("Compared to " + closestPoint + ": " + y_train[closestIndex]);

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
/*
Regression line: y = 65.18901820755923 * x + 100.00145793425986
Objective: [7.774677E10, 6.873712989523952E10, 6.554552441877214E10, 6.4414919266937515E10, 6.401440986212349E10, 6.387253205161194E10, 6.382227277448375E10, 6.380446875744069E10, 6.3798161801835846E10, 6.379592760427917E10, 6.3795136154350395E10, 6.379485578823595E10, 6.3794756470185776E10, 6.379472128721606E10, 6.3794708823674866E10, 6.379470440834108E10, 6.379470284403159E10, 6.379470228967862E10, 6.3794702093096115E10, 6.379470202325135E10, 6.3794701998302666E10, 6.379470198925809E10, 6.379470198584746E10, 6.3794701984432594E10, 6.379470198372475E10, 6.379470198326732E10, 6.3794701982898636E10, 6.37947019825613E10, 6.379470198223521E10, 6.3794701981913025E10, 6.379470198159222E10, 6.3794701981271904E10, 6.3794701980951744E10, 6.379470198063173E10, 6.379470198031166E10, 6.379470197999164E10, 6.37947019796716E10, 6.379470197935154E10, 6.3794701979031494E10, 6.3794701978711494E10, 6.379470197839147E10, 6.379470197807144E10, 6.379470197775143E10, 6.3794701977431366E10, 6.379470197711137E10, 6.3794701976791336E10, 6.3794701976471275E10, 6.379470197615127E10, 6.37947019758312E10, 6.379470197551118E10, 6.379470197519116E10, 6.379470197487114E10, 6.379470197455109E10, 6.379470197423106E10, 6.379470197391105E10, 6.3794701973590996E10, 6.3794701973271E10, 6.379470197295093E10, 6.379470197263092E10, 6.379470197231088E10, 6.379470197199082E10, 6.379470197167081E10, 6.3794701971350784E10, 6.379470197103074E10, 6.3794701970710754E10, 6.3794701970390686E10, 6.379470197007067E10, 6.379470196975062E10, 6.3794701969430595E10, 6.379470196911055E10, 6.379470196879054E10, 6.3794701968470505E10, 6.379470196815049E10, 6.3794701967830444E10, 6.379470196751041E10, 6.379470196719038E10, 6.3794701966870384E10, 6.379470196655032E10, 6.37947019662303E10, 6.379470196591026E10, 6.379470196559021E10, 6.379470196527017E10, 6.3794701964950165E10, 6.3794701964630135E10, 6.379470196431011E10, 6.3794701963990074E10, 6.379470196367006E10, 6.379470196335003E10, 6.379470196302998E10, 6.379470196270993E10, 6.379470196238993E10, 6.379470196206991E10, 6.379470196174983E10, 6.37947019614298E10, 6.379470196110979E10, 6.379470196078974E10, 6.379470196046971E10, 6.379470196014971E10, 6.3794701959829666E10, 6.3794701959509605E10]
 Min. Objective: 6.3794701959509605E10
Predicted output for 1897.0: 123763.56899767411
Compared to 1900.0: 106900.0

 */