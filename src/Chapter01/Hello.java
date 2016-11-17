package Chapter01;

/**
 * Created by greteliis on 25.10.2016.
 */
public class Hello {

    public static void main (String[] args) {

        System.out.println("Hello, World!");
        System.out.println("How are you?");

        //Kui kasutad erimärke, siis on võimalik ka viia asi uuele reale. See näide on sama, mis eelmine pikemalt kirjutatud:
        System.out.print("Hello!\nHow are you doing?\n");

        //Siin on kasutatud võimalust, et jutumärke panna ka jutumärkide sisse, sellisel juhul peab olema \ ees
        System.out.println("She said \"Hello!\" to me.");

        // Kui tahad kasutada backlashi (\) tuleb neid panna kaks tk, kui sul on vaja näidata 2tk, tuleb neid panna 4. jne.
        System.out.println("This is blackslash: \\");

        //selleks, et jätta pikem vahe (tab), saab kasutada \t vastavalt selle asja ette.
        System.out.println("One word, \tanother word");
    }
}



