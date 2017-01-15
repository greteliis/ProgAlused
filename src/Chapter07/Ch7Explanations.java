package Chapter07;

/**
 * Created by greteliis on 17.11.2016.
 */
public class Ch7Explanations {

    public static void main(String[] args) {

        // int count =countdown(5);
        //Tabelina, x ja tema logaritm jagatud log2ga
        int i = 1;
        while (i < 10) {
            double x = (double) i;
            System.out.println(x + "     " + Math.log(x) / Math.log(2));
            i = i + 1;
        }
        System.out.println();

        //Tabelina, x ja tema logaritm jagatud final log2-ga (siis ei pea igakord uuesti log2 väärtust arvutama (vist))
        final double LOG2 = Math.log(2);
        int j = 1;
        while (j < 100) {
            double x = (double) j;
            System.out.println(x + "     " + Math.log(x) / LOG2);
            j = j * 2;
        }
        System.out.println();

        // Teeb rida, korrutab k kahega kuni see on võrdne/alla kuue.
        int k = 1;
        while (k <= 6) {
            System.out.printf("%4d", 2 * k);
            k = k + 1;
        }
        System.out.println();
        System.out.println();

        System.out.println("Siin on korrutustabel 1-6:");
        printTable(7);



    }

    public static void printRow(int n, int cols) {
        /**The format specifier %4d in printRow causes the output to align vertically,
         *regardless of whether the numbers are one or two digits.
         * Nii nagu printTabelisse sai lisada ridu, saab siia lisada kolonne. Selleks meetodisse juurde (int n, int cols)
         * ja alla, printTable-isse printRow(i) asemele siis printRow(i, rows), ehk annab sama palju kolonne ja ridu
         */

        int i = 1;
        while (i <= cols) {
            System.out.printf("%4d", n * i);
            i = i + 1;
        }
        System.out.println();
    }

    public static void printTable(int rows) {
        /**algul kasutasime nii, et kuni 6*6, siis oligi while ( i <= 6), aga saab ka lisada juurde, siis
         * meetordi prinTTable() sulgudesse lisad (int rows), ja paned while(i<=rows), seejuures mainis välja kutsudes
         * ei saa enam kirjutada lihtsalt printTable(); vaid paned sulgudesse arvu, mitu rida sa tahad, et sinu tabelis
         * oleks, näiteks 8. Siis on korrutustabel 8*6, mitte enam 6*6. Tabeli suurendamiseks vaata ka printRow komme.
         */
        int i = 1;
        while (i <= rows) {
            printRow(i, rows);
            //printRow(i, i); ---- annaks pooliku korrutustabeli.
            i = i + 1;
        }
    }

    public static void countdown(int n) {
        while (n > 0) {
            System.out.println(n);
            n = n - 1;
        }
        System.out.println("Blastoff!");
    }

    public static void sequence(int n) {
        while (n != 1) {
            System.out.println(n);
            if (n % 2 == 0) { // n is even
                n = n / 2;
            } else { // n is odd
                n = n * 3 + 1;
            }
        }
    }
}
