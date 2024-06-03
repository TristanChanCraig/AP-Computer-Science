package Quarter4.Prog7301m;

import java.util.ArrayList;

public class Test7301m {
    public static void main(String[] args) {
        var Xte = new ArrayList<Double[]>();
        var yte = new ArrayList<Double[]>();
        Prog7301m.readAndEncodeCSV("Langdat/prog7301m_test.csv", 10, Xte, yte);

        var model = MultiLayerPerceptron.loadModel("Langdat/prog7301m_model.ser");
        if (model == null) return;

        double[][] X_test = Prog7301m.toArray(Xte);
        double[][] y_test = Prog7301m.toArray(yte);
        double accuracy = model.accuracy(X_test, y_test);
        System.out.println("Final Accuracy: " + accuracy);
    }
}
