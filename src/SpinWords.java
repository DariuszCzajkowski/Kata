/*import java.util.stream.*;
import java.util.Arrays;

public class SpinWords {

    public static String spinWords(String sentence) {
        return Arrays.stream(sentence.split(" "))
                .map(i -> i.length() > 4 ? new StringBuilder(i).reverse().toString() : i)
                .collect(Collectors.joining(" "));
    }


    BEST PRACTICE!!
} */

public class SpinWords {

    public static String spinWords(String sentence) {

        String[] words = sentence.split(" ");

        char[] wordInCharArray;
        String spin = "";
        String spinOut = "";
        for (int i = 0; i < words.length; i++) {
            spin = "";
            if (words[i].length() > 4) {
                wordInCharArray = words[i].toCharArray();
                for (int j = wordInCharArray.length - 1; j >= 0; j--) {
                    spin += String.valueOf(wordInCharArray[j]);

                }
                words[i] = spin;

            }

            spinOut += words[i] + " ";
        }


        return spinOut.trim();
    }
}