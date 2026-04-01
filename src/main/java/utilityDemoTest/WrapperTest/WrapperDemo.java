package utilityDemoTest.WrapperTest;

public class WrapperDemo {
        public static void main(String[] args) {

            //Converting string to Primitive
            int num = Integer.parseInt("100");
            double d = Double.parseDouble("12.34");
            boolean b = Boolean.parseBoolean("true");

            System.out.println(num); // 100
            System.out.println(d);   // 12.34
            System.out.println(b);   // true


            //Converting Primitive/String to Wrapper
            Integer num2 = Integer.valueOf(200);
            Double d2 = Double.valueOf("45.67");
            Boolean b2 = Boolean.valueOf("false");

            System.out.println(num2); // 200
            System.out.println(d2);   // 45.67
            System.out.println(b2);   // false


            //Converting Wrapper to Primitive
            Integer num3 = Integer.valueOf(300);
            int primitive3 = num3.intValue();   // back to int
            double d3 = num3.doubleValue();     // convert to double

            System.out.println(primitive3); // 300
            System.out.println(d3);         // 300.0


            //Compare Wrapper to Object
            Integer a4 = 10;
            Integer b4 = 20;

            System.out.println(a4.compareTo(b4)); // -1 (a < b)
            System.out.println(b4.compareTo(a4)); // 1  (b > a)
            System.out.println(a4.compareTo(10)); // 0 (equal)


            //Check Equality
            Integer a5 = 100;
            Integer b5 = 100;
            Integer c5 = 200;

            System.out.println(a5.equals(b5)); // true
            System.out.println(a5.equals(c5)); // false


            //Converting Wrapper/Primitive  to String
            Integer num6 = 500;
            String str6 = num6.toString();
            System.out.println("String value: " + str6); // "500"

           //Character Class Utility method
            char ch = 'A';
            System.out.println(Character.isDigit(ch));   // false
            System.out.println(Character.isLetter(ch));  // true
            System.out.println(Character.toLowerCase(ch)); // 'a'

        }
    }

