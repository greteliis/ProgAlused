package Chapter08;

/**
 * Created by greteliis on 11.01.2017.
 */
public class AreFactors {


    public static void main(String[] args) {

        int n = 6;
        int[] a = {6, 12, 24};

        System.out.println(areFactors(a, n));

    }


    public static boolean areFactors(int[] a, int n) {

        for (int i = 0; i < a.length; i++) {

            if (n % a[i] != 0) {

                return false;
            }
        }
        return true;
    }

}
