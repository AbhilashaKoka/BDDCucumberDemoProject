package utilityDemoTest.stringTest;

public class VowelConsonantCountExample {
    public static void main(String[] args) {
        String str = "Hello, World!";
        int[] counts = countVowelsAndConsonants(str);
        System.out.println("Number of vowels: " + counts[0]);
        System.out.println("Number of consonants: " + counts[1]);
    }

    // Method to count vowels and consonants
    public static int[] countVowelsAndConsonants(String str) {
        int vowels = 0;
        int consonants = 0;
        str = str.toLowerCase();
        for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        return new int[]{vowels, consonants};
    }
}
