package Chapter07;

/**
 * Created by greteliis on 27.12.2016.
 */
public class IterativePower {

    public static void main(String[] args) {
        power(2, 5);
    }

    public static void power(double x, int n) {
        double answer = 1;
        int i = 1;
        while (i <= n) {
            answer = answer * x;
            i = i + 1;
        }
        System.out.println(answer);
    }
}
