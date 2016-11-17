package Chapter05;

/**
 * Created by greteliis on 10.11.2016.
 */
public class Beers {

    public static void main(String[] args) {

        beers(99);
    }

    public static String bottleText(int bottles) {
        if(bottles == 1)
            return " bottle ";
        else
            return " bottles ";
    }

    public static void beers(int bottles) {
        if (bottles > 0) {

            System.out.println(bottles + bottleText(bottles) + "of beer on the wall, ");
            System.out.println(bottles + bottleText(bottles) + "of beer, ");
            System.out.println("ya' take one down, ya' pass it around,");
            System.out.println((bottles - 1) + bottleText(bottles - 1) +"of beer on the wall.");
            System.out.println();

            beers(bottles - 1);

        } else {
            System.out.println("No bottles of beer on the wall, ");
            System.out.println("no bottles of beer,");
            System.out.println("ya' can't take one down, ya' can't pass it around,");
            System.out.println("'cause there are no more bottles of beer on the wall!");


        }
    }
}