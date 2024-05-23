package Quarter4.Prog7300p;

import java.util.Arrays;

public class Prog7300p {
    public static void main(String[] args) {
        // AND Neuron
        double[][] X_train = {
            {0, 0},
            {0, 1},
            {1, 0},
            {1, 1}
        };
        double[] y_train = {0, 0, 0, 1};

        System.out.println("AND Neuron: ");
        var model = new Perceptron(0.1, 15);
        model.fit(X_train, y_train);

        // Predict using the trained model
        double[] y_pred = model.predict(X_train);
        System.out.println("Predicted: " + Arrays.toString(y_pred));
        System.out.println("Actual: " + Arrays.toString(y_train));

        // Print weights and bias(es)
        System.out.println("Weights: " + Arrays.toString(model.getWeights()));
        System.out.println("Bias: " + model.getBias());

        // Make neurons for OR, NOT, NAND, and NOR

        // OR
        X_train = new double[][]{
                {0, 0},
                {0, 1},
                {1, 0},
                {1, 1}
        };
        y_train = new double[]{0, 1, 1, 1};

        System.out.println("OR Neuron: ");
        model.fit(X_train, y_train);

        y_pred = model.predict(X_train);
        System.out.println("Predicted: " + Arrays.toString(y_pred));
        System.out.println("Actual: " + Arrays.toString(y_train));

        System.out.println("Weights: " + Arrays.toString(model.getWeights()));
        System.out.println("Bias: " + model.getBias());
        System.out.println();

        // NOR dataset
        X_train = new double[][]{
                {0, 0},
                {0, 1},
                {1, 0},
                {1, 1}
        };
        y_train = new double[]{1, 1, 1, 0};

        System.out.println("NOR Neuron: ");
        model.fit(X_train, y_train);

        y_pred = model.predict(X_train);
        System.out.println("Predicted: " + Arrays.toString(y_pred));
        System.out.println("Actual: " + Arrays.toString(y_train));

        System.out.println("Weights: " + Arrays.toString(model.getWeights()));
        System.out.println("Bias: " + model.getBias());
        System.out.println();

        // NOT dataset
        X_train = new double[][]{
                {0},
                {1}
        };
        y_train = new double[]{1, 0};

        System.out.println("NOT Neuron: ");
        model.fit(X_train, y_train);

        y_pred = model.predict(X_train);
        System.out.println("Predicted: " + Arrays.toString(y_pred));
        System.out.println("Actual: " + Arrays.toString(y_train));

        System.out.println("Weights: " + Arrays.toString(model.getWeights()));
        System.out.println("Bias: " + model.getBias());
        System.out.println();

        // NAND dataset
        X_train = new double[][]{
                {0, 0},
                {0, 1},
                {1, 0},
                {1, 1}
        };
        y_train = new double[]{1, 0, 0, 0};

        System.out.println("NAND Neuron: ");
        model.fit(X_train, y_train);

        y_pred = model.predict(X_train);
        System.out.println("Predicted: " + Arrays.toString(y_pred));
        System.out.println("Actual: " + Arrays.toString(y_train));

        System.out.println("Weights: " + Arrays.toString(model.getWeights()));
        System.out.println("Bias: " + model.getBias());
        System.out.println();
    }
}