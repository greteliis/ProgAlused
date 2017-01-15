package Chapter06;

/**
 * Created by greteliis on 17.11.2016.
 */
public class Power {

    public static void main(String[] args) {


        System.out.println(power(2,5));
    }
    public static double power(double x, int n) {
        if(n == 0) {
            return 1;
        } else {
            return x * power(x,n-1);
        }
    }
}

