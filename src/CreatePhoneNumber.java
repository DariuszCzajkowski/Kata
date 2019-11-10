import java.lang.reflect.Array;
import java.util.Arrays;

public class CreatePhoneNumber {

    public static String createPhoneNumber(int [] numbers){

       int [] array= numbers;
        Arrays.toString(array);



        String s="("+array[0]+""+array[1]+""+array[2]+") "+array[3]+""+array[4]+""+array[5]+"-"+array[6]+""+array[7]+""+array[8];


        return s;}
}
