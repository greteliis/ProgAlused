package Chapter05;

/**
 * Created by greteliis on 11.11.2016.
 */

import java.util.Random;
import java.util.Scanner;


public class GuessingGame {

    public static void main(String[] args) {

        System.out.println("I'm thinking of a number between 1 and 100\n" +
                "(including both). Can you guess what it is?");

        Random random = new Random();
        int number = random.nextInt(100) + 1;
        Guess(number);
    }

    public static void Guess(int randomNumber) {
        Scanner in = new Scanner(System.in);
        int number1 = in.nextInt();

        if (number1 > randomNumber) {
            System.out.println("Your guess is too high!");
            Guess(randomNumber);

        } else if (number1 < randomNumber) {
            System.out.println("Your guess is too low!");
            Guess(randomNumber);

        } else {
            System.out.println("You guessed right!");
        }
    }

}



