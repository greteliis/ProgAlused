package Chapter08;

/**
 * Created by greteliis on 16.11.2016.
 */
public class CopyingArrays {
    public static void  main(String[] args){

        double[] a = new double[3];
        //double[] b = a;

        double[] b = new double[3];
        for (int i = 0; i < 3; i++) {
            b[i] = a[i];
        }

    }

}
