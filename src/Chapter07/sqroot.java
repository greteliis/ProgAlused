package Chapter07;

/**
 * Created by greteliis on 27.12.2016.
 */
public class sqroot {
    public static void main(String[] args) {

        squareRoot(9);
    }

    public static void squareRoot(double n) {

        double a = n / 2;
        double x1 = (a + n / a) / 2;
        double x2 = (x1 + n / x1) / 2;
        while (Math.abs(x1 - x2) >= 0.0001) {
            x1 = (x2 + n / x2) / 2;
            x2 = (x1 + n / x1) / 2;
        }
        System.out.println(x2);
    }

}


