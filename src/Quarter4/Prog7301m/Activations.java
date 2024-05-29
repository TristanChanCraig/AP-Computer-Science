package Quarter4.Prog7301m;

public class Activations {
    interface Activation {
        public double activate(double value);
        public double activateDeriv(double value);
    }

    public static class Sigmoid implements Activation {
        public double activate(double value)      { return 1/(1+Math.pow(Math.E, -value)); }
        public double activateDeriv(double value) { return value-Math.pow(value, 2); }
    }

    public static class Tanh implements Activation {
        public double activate(double value)      { return Math.tanh(value); }
        public double activateDeriv(double value) { return 1-Math.pow(value, 2); }
    }

    public static class ReLU implements Activation {
        public double activate(double value)      { return Math.max(0, value); }
        public double activateDeriv(double value) { return value >= 0 ? 1 : 0; }
    }
}