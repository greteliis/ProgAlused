package Chapter05;

/**
 * Created by greteliis on 11.11.2016.
 */
public class Ex6 {

    public static void baffle(String blimp) {
        System.out.println(blimp);
        zippo("ping", -5);
    }
    public static void zippo(String quince, int flag) {
        if (flag < 0) {
            System.out.println(quince + " zoop");
        } else {
            System.out.println("ik");
            baffle(quince);
            System.out.println("boo-wa-ha-ha");
        }
    }
    public static void main(String[] args) {
        zippo("rattle", 13);
    }
}
