package Chapter07;

/**
 * Created by greteliis on 28.12.2016.

public class Gauss {

    public static void main ( String[]args){

        System.out.println(gauss(-2.0, 2));
    }
    public static double gauss ( double x, int n) {

        double sum = 1.0;
        double numerator = 1;
        double denominator = 1;

        int i = 1;
        for (int i = 1; i < n; i++ {

            numerator = ((-1)^i)*(x^(2*i));
           // term = -1*term*x*x/i;
            denominator=denominator*i;
            sum += numerator/denominator;
            i = i + 1;
        }
        return sum;
    }


}
 */