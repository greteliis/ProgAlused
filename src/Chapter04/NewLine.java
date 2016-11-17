package Chapter04;

/**
 * Created by greteliis on 21.10.2016.
 */
public class NewLine {

    public static void newLine() {
        System.out.println();
    }

    public static void threeLine() {
        newLine();
        newLine();
        newLine();
    }
    public static void main(String[] args) {
        System.out.println("First line.");
        newLine();
        System.out.println("Second line.");
        threeLine();
        System.out.println("Third line, after 3 empty lines.");
        threeLine();
        newLine();
        System.out.print("Heihei");

    }

}
