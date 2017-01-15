package Chapter08;

/**
 * Created by greteliis on 10.01.2017.
 */
public class PowerArray {

    public static void main(String[] args) {


        double[] b = powArray();

        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

    }

    public static double[] powArray() {
        // System.out.println("Give power: ");




        double[] a = new double[] {1,2,4,6};

        for (int i = 0; i < a.length; i++) {
            a[i] = Math.pow(a[i], 2.0);

            System.out.println(a[i]);
        }
        return a;

    }

}
