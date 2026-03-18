package utilityDemoTest.stringTest;

public class PrintRepeatedCharacterGivenWord {
    public static void main(String[] args) {
        String input = "hello";
        String doubledString = "";

        char[] doubledArray = new char[input.length() * 2];
        int index = 0;
        for (char c : input.toCharArray()) {
            doubledArray[index++] = c;
            doubledArray[index++] = c;
        }
        System.out.println("Transformed string: " + doubledString);

    }

    public static void MethodTwo() {
        String input = "hello";
        String doubledString = "";

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            doubledString += c;
            doubledString += c;
        }
        System.out.println("Transformed string: " + doubledString);

    }

    public static void method3() {
        String input = "hello";
        StringBuilder doubledString = new StringBuilder();
        for (char c : input.toCharArray()) {
            doubledString.append(c).append(c);
        }
        System.out.println("Transformed string: " + doubledString.toString());
    }
}