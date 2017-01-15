package Chapter09;

/**
 * Created by greteliis on 11.01.2017.
 */
public class Ch09e03 {

    public static void main(String[] args){

        String s = "((3+7)*2)";
        int count = 0;

        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (c == '('){
                count--;
            }
        }
       System.out.println(count);

    }



}
