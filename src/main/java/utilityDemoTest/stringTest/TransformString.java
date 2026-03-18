package utilityDemoTest.stringTest;

import java.util.HashMap;
import java.util.Map;

public class TransformString {

    public static void arrToMapConversion(String[] array){
        Map<String, Integer> map = new HashMap<>();
        for (String element : array){
            map.put(element, element.length());
        }
        for(String key : map.keySet()){
            System.out.println("Key:" + key + ",Value:" + map.get(key));
        }
    }

    public static String transformString(String target) {
        StringBuilder transformed = new StringBuilder();
        char[] targetArray = target.toCharArray();
        for (int i = 0; i < targetArray.length; i++){
            transformed.append(targetArray[i]);
        }
        return transformed.toString();
    }


    public static void transformString1(String input)
        {
            String result = input.charAt(6)  // 's'
                    + input.substring(3, 4)  // 'a'
                    + input.charAt(2)  // 'l'
                    + input.charAt(1)  // 'i'
                    + input.charAt(4); // 'h'
            System.out.println("Transformed string: " + result);
        }


    public static void transformString2(String input) {
        String extracted = input.substring(2, 7); // "hilas"
        String result = "";
        // Build "salih" from the extracted substring
        System.out.println("Transformed string2: " + result);
    }

    public static void main(String[] args) {
        String input = "Abhilasha";
        String target = "salih";

        transformString1(input);
        transformString2(input);

        String result = transformString(target);
        System.out.println("Transformed string:" + result);


        String[] array = {"apple", "banana", "cherry"};
        arrToMapConversion(array);
    }

}