public class Kata {
    public static int findShort(String s) {
        String[] tempChar = s.split(" ");
        int arrayLength = tempChar.length;
        int numberOfChar = tempChar[0].length();
        for (int i = 0; i < arrayLength; i++) {
            int counter = tempChar[i].length();
            if (numberOfChar > counter) {
                numberOfChar = counter;

            }
        }
        System.out.println(numberOfChar);


        return numberOfChar;
    }


}
