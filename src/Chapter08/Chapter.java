package Chapter08;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by greteliis on 16.11.2016.
 */
public class Chapter {

    public static void main(String[] args) {

        int[] counts;
        double[] values;
        counts = new int[4];
        //values = new double[size];
/**
 * saab ka nii:
 int[] counts = new int[4];
 double[] values = new double[size];
 */

        counts[0] = 7;
        counts[1] = counts[0] * 2;
        counts[2]++;
        counts[3] -= 60;

        int i = 0;

        //whilega:
        while (i < 4) {
            System.out.println(counts[i]);
            i++;
        }
        //sama asi for-iga:
        for (i = 0; i < 4; i++) {
            System.out.println(counts[i]);
        }

        int[] a = {1, 2, 3, 4};
        System.out.println(a);
        // selle output on: [I@1b6d3586

        System.out.println(Arrays.toString(a));
        //selle output on: [1,2,3,4] ehk näitab massiivi, allpool kommentaaris on ka meetodiga printArray sama asja, siis on output sama aga loogeliste sulgudega

//randomArray(size);
    }

    public static int[] randomArray(int size) {

        Random random = new Random();
        int[] a = new int[size];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(100);
        }
        return a;

        // int numValues = 8;

        // int[] array = randomArray(numValues);
        //printArray(array);

    }
    public static void printArray(int[] b) {
        System.out.print("{" + b[0]);
        for (int i = 1; i < b.length; i++) {
            System.out.print(", " + b[i]);
        }
        System.out.println("}");
    }

}

