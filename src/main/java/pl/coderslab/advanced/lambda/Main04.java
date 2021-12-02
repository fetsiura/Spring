package pl.coderslab.advanced.lambda;

public class Main04 {

    public static void main(String[] args) {
        MathOperation<Double> pow = (Double value) -> {
            return value * value;
        };

        MathOperation<Double> sqrt = (Double value) -> {
            return Math.pow(value, 0.5);
        };

        MathOperation<Integer> power = (Integer value) -> {
            int result = 1;
            for (int i = 2; i <= value; i++) {
                result *= i;
            }
            return result;
        };

        System.out.println("Potęga z 5.5: " + pow.operate(5.5));
        System.out.println("Pierwiastek z 16.0: " + sqrt.operate(16.0));
        System.out.println("Silnia z 8: " + power.operate(8));
    }
}
