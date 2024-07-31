package exercises;

public class Exercise3 {
    public static double divide() {

        double result = 0.00;

        while (result == 0.00) {
            try {
                int[] inputs = Exercise2.getUserInput();

                result = Exercise1.divide(inputs[0], inputs[1]);

            } catch (ArithmeticException ae) {
                System.out.println("Cannot divide by zero. Please try again.");
            }
        }

        return result;
    }
}
