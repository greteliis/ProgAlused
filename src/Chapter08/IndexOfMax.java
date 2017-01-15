package Chapter08;

/**
 * Created by greteliis on 11.01.2017.
 */
public class IndexOfMax {


    public static void main(String[] args) {
        int[] numbers = {0, 1, 2, 3, 4, 4, 6, 7, 8, 9};
        indexOfMax(numbers);
    }


    public static void indexOfMax(int[] array) {

        int modetracker[] = new int[10];
        int max = 0;
        int number = 0;
        for (int i = 0; i < array.length; i++) {
            modetracker[array[i]] += 1;
        }
        int maxIndex = 0;
        for (int i = 1; i < modetracker.length; i++){
            int newnumber = modetracker[i];
            if ((newnumber > modetracker[maxIndex])){
                maxIndex = i;
            }
        } System.out.println(maxIndex);

    }
}