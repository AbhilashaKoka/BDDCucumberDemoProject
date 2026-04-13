package utilityDemoTest.stringTest;

public class PalindromeChec {
    public static void main(String[] args) {
        String str="Madam";
        palindromeCheck(str);
    }

    public static void palindromeCheck( String str ){
      boolean isPalindrome=new StringBuilder(str.toLowerCase()).reverse().toString().equals(str.toLowerCase());
        System.out.println(isPalindrome);
    }

    boolean checkPalindromeString(String input) {
        boolean result = true;
        int length = input.length();

        for (int i = 0; i < length/2; i++) {
            if (input.charAt(i) != input.charAt(length - i - 1)) {
                result = false;
                break;
            }
        }

        return result;
    }
}
