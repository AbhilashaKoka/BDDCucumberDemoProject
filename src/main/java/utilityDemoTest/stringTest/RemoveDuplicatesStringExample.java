package utilityDemoTest.stringTest;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesStringExample {
    public static void main(String[] args) {
        String str = "programming";
        String result = removeDuplicates(str);
        System.out.println("String after removing duplicates: " + result);
    }

    // Method to remove duplicate characters from a string
    public static String removeDuplicates(String str) {
        Set<Character> set = new LinkedHashSet<>();
        for (char ch : str.toCharArray()) {
            set.add(ch);
        }
        StringBuilder sb = new StringBuilder();
        for (char ch : set) {
            sb.append(ch);
        }
        return sb.toString();
    }
}