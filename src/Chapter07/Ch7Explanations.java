package Chapter07;

/**
 * Created by greteliis on 17.11.2016.
 */
public class Ch7Explanations {

    public static void main(String[] args) {

      // int count =countdown(5);

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
