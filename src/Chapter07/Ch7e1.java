package Chapter07;

/**
 * Created by greteliis on 8.12.2016.
 */
public class Ch7e1 {

    public static void main(String[] args) {
        loop(10);
    }


    public static void loop(int n) {
        int i = n;
        while (i > 1) {
            System.out.println(i);
            if (i % 2 == 0) {
                i = i / 2;
            } else {
                i = i + 1;
            }
        }
    }
}
/** Võtab numbri (10), kontrollib kas on suurem 1 (on), siis prindib selle numbri, kui number on paarisarv (on), siis jagab
 selle 2ga (5), ja hakkab otsast peale, kontrollib, kas on suurem kui 1 (on), kas on paarisarv (ei ole), siis võtab selle paarisarvu ja
 liidab talle 1 (6) jne.
 Seega output on: 10, 5, 6, 3, 4, 2
 Peale 2 edasi ei lähe -  1 ei ole suurem kui 1, seega lõpetab ära ega ei prindi midaig välja enam.
*/