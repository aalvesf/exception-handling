package exercises;

public class Exercise1 {
    public static double divide(int numerator, int denominator) {

        // WARNING: We shouldn't use exceptions for control flow!
        if (numerator < 0 || denominator < 0) {
            throw new NegativeIntegerInputException("The following negative integer(s) are not allowed in this operation ["
                    .concat(String.valueOf(numerator < 0 ? numerator : denominator))
                    .concat("]"));
        }

        return numerator / denominator;
    }
}
