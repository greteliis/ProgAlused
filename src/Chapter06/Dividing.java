package Chapter06;

/**
 * Created by greteliis on 17.11.2016.
 */
public class Dividing {

    public static void main(String[] args){

        System.out.println(isDivisible(5,8));

    }

    public static boolean isDivisible(int n, int m){
        if (n % m == 0){
            return true;
        } else {
            return false;
        }
    }
}

