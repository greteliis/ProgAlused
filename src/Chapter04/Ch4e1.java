package Chapter04;

/**
 * Created by greteliis on 21.10.2016.
 */
public class Ch4e1 {

    public static void zoop() {
        baffle();
        System.out.print("You wugga ");
        baffle();
    }

    public static void main(String[] args) {
        System.out.print("No, I ");
        zoop();
        System.out.print("I ");
        baffle();
    }

    public static void baffle() {
        System.out.print("wug");
        ping();
    }

    public static void ping() {
        System.out.println(".");

    }
    /**
     * 1. What is the output of the following program? Be precise about where
     there are spaces and where there are newlines.
     Hint: Start by describing in words what ping and baffle do when they
     are invoked.
     2. Draw a stack diagram that shows the state of the program the rst time
     ping is invoked.
     3. What happens if you invoke baffle(); at the end of the ping method?

     Output:
     No, I wug.
     You wugga wug.
     I wug.

     Alustab mainiga "No, I", kutsub välja zoopi, mis enne ütlemist kutsub välja baffle "wug", mis kutsub välja pingi "."
     Siis läheb tagasi zoopi juurde (sest baffle --> ping lõpetatud), ütleb "You wugga", ja kutsub uuesti baffle --> ping.
     See kõik läheb tagasi maini juurde, mis seekord ütleb "I", main kutsub välja baffle ja see kohe jälle ping.
     Kolmanda küsimuse vastus:
     Kui lisada baffle() pingi lõppu, siis tekib endless loop, kus ta kutsub baffle --> ping --> baffle --> ping jne :)
     */
}
