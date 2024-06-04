package Quarter4.Prog7301m;

import java.io.*;
import java.util.*;

public class Iris {
    public static void readCSV(String file, int labelIndex, List<Double[]> X, List<String> y) {
        try {
            Scanner input = new Scanner(new File(file));
            input.nextLine();
            while (input.hasNextLine()) {
                String[] line = input.nextLine().split(",");
                Double[] row = new Double[line.length-1];
                for (int i = 0; i < line.length; i++) {
                    if (i == labelIndex) y.add(line[i]);
                    else row[i] = Double.parseDouble(line[i]);
                }
                X.add(row);
            }
        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }

    public static List<Double[]> encodeLabels(List<String> y, List<String> classes) {
        for (String label : y)
            if (!classes.contains(label)) classes.add(label);
        var y_onehot = new ArrayList<Double[]>();
        for (String label : y) {
            Double[] label_onehot = new Double[classes.size()];
            Arrays.fill(label_onehot, 0.0);
            label_onehot[classes.indexOf(label)] = 1.0;
            y_onehot.add(label_onehot);
        }
        return y_onehot;
    }

    public static void main(String[] args) {
        var X = new ArrayList<Double[]>();
        var y_str = new ArrayList<String>();
        var classes = new ArrayList<String>();
        readCSV("Langdat/iris.csv", 4, X, y_str);
        var y = encodeLabels(y_str, classes);

        // Split the data into training,testing data
        int ntr = (int)(X.size() * 0.8);
        var Xtr = X.subList(0, ntr);
        var ytr = y.subList(0, ntr);
        var Xte = X.subList(ntr, X.size());
        var yte = y.subList(ntr, y.size());

        var X_train = Prog7301m.toArray(Xtr);
        var y_train = Prog7301m.toArray(ytr);
        var X_test = Prog7301m.toArray(Xte);
        var y_test = Prog7301m.toArray(yte);

        double max = 0.0;
        for (Double[] row : X)
            for (Double v : row) if (v > max) max = v;
        Prog7301m.normalize(X_train, max);
        Prog7301m.normalize(X_test, max);

        final int N_INPUTS = X.get(0).length;
        final int N_CLASSES = classes.size();
        var model = new MultiLayerPerceptron(new int[]{N_INPUTS, N_CLASSES}, 0.1, new Activations.Tanh());

        model.train(X_train, y_train, 1000);
        System.out.println("Final Accuracy: " + model.accuracy(X_test, y_test));

        model.saveModel("Langdat/iris_model.ser");

        int index = (int)(Math.random() * X_test.length);
        double[] X_val = X_test[index];
        double[] y_val = y_test[index];

        double[] y_pred = model.predict(X_val);
        int pred = Prog7301m.argmax(y_pred);
        int actual = Prog7301m.argmax(y_val);
        System.out.println("Predicted: " + classes.get(pred));
        System.out.println("Actual: " + classes.get(actual));
    }
}
