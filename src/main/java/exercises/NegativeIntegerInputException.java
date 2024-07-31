package exercises;

public class NegativeIntegerInputException extends RuntimeException {
    public NegativeIntegerInputException(String message) {
        // We directly pass this to the RuntimeException class to let it in the same format within the task
        super(message);
    }
}

// Enter divisor: 5
// Enter dividend: -5
// Exception in thread "main" exercises.NegativeIntegerInputException: The following negative integer(s) are
// not allowed in this operation: [-5]
//     at exercises.Exercise1.divide(Exercise1.java:9)
//     at exercises.Exercise3.divide(Exercise3.java:12)
//     at Main.main(Main.java:6)
