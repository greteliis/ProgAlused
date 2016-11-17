package Chapter06;

/**
 * Created by greteliis on 17.11.2016.
 */
public class TriangleSticks {

    public static void main(String[] args) {

        System.out.println(isTriangle(6, 4, 1));
    }

    public static boolean isTriangle(int a, int b, int c) {

        if ((a + b) > c && (a + c) > b && (b + c) > a) {
            return true;
        } else {
            return false;

        }

    }

}
