package exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise2 {

    public static int[] getUserInput() {
        int[] inputs = new int[2];

        boolean areInputsValid = false;

        while (!areInputsValid) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter divisor: ");
                int divisor = scanner.nextInt();

                System.out.println("Enter dividend: ");
                int dividend = scanner.nextInt();

                inputs[0] = divisor;
                inputs[1] = dividend;

                areInputsValid = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please try again.");
                areInputsValid = false;

            }

        }
        return inputs;
    }
}