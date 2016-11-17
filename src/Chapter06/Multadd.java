package Chapter06;

/**
 * Created by greteliis on 17.11.2016.
 */
public class Multadd {
    public static void main(String[] args) {
        double result = multadd(1.0, 2.0, 3.0);
        System.out.println("The result of a * b + c = " + result);

        double a1 = Math.cos(Math.PI/4.0);
        double b1 = 1.0/2.0;
        double c1 = Math.sin(Math.PI/4.0);
        System.out.println("sin(pi/4) + cos(pi/4)/2 = " + multadd(a1,b1,c1) );

        double a2 = 1.0;
        double b2 = Math.log(10);
        double c2 = Math.log(20);
        System.out.println("log(10) + log(20) = " + multadd(a2,b2,c2));

        System.out.println("xe^-x + sqrt(1-e^-x) =  " + expSum(2.0));

    }

    public static double multadd(double a, double b, double c) {

        double result = a * b + c;
        return result;
    }

    public static double expSum(double x) {
        double a = x;
        double b = Math.exp(-x);
        double c = Math.sqrt(1.0 - b);
        return multadd(a, b, c);

    }

}