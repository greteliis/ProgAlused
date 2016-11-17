package Chapter05;

import java.util.Scanner;

/**
 * Created by greteliis on 21.10.2016.
 */
public class Examples {
    public static void main(String[] args) {
        String fruit1 = "Apple";
        String fruit2 = "Orange";
        System.out.println(fruit1.equals(fruit2));

        int x = 17;
        int n = 18;

        if (x > 0) {
            System.out.println("x is positive");
        }

        if (x % 2 == 0) {
            System.out.println("x is even");
        } else {
            System.out.println("x is odd");
        }

        if (x > 0) {
            System.out.println("x is positive");
        } else if (x < 0) {
            System.out.println("x is negative");
        } else {
            System.out.println("x is zero");
        }

        if (x == 0) {
            System.out.println("x is zero");
        } else {
            if (x > 0) {
                System.out.println("x is positive");
            } else {
                System.out.println("x is negative");
            }
        }

        boolean evenFlag = (n % 2 == 0);    // true kui n on paariarv
        boolean positiveFlag = (x > 0);     // true kui x on positiivne

        if (evenFlag) {
            System.out.println("n was even when I checked it");
        }

        if (!evenFlag) {
            System.out.println("n was odd when I checked it");
        }
    }

}
