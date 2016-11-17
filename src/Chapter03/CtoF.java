package Chapter03;

/**
 * Created by greteliis on 8.11.2016.
 */


import java.util.Scanner;


public class CtoF {

    public static void  main (String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("How many degrees? ");
        double celsius = in.nextDouble();

        double fahrenheit = celsius * (9.0 / 5.0) + 32;

        System.out.printf("%.2f C = %.2f F", celsius, fahrenheit);

    }

}
