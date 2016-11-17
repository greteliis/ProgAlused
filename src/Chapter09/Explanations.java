package Chapter09;

/**
 * Created by greteliis on 16.11.2016.
 */

/**
 * Tähtsad meetodid, String = Sõna
 * Sõna.charAt(i);
 * Sõna.replace("a", "z");
 * Sõna.toCharArray();
 * Sõna.substring(ij); - algusindeks i, lõpuindeks+1 j
 * Sõna.length();
 * Sõna.indexOf(c);
 * Sõna.equals(z);
 * String.format();
 * * KUNA STRINGID ON OBJEKTID, SIIS NENDE PUHUL EI SAA KASUTADA ==
 */
public class Explanations {

    public static void main(String[] args) {

        String fruit = "banaan";
        char letter = fruit.charAt(0);
        //otsis välja esimese tähe ja siis kuvas seda:
        System.out.println("Banaani esimene täht on: " + letter);

        System.out.print("Rooma tähestik:");
        //siin on nüüd tähtis, et A ja Z oleks ' jutumärkidega, mitte ". Char nõuab ühekordset.
        for (char a = 'A'; a <= 'Z'; a++) {
            System.out.print(a);
        }
        System.out.println();

        System.out.print("Kreeka tähestikt: ");
        for (int i = 913; i <= 937; i++) {
            System.out.print((char) i);
        }
        System.out.println();

        //See siin nüüd vahetab siis fruiti (banaan) a tähe "z" tähe vastu! ehk banaan --> bznzzn.
        //SEDA KASUTATAKSE LÜHENDITE PUHUL!
        String jura = fruit.replace("a", "z");
        System.out.println(jura);

        //output on fruiti (banaani) tähed üksteise all
        for (char c : fruit.toCharArray()) {
            System.out.println(c);
        }
        System.out.println();

        //TÄPSELT SAMA ASI, MIS EELMINE:
        for (int i = 0; i < fruit.length(); i++) {
            char letter1 = fruit.charAt(i);
            System.out.println(letter1);
        }

        String name = "Alan Turing";
        //toUpperCase tõstab selle Stringi (nime) üleni suurte tähtedega
        String upperName = name.toUpperCase();
        System.out.println(upperName);

        //võrab viimase tähe fruitist (banaan):
        int length = fruit.length();
        char last = fruit.charAt(length - 1);
        System.out.println(last);

        //See nüüd kuvab selle, et sõna BANAAN oleks kirjutatud tagurpidi ehk NAANAB.
        //Selleks tegin uue meetodi reverse!
        System.out.println(reverse("BANAAN"));


    }

    public static String reverse(String s) {
        String r = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            r = r + s.charAt(i);
        }
        return r;
    }


}
