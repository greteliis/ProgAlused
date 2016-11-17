package Chapter02;

/**
 * Created by greteliis on 8.11.2016.
 */
public class Chapter2 {

    public static void main(String[] args) {

        String message = "Heihei";
        int hour = 11;
        int min = 59;

        System.out.println(message);


        String firstLine = "Well, hello there!";
        System.out.println(firstLine);

        System.out.print("The value of firstLine is: ");
        System.out.println(firstLine);


        System.out.print("The current time is ");
        System.out.print(hour);
        System.out.print(":");
        System.out.print(min);
        System.out.println(".");

        System.out.print("Number of minutes since midnight: ");
        System.out.println(hour * 60 + min);

        System.out.print("Fraction of the hour that has passed: ");
        System.out.println(min / 60);

        System.out.print("Percent of the hour that has passed: ");
        System.out.println(min * 100 / 60);

        double minute = 59.0;
        System.out.print("Fraction of the hour that has passed: ");
        System.out.println(minute / 60.0);

        double y = 1/ 3; //nii tuleb vastuseks 0.0, int kasutades 1 ja 3 aga double peab olema 1.0 ja 3.0, siis tuleb õige vastus
        double y2 = 1.0 / 3.0;
        System.out.println(y);
        System.out.println(y2);

        System.out.println(0.1 * 10); //vastus on 1.0
        System.out.println(0.1 + 0.1 + 0.1 + 0.1 + 0.1
                + 0.1 + 0.1 + 0.1 + 0.1 + 0.1); //vastus peaks ka olema 1.0 aga on 0.99999....

        System.out.println(1 + 2 + "Heihei");

        System.out.println("heihei" + 1 + 2);

        int percentage;
        percentage = (min * 100) / 60;
        System.out.println(percentage);
    }
}
