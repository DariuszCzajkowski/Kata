public class Maskify {
    public static String maskify(String str) {

        if (4 >= str.length() || str.equals("")) {
            return str;
        }

        String temp = "";
        for (int i = 0; i < str.length() - 4; i++)
            if (i < str.length() - 5) {
                temp = temp + "#";
            } else {
                temp = temp + "#" + str.substring(str.length() - 4);
            }

        return temp;
    }


}
