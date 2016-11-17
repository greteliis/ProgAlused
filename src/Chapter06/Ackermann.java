package Chapter06;

/**
 * Created by greteliis on 17.11.2016.
 */
public class Ackermann {
    public static void main(String[] args) {
        System.out.println(ack(-1, 2));

    }

    public static int ack(int m, int n) {
        if (m < 0 && n < 0) {
            throw new IllegalArgumentException("Numbrid peavad olema positiivsed!");
        } else if (m == 0) {
            return n + 1;
        } else if (m > 0 && n == 0) {
            return ack(m - 1, 1);
        }//alati kui (m > 0 ja n > 0) siis:
        return ack(m - 1, ack(m, n - 1));
    }
}
