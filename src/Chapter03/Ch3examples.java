package Chapter03;

/**
 * Created by Lenovo on 19.10.2016.
 */

import java.util.Scanner;

public class Ch3examples {

    public static void main(String[] args) {

        String line;
        int inch;
        double cm;


        Scanner in = new Scanner(System.in);

        //System.out.print("Kirjuta midagi: ");
        //line = in.nextLine();
        //System.out.println("Sa kirjutasid: " + line);

        //System.out.print("Kirjuta midagi veel: ");
        //line = in.nextLine();
        //System.out.println("Sa kirjutasid: " + line);

        System.out.print("Kui palju inche? ");
        inch = in.nextInt();
        cm = inch * 2.54;
        System.out.print(inch + " in = ");
        System.out.println(cm + " cm");

//Parem formattimine: (Tavaline System/out.print(4.0/3.0) annab kuni 16 komakohta, see aga niipalju kui määrad (nt 3))
        System.out.printf("Neli kolmandikku = %.3f", 4.0 / 3.0);

        // int inch2 = 100;
        // double cm2 = inch * 2;

        // System.out.printf("%d in = %f cm/n", inch2, cm2);


        final double CM_PER_INCH = 2.54;
        int inch2 = 100;
        double cm2 = inch2 * CM_PER_INCH;
        System.out.printf("\t%d in = %f cm\n", inch2, cm2);
    }

}
