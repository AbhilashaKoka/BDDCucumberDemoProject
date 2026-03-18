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
}
