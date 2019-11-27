import java.util.Arrays;
import java.util.stream.Collectors;

public class PigIt {
    public static String pigIt(String sentence) {

        return Arrays.stream(sentence.split(" "))
                .map(i -> i.substring(1) + i.substring(0, 1) +  "ay" )
                .collect(Collectors.joining(" "));

    }
}
// not finished