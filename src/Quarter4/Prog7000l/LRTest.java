package Quarter4.Prog7000l;

public class LRTest {
    public static void main(String[] args) {
        double[][] X_train = {
                {2.49, 1},
                {3.61, 1},
                {2.61, 1},
                {5.21, 1},
                {2.19, 1},
                {1.63, 1},
                {12.55, 1},
                {6.41, 1},
                {8.32, 1}
        };
        double[] y_train = {312.21, 321.54, 465.17, 121.46, 653.62, 121.32, 657.01, 177.9, 210.3};
        var lr = new LinearRegression(5, 100, 0.01, 0.001);
        lr.fit(X_train, y_train, 1000);
        System.out.println(lr.toString());
        double newInput = 6.75;
        System.out.println("Predicted output for " + newInput + ": " + lr.predict(newInput));
        System.out.println("Compared to " + X_train[7][0] + ": " + y_train[7]);
        System.out.println("Compared to " + X_train[8][0] + ": " + y_train[8]);

    }
}
