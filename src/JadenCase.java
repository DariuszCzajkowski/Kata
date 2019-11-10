public class JadenCase {


    public static String toJadenCase(String phrase) {


        if (phrase != null && phrase != "") {
            String[] split = phrase.split(" ");
            String s = split[0];
            String z = "";


            for (int i = 0; i < split.length; i++) {
                s = split[i] + " ";
                z += s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();


            }


            return z.trim();
        }


        return null;
    }
}