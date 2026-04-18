package utilityDemoTest.stringTest;

public class ReverseStringExample {
    public static void main(String[] args) {
        String str = "Hello, World!";
        String reversedStr = reverseString(str);
        System.out.println("Reversed String: " + reversedStr);
    }

    // Method to reverse a string
    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}