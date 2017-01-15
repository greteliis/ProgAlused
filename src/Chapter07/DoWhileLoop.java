package Chapter07;

import java.util.Scanner;

/**
 * Created by greteliis on 18.11.2016.
 */
public class DoWhileLoop {
    /**
     * Although this code looks complicated, it is essentially only three steps:
     * 1. Display a prompt.
     * 2. Check the input; if invalid, display an error and start over.
     * 3. Read the input.
     * The code uses a flag variable, okay, to indicate whether we need to repeat the
     * loop body. If hasNextDouble() returns false, we consume the invalid input
     * by calling next(). We then display an error message via System.err. The
     * loop terminates when hasNextDouble() return true.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean okay;
        do {
            System.out.print("Enter a number: ");
            if (in.hasNextDouble()) {
                okay = true;
            } else {
                okay = false;
                String word = in.next();
                System.err.println(word + " is not a number");
            }
        } while (!okay);
        double x = in.nextDouble();
    }
}
