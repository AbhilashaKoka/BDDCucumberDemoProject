package utilityDemoTest.CollectionDemo;

public class StringMethodsDemo {
    public static void main(String[] args) {
        String str = "  Hello World  ";
        String str2 = "hello world";

        // length()
        System.out.println("Length: " + str.length());

        // charAt()
        System.out.println("Char at index 1: " + str.charAt(1));

        // substring()
        System.out.println("Substring (2,7): " + str.substring(2, 7));

        // equals()
        System.out.println("Equals str2: " + str.equals(str2));

        // equalsIgnoreCase()
        System.out.println("EqualsIgnoreCase str2: " + str.trim().equalsIgnoreCase(str2));

        // toUpperCase()
        System.out.println("Uppercase: " + str.toUpperCase());

        // toLowerCase()
        System.out.println("Lowercase: " + str.toLowerCase());

        // trim()
        System.out.println("Trimmed: '" + str.trim() + "'");

        // contains()
        System.out.println("Contains 'World': " + str.contains("World"));

        // startsWith()
        System.out.println("Starts with 'He': " + str.trim().startsWith("He"));

        // endsWith()
        System.out.println("Ends with 'ld': " + str.trim().endsWith("ld"));

        // indexOf()
        System.out.println("Index of 'o': " + str.indexOf('o'));

        // lastIndexOf()
        System.out.println("Last index of 'o': " + str.lastIndexOf('o'));

        // replace()
        System.out.println("Replace 'World' with 'Java': " + str.replace("World", "Java"));

        // split()
        String[] parts = str.trim().split(" ");
        System.out.println("Split result:");
        for (String p : parts) {
            System.out.println(p);
        }
    }
}

// join()