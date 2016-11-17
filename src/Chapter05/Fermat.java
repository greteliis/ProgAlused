package Chapter05;

/**
 * Created by greteliis on 10.11.2016.
 */
public class Fermat {

    public static void main(String[] args) {

        int n = 2;
        int a = 3;
        int b = 4;
        int c = 5;

        checkFermat(a, b, c, n);

    }

    public static void checkFermat(int a, int b, int c, int n) {

        if (n > 2 && ((Math.pow(a, n) + Math.pow(b, n) == Math.pow(c, n)))) {

            System.out.println("Holy smokes, Fermat was wrong!");

        } else {

            System.out.println("No, that doesn't work.");

        }

    }

}


