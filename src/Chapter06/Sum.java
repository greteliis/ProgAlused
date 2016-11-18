package Chapter06;

/**
 * Created by greteliis on 17.11.2016.
 */
public class Sum {
    public static void main(String[] args) {

        System.out.println(oddSum(6));

    }

    public static int oddSum(int n) {

        if (n <= 0) {
            return 0;
        }
        if (n % 2 == 0) {
            return ((n - 1) + oddSum(n - 2));

        } else {
            return (n + oddSum(n - 2));
        }
    }
}