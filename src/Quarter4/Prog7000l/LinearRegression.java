package Quarter4.Prog7000l;

import java.util.Arrays;
public class LinearRegression {
    private double theta0;      // y-intercept
    private double theta1;      // slope
    private double alpha;       // learning rate
    private double tolerance;   // cost threshold
    private double[] objective; // cost per epoch

    public LinearRegression(double thetaOne, double thetaZero, double learningRate, double tol) {
        theta0 = thetaZero;
        theta1 = thetaOne;
        alpha = learningRate;
        tolerance = tol;
    }

    public void fit(double[][] X_train, double[] y_train, int epochs) {
        int m = X_train.length;
        objective = new double[epochs];
        double[] e = new double[m];

        for (int epoch = 0; epoch < epochs; epoch++) {
            if (epoch > 0) {
                double temp0 = 0, temp1 = 0;

                // RHS of Gradient Descent
                for (int i = 0; i < m; i++) {
                    // predicted label - actual label
                    double temp = (theta1 * X_train[i][0] + theta0) - y_train[i];
                    temp0 += temp;
                    temp1 += temp * X_train[i][0];
                }
                // LHS of Gradient Descent
                theta0 -= (1.0/m) * alpha * temp0;
                theta1 -= (1.0/m) * alpha * temp1;
            }
            for (int i = 0; i < m; i++) e[i] = (theta1 * X_train[i][0] + theta0) - y_train[i]; // J(TH0, TH1)
            double obj = 0;
            for (int i = 0; i < m; i++) obj += e[i] * e[i];
            objective[epoch] = obj;

            if (epoch > 1 && Math.abs(objective[epoch] - objective[epoch - 1]) < tolerance) break;
        }
        // TODO: calculate error/cost and repeat
    }

    public String toString() {
        return "Regression line: y = " + theta1 + " * x + " + theta0 +
                "\nObjective: " + Arrays.toString(objective) +
                "\n Min. Objective: " + (double)Arrays.stream(objective).min().getAsDouble();
    }

    public double getIntercept() { return theta0; }
    public double getSlope() { return theta1; }
    public double predict(double x) { return theta1 * x + theta0; }
}
