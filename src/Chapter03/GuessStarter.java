package Chapter03;

/**
 * Created by greteliis on 9.11.2016.
 */

import java.util.Random;
import java.util.Scanner;

public class GuessStarter {

    public static void main(String[] args) {

        // valib suvalise numbri 1st 100ni
        Random random = new Random();
        int number = random.nextInt(100) + 1;


        Scanner in = new Scanner(System.in);
        System.out.println("I'm thinking of a number between 1 and 100\n" +
                "(including both). Can you guess what it is?");
        int number1 = in.nextInt();
        System.out.println("Your guess is: " + number1);
        System.out.println("The number I was thinking of is: " + number);

        int offNumber = number1 - number;
        // Math.abs() kasutasin selleks, et oleks positiivne arv.
        System.out.println("You were off by: " + Math.abs(offNumber));

    }
}