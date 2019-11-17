import java.util.Arrays;

public class PangramChecker {
    public static boolean check(String sentence) {


        sentence = sentence.toLowerCase();

        char[] in = sentence.trim().toCharArray();
        Arrays.sort(in);
        char s = in[0];
        String z = String.valueOf(s);

        for (char c : in) {

            if (s != c) {
                z += c;
            }
            s = c;
        }
        if(sentence.length() < 25 ||  !z.contains("a")){
            return false;
        }
        String[] outputArr = z.split("a");

        String output = outputArr[1];
        if (output.length() == 25) {
            return true;
        }

return false;
    }}
