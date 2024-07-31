import exercises.Exercise1;
import exercises.Exercise2;
import exercises.Exercise3;
import exercises.NegativeIntegerInputException;

public class Main {

    public static void main(String[] args) {

        try {
            Exercise3.divide();
        } catch (NegativeIntegerInputException niie) {
            // -> `Exception in thread "main"` prefixed to our rest of the printStackTrace message
            // we do this, and let JVM catches the Exception & logs same as in the above format:
            throw niie;

            // instead of:
            // niie.printStackTrace();
        }
    }
}
