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
/*
AND Neuron:
Epoch 1: Loss: 0.0
Epoch 2: Loss: 0.25
Epoch 3: Loss: 0.25
Epoch 4: Loss: 0.25
Epoch 5: Loss: 0.25
Epoch 6: Loss: 0.25
Epoch 7: Loss: 0.25
Epoch 8: Loss: 0.25
Epoch 9: Loss: 0.25
Epoch 10: Loss: 0.25
Epoch 11: Loss: 0.25
Epoch 12: Loss: 0.0
Epoch 13: Loss: 0.0
Epoch 14: Loss: 0.0
Epoch 15: Loss: 0.0
Predicted: [0.0, 0.0, 0.0, 1.0]
Actual: [0.0, 0.0, 0.0, 1.0]
Weights: [0.25835938734421926, 0.12114874981029855]
Bias: -0.2999999999999999
OR Neuron:
Epoch 1: Loss: 0.25
Epoch 2: Loss: 0.0
Epoch 3: Loss: 0.0
Epoch 4: Loss: 0.0
Epoch 5: Loss: 0.0
Epoch 6: Loss: 0.0
Epoch 7: Loss: 0.0
Epoch 8: Loss: 0.0
Epoch 9: Loss: 0.0
Epoch 10: Loss: 0.0
Epoch 11: Loss: 0.0
Epoch 12: Loss: 0.0
Epoch 13: Loss: 0.0
Epoch 14: Loss: 0.0
Epoch 15: Loss: 0.0
Predicted: [0.0, 1.0, 1.0, 1.0]
Actual: [0.0, 1.0, 1.0, 1.0]
Weights: [0.45555497477677076, 0.1718274823843812]
Bias: -0.09999999999999987

NOR Neuron:
Epoch 1: Loss: 0.0
Epoch 2: Loss: 0.0
Epoch 3: Loss: 0.0
Epoch 4: Loss: 0.0
Epoch 5: Loss: 0.0
Epoch 6: Loss: 0.0
Epoch 7: Loss: 0.0
Epoch 8: Loss: 0.0
Epoch 9: Loss: 0.0
Epoch 10: Loss: 0.0
Epoch 11: Loss: 0.0
Epoch 12: Loss: 0.0
Epoch 13: Loss: 0.0
Epoch 14: Loss: 0.0
Epoch 15: Loss: 0.0
Predicted: [1.0, 1.0, 1.0, 0.0]
Actual: [1.0, 1.0, 1.0, 0.0]
Weights: [-0.2444237202858258, -0.18447476124531512]
Bias: 0.40000000000000013

NOT Neuron:
Epoch 1: Loss: 0.5
Epoch 2: Loss: 0.5
Epoch 3: Loss: 0.0
Epoch 4: Loss: 0.0
Epoch 5: Loss: 0.0
Epoch 6: Loss: 0.0
Epoch 7: Loss: 0.0
Epoch 8: Loss: 0.0
Epoch 9: Loss: 0.0
Epoch 10: Loss: 0.0
Epoch 11: Loss: 0.0
Epoch 12: Loss: 0.0
Epoch 13: Loss: 0.0
Epoch 14: Loss: 0.0
Epoch 15: Loss: 0.0
Predicted: [1.0, 0.0]
Actual: [1.0, 0.0]
Weights: [-0.36853364307624925]
Bias: 0.20000000000000015

NAND Neuron:
Epoch 1: Loss: 0.25
Epoch 2: Loss: 0.0
Epoch 3: Loss: 0.0
Epoch 4: Loss: 0.0
Epoch 5: Loss: 0.0
Epoch 6: Loss: 0.0
Epoch 7: Loss: 0.0
Epoch 8: Loss: 0.0
Epoch 9: Loss: 0.0
Epoch 10: Loss: 0.0
Epoch 11: Loss: 0.0
Epoch 12: Loss: 0.0
Epoch 13: Loss: 0.0
Epoch 14: Loss: 0.0
Epoch 15: Loss: 0.0
Predicted: [1.0, 0.0, 0.0, 0.0]
Actual: [1.0, 0.0, 0.0, 0.0]
Weights: [-0.08833327370478594, -0.025105061418474878]
Bias: 1.3877787807814457E-16
 */