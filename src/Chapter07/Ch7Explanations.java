package Chapter07;

/**
 * Created by greteliis on 17.11.2016.
 */
public class Ch7Explanations {

    public static void main(String[] args) {

      // int count =countdown(5);
        int i = 1;
        while (i < 10) {
            double x = (double) i;
            System.out.println(x + "     " + Math.log(x) / Math.log(2));
            i = i + 1;
        }
        System.out.println();
        
        final double LOG2 = Math.log(2);
        int j = 1;
        while (j < 100) {
            double x = (double) j;
            System.out.println(x + "     " + Math.log(x) / LOG2);
            j = j * 2;
        }



    }

    public static void countdown(int n) {
        while (n > 0) {
            System.out.println(n);
            n = n - 1;
        }
        System.out.println("Blastoff!");
    }
    public static void sequence(int n) {
        while (n != 1) {
            System.out.println(n);
            if (n % 2 == 0) { // n is even
                n = n / 2;
            } else { // n is odd
                n = n * 3 + 1;
            }
        }
    }
}
