package pl.coderslab.advanced.lambda;

public class Main04 {

    public static void main(String[] args) {

        Handler<Double> handlerPow = s -> Math.pow(s,2);

        Handler<Double> handlerSrt = s -> Math.sqrt(s);

        Handler<Integer> power = (Integer value) -> {
            int result = 1;
            for (int i = 2; i <= value; i++) {
                result *= i;
            }
            return result;
        };


        System.out.println(handlerPow.handler(10.2));
        System.out.println(handlerSrt.handler(12.12));
        System.out.println(power.handler(4));
    }
}
