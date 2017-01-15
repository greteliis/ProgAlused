package Chapter09;

import java.util.Arrays;

/**
 * Created by greteliis on 11.01.2017.
 */
public class LetterHistogram {

    public static void main(String[] args) {

        System.out.println("The histogram: ");

        System.out.println(" A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z ");

        System.out.println(Arrays.toString(letterHist("pneumonoultramicroscopicsilicovolcanoconiosis")));

    }


    public static int[] letterHist(String s) {


        int[] hist = new int[26];
        for (char letter : s.toCharArray()) {
            if (letter >= 'a' && letter <= 'z') {
                hist[letter - 'a']++;
            } else if (letter >= 'A' && letter <= 'Z') {
                hist[letter - 'A']++;
            }

        }
        return hist;
    }


}



