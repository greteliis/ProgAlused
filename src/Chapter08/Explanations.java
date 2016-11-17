package Chapter08;

/**
 * Created by greteliis on 17.11.2016.
 */
/**
 * Created by greteliis on 16.11.2016.
 */
public class Explanations {

    public static void main(String[] args) {


        // int pi = Math.pi;
        int[] massiiv1 = new int[6];
        int[] massiiv2 = {10, 100, 1000, 10000, 100000, 1000000};

        /**
         * int[] massiiv1 = {10, 100, 1000, 10000, 100000, 1000000} on sama mis:
         * massiiv1[0]=10;
         * massiiv1[1]=100;
         * massiiv1[2]=1000;
         * massiiv1[3]=10000;
         * massiiv1[4]=100000;
         * massiiv1[5]=1000000;
         * <p>
         * int massiiv[3]*5;
         * peaks siis olema 50000 :)
         * <p>
         * Massiiv 6 on siis 0..5, ehk nullis (ingk. k "zeroth"), esimene, teine, ... viies.
         * <p>
         * ____________________________
         */


        int size = 6;
        int[] massiiv3 = new int[size];

        for (int i = 0; i < massiiv2.length; i++) {
            System.out.println(massiiv2[i]);
            massiiv1[i] = massiiv2[i];
        }
        // kuvab välja sama asja, aga jagatud kümnega :)
        //defineeri asju väljaspool tsüklid (seetõttu ka int m = 0 siin ees), et siis ei pea tsükli sees koguaeg mälu kasutama

        int m = 0;
        for (int n : massiiv1) {
            m = n / 10;
            System.out.println(m);
        }

    }
}
