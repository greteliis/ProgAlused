package Chapter08;

import java.util.Scanner;

/**
 * Created by greteliis on 11.01.2017.
 */
public class Sieve {

    public static void main(String[] args) {

        System.out.println("Type a number: ");

        int limit = new Scanner(System.in).nextInt();

        System.out.println("You typed: " + limit + " Prime numbers are:  ");

        for (int n = 2; n < limit; n++) {
            if (sieve(n)) {

                System.out.println(n);
            }
        }
    }

    public static boolean sieve(int n) {

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }
}

