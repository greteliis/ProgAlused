package Chapter03;

/**
 * Created by greteliis on 9.11.2016.
 */

import java.util.Scanner;

public class SecondsConverter {


    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        System.out.println("How many seconds? ");
        int seconds = in.nextInt();

        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int seconds2 = seconds % 60;



        System.out.printf("%d seconds = %d hours, %d minutes, %d seconds", seconds, hours, minutes, seconds2);


    }

}


