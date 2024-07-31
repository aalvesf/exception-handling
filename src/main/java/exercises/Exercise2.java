package exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise2 {

    public static int[] getUserInput() {
        Scanner scanner = new Scanner(System.in);
        int[] inputs = new int[2];

// Receive input from the user each time
        // throw an InputMismatchException
        boolean areInputsValid = false;
        while (!areInputsValid) {
            areInputsValid = true;
            try {
                System.out.println("Enter divisor: ");
                int divisor = scanner.nextInt();

                System.out.println("Enter dividend: ");
                int dividend = scanner.nextInt();
                inputs[0] = divisor;
                inputs[1] = dividend;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please try again.");
           areInputsValid = false;
            }
        }
        return inputs;
    }
}