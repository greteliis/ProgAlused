package Chapter04;

/**
 * Created by greteliis on 21.10.2016.
 */
public class PrintTwice {

    public static void printTwice(String s) {
        System.out.println(s);
        System.out.println(s);
    }

    public static void main(String[] args) {
        printTwice("Don't make me say this twice!");

        String argument = "Never say never.";
        printTwice(argument);

    }

}
