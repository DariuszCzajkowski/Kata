
import java.util.*;

public class TwoToOne {

    public static String longest (String s1, String s2) {


        String temp = s1 + s2;
        char[] tempInput = temp.toCharArray();
        Arrays.sort(tempInput);
        char s = tempInput[0];
        StringBuilder z = new StringBuilder(String.valueOf(s));

        for (char c : tempInput) {

            if (s != c) {
                z.append(c);
            }
            s = c;
        }

       return z.toString();
    }
}
