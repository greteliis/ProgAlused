package Chapter08;

/**
 * Created by greteliis on 11.01.2017.
 */
public class Ch08e08 {


    public static void main(String[] args) {

        int[] a = {2, 5, 6, 10, 9, 8, 1};


        System.out.println(max(a));


    }

    public static int maxInRange(int[] a, int lowIndex, int highIndex) {

        int count = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] >= lowIndex && a[i] <= highIndex) {
                count++;
            }
        }
        return count;
    }

    public static double max(int[] a) {

        double max = maxInRange(a, 0, a.length - 1);

        return max;
    }
}


