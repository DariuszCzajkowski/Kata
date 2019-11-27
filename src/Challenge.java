public class Challenge {
    public static boolean checkPalindrome(String str) {
        String strNew=str.replace(" ", "");
         if (strNew.contentEquals(new StringBuilder(strNew).reverse())){
             System.out.println("Is \""+str+"\" a palindrome = " + true);
             return true;
         }
        System.out.println("Is \""+str+"\" a palindrome =" + false);
  return false;  }
}