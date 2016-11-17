package Chapter02;

/**
 * Created by greteliis on 8.11.2016.
 */
public class Time {

    public static void main(String[] args) {


        int hour = 20;
        int min = 30;
        int sec = 30;

        System.out.println("Current time is " + hour + ":" + min + ":" + sec);

        System.out.println("Number of seconds since midnight: " + (hour * 3600 + min * 60 + sec));

        System.out.println("Number of seconds remaining in the day: " + (24 * 3600 - (hour * 3600 + min * 60 + 30)));

        System.out.println("The percentage of the day that has passed: " + ((hour * 3600 + min * 60 + sec) * 100) / (24 * 3600));

        int hour2 = 20;
        int min2 = 45;
        int sec2 = 30;

        //Teisendan alguse ja lõpukella sekunditeks:
        int start_sec = (hour * 3600 + min * 60 + sec);
        int end_sec = (hour2 * 3600 + min2 * 60 + sec2);
        // mõlema sekundi vahe:
        int completion_sec = end_sec - start_sec;

        //teisendan, arvutan  vahe tundideks, minutiteks, sekunditeks

        int hour3 = completion_sec / 3600;
        int min3 = completion_sec / 60;
        int sec3 = (completion_sec - hour3 * 3600 - min3 * 60);


        System.out.println("This assignment took " + hour3 + " hours " + min3 + " minutes and " + sec3 + " seconds.");

    }

}
