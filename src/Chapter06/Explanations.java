package Chapter06;

/**
 * Created by greteliis on 17.11.2016.
 */
public class Explanations {
    public static void main(String[] args) {
        double dist = distance(1.0, 2.0, 4.0, 6.0);
        System.out.println("The distance is: " + dist);

        double area = circleArea(4.0, 6.0, 6.0, 9.0);
        System.out.println("The area is: " + area);

        double x = calculateArea(3.0);
        System.out.println("The radius(?) is: " + x);

        double y = calculateArea(1.0, 2.0, 4.0, 6.0);
        System.out.println(y);

        System.out.println(isSingleDigit(11));
        boolean bigFlag = !isSingleDigit(17);
        System.out.println(bigFlag);

        System.out.println(factorial(3));

        System.out.println(fibonacci(2));
    }

    public static double distance(double x1, double y1, double x2, double y2) {
        double dx = x2 - x1;
        double dy = y2 - y1;
        // System.out.println("dx is " + dx);
        //System.out.println("dy is " + dy);
        double dsquared = dx * dx + dy * dy;
        //System.out.println("dsquared is " + dsquared);
        double result = Math.sqrt(dsquared);
        return result;
    }

    public static double calculateArea(double radius) {
        double result = Math.PI * radius * radius;
        return result;
    }

    public static double circleArea
            (double xc, double yc, double xp, double yp) {
        double radius = distance(xc, yc, xp, yp);
        double area = calculateArea(radius);
        return area;
    }

    //calculateArea overloading!!
    public static double calculateArea
    (double xc, double yc, double xp, double yp) {
        return calculateArea(distance(xc, yc, xp, yp));
    }


    /**
     * Tests whether x is a single digit integer.
     *
     * @param x the integer to test
     * @return true if x has one digit, false otherwise
     */

    public static boolean isSingleDigit(int x) {
        if (x > -10 && x < 10) {
            return true;
        } else {
            return false;
        }
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        int recurse = factorial(n - 1);
        int result = n * recurse;
        return result;
    }
    public static int fibonacci(int n){
        if (n==1 || n==2){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

}
