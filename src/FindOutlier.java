

import java.util.ArrayList;

public class FindOutlier {

    static int find(int[] integers) {

        int a;
        int rest;
        ArrayList outputOdd = new ArrayList();
        ArrayList outputEven = new ArrayList();

        for (int integer : integers) {


            a = integer;
            if (a != 0) {
                rest = a % 2;
                if (rest != 0) {
                    outputOdd.add(a);

                } else if (rest == 0) {
                    outputEven.add(a);

                }
            }
        }
        if (1 == outputOdd.size()) {

            int odd = (int) outputOdd.get(0);

            return odd;
        } else if (1 == outputEven.size()) {
            int even = (int) outputEven.get(0);
            return even;
        }
                return 0;
    }




}

