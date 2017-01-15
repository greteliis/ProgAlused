package Chapter07;

/**
 * Created by greteliis on 27.12.2016.
 */
public class IterativeFactorial {
    public static void main(String[] args) {
        factorial(4);
    }

    public static void factorial(int n) {
        double answer = n;
        int i = n - 1;
        while (i > 0) {
            answer = answer * i;
            i = i - 1;
        }
        System.out.println(answer);
    }
}
