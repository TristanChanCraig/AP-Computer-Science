package Quarter4.Prog7301m;

import java.awt.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.util.List;

public class Prog7301m {
    public static int argmax(double[] a) {
        int max = 0;
        for (int i = 1; i < a.length; i++) if (a[i] > a[max]) max = i;
        return max;
    }

    public static void readAndEncodeCSV(String file, int numClasses, List<Double[]> X, List<Double[]> y) {
        try {
            Scanner input = new Scanner(new File(file));
            input.nextLine(); // Skip CSV header line
            while (input.hasNextLine()) {
                String[] line = input.nextLine().split(",");
                Double[] row = new Double[line.length-1];
                Double[] label_onehot = new Double[numClasses];
                int label = Integer.parseInt(line[0]);
                Arrays.fill(label_onehot, 0.0);
                label_onehot[label] = 1.0;
                for (int i = 1; i < line.length; i++) row[i-1] = Double.parseDouble(line[i]);
                X.add(row);
                y.add(label_onehot);
            }
        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }

    public static double[][] toArray(List<Double[]> list) {
        double[][] array = new double[list.size()][list.get(0).length];
        for (int r = 0; r < list.size(); r++) {
            for (int c = 0; c < list.get(0).length; c++) {
                array[r][c] = list.get(r)[c];
            }
        }
        return array;
    }

    public static void normalize(double[][] data, double max) {
        for (int r = 0; r < data.length; r++)
            for (int c = 0; c < data[0].length; c++)
                data[r][c] /= max;
    }

    public static void main(String[] args) {
        final int N_CLASSES = 10;

        // Training data (20x20 images, 784 pixels, 10 possible digits [0-9])
        var Xtr = new ArrayList<Double[]>();
        var ytr = new ArrayList<Double[]>();
        readAndEncodeCSV("Langdat/prog7301m_train.csv", N_CLASSES, Xtr, ytr);

        // Test data
        var Xte = new ArrayList<Double[]>();
        var yte = new ArrayList<Double[]>();
        readAndEncodeCSV("Langdat/prog7301m_test.csv", N_CLASSES, Xte, yte);

        double[][] X_train = toArray(Xtr);
        double[][] y_train = toArray(ytr);
        double[][] X_test = toArray(Xte);
        double[][] y_test = toArray(yte);

        final int N_INPUTS = X_train[0].length;
        final double MAX_VAL = 255.0;
        normalize(X_train, MAX_VAL);
        normalize(X_test, MAX_VAL);

        // Create model
        var model = new MultiLayerPerceptron(new int[]{N_INPUTS, 100, N_CLASSES}, 0.1, new Activations.Sigmoid());
        model.train(X_train, y_train, 10);
        System.out.println("Final Accuracy: " + model.accuracy(X_test, y_test));
        model.saveModel("Langdat/prog7301m_model.ser");

        // Pick a random image from the test set (validation)
        int index = (int)(Math.random() * X_test.length);
        double[] X_val = X_test[index];
        double[] y_val = y_test[index];

        // Predict the label
        double[] y_pred = model.predict(X_val);
        int pred = argmax(y_pred);
        int actual = argmax(y_val);
        System.out.println("Predicted: " + pred + "\tActual: " + actual);

        // Display the image
        var img = new BufferedImage(28, 28, BufferedImage.TYPE_INT_RGB);
        for (int r = 0; r < 28; r++) for (int c = 0; c < 28; c++) img.setRGB(c, r, (int)(X_val[r * 28 + c] * MAX_VAL));

        var frame = new JFrame("Image");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new JLabel(new ImageIcon(img)));
        frame.pack();
        frame.setVisible(true);
    }
}