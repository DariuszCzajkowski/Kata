
import java.util.*;

public class TwoToOne {

    public static String longest (String s1, String s2) {


        String temp = s1 + s2;
        char[] tempInput = temp.toCharArray();
        Arrays.sort(tempInput);
        char s = tempInput[0];
        String z = String.valueOf(s);

        for (int i = 0; i < tempInput.length; i++) {

            if (s != tempInput[i]) {
                z += tempInput[i];
            }
            s = tempInput[i];
           }
       return z;
    }
}
