import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Kata.findShort("ttryrtyry trtyrtyyr yuyuiyuuoio yutyutyutyt tyrtyyterytryrt yyy ");

        TwoToOne.longest("dsfsdggnirtwrrgvcz", "spoiuyttrewwqasdfghjkl");

        String a = CreatePhoneNumber.createPhoneNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0});

        System.out.println(a);
        JadenCase.toJadenCase("dddh fhdf dfgdffg");

        System.out.println(Maskify.maskify("16645"));
        boolean ans = PangramChecker.check("qwertyuioupzxcvbm,dsfghyrurtethgyth");

        int z = FindOutlier.find(new int[]{22, -2, 54, -4, 0, 8, 8, 33, 66});


        System.out.println(z);
        String c = Conversion.romanNumber(89);
        System.out.println(c);
        System.out.println(ans);

        SpinWords.spinWords("welcome to the jungle");


        // System.out.println("Write down word to check middle or middles letters");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        // System.out.println("Middle letter of word" + word + " is: " + MiddleCharacter.getMiddle(word));*/
        System.out.println("PigIt :( " + word + " ) = " + PigIt.pigIt(word));


        //Challenge(new double[]{4.5, 3.0, 6.6, 7.3, 8.5, 87643.0, 32.0, 3.0, 4.0, 5.0});


    }
}
