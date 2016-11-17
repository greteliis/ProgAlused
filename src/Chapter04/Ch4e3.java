package Chapter04;

/**
 * Created by greteliis on 10.11.2016.
 */
public class Ch4e3 {

    public static void main(String[] args) {
        String day = "Monday";
        int date = 7;
        String month = "November";
        int year = 2016;

        printAmerican(day, month, date, year);
        printEuropean(day, date, month, year);

    }

    public static void printAmerican(String day, String month, int date, int year) {
        System.out.println(day + ", " + month + " " + date + ", " + year);
    }

    public static void printEuropean(String day, int date, String month, int year) {
        System.out.println(day + " " + date + " " + month + " " + year);

    }

}
