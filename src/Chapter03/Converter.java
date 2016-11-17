package Chapter03;

import java.util.Scanner;

/**
 * Created by greteliis on 8.11.2016.
 */
public class Converter {

    public static void main(String[] args) {
        double cm;
        int feet, inches, remainder;
        final double CM_PER_INCH = 2.54;
        final int IN_PER_FOOT = 12;
        Scanner in = new Scanner(System.in);


        System.out.print("Exactly how many cm? ");
        cm = in.nextDouble();


        inches = (int) (cm / CM_PER_INCH);
        feet = inches / IN_PER_FOOT;
        remainder = inches % IN_PER_FOOT;
        System.out.printf("%.2f cm = %d ft, %d in\n",
                cm, feet, remainder);
    }

}
