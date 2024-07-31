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
            } catch (NegativeIntegerInputException niie) {
                System.out.println("This operation does not accept negative values. Please try again.");

                // -> `Exception in thread "main"` prefixed to our rest of the printStackTrace message
                // we throw this directly, and let JVM catches this Exception & logs same as in the above format:
                // Equivalent to: NOT SURROUNDING OUR CODE with try/catch
                // throw niie;

                // instead of:
                // niie.printStackTrace();
            }
        }

        return result;
    }
}
