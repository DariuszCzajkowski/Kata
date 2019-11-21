class MiddleCharacter {


    public static String getMiddle(String word) {

        char[] letter = word.toCharArray();
        String result = "";
        if (word.length() % 2 > 0) {
            return result = letter[word.length() / 2] + "";        }
        return result = word.substring(word.length() / 2 - 1, word.length() / 2 + 1);

    }


}