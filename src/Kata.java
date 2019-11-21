public class Kata {
    public static int findShort(String s) {
        String[] tempChar = s.split(" ");
        int numberOfChar = tempChar[0].length();
        for (String value : tempChar) {
            int counter = value.length();
            if (numberOfChar > counter) {
                numberOfChar = counter;

            }
        }
        System.out.println(numberOfChar);


        return numberOfChar;
    }


}
