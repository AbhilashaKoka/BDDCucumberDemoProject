package utilityDemoTest.staticAndNonStaticTest;

public class OuterClass {
    private static String staticOuterField="Static Outer Field";
    private String outerField = "Outer Field";

    //Static Nested Class

    static class StaticNestedClass{
        void display()
        {
            System.out.println("Static Nested Class accessing:"+staticOuterField);
        }
    }

    //Inner Class
    class InnerClass{
        void display()
        {
                       System.out.println("Inner Class accessing:"+outerField);
        }
    }
    void  display() {
        final String localVariable = "Local Variable";

        //local inner class
        class LocalInnerClass {
            void show() {
                System.out.println("Local Inner Class accessing:" + localVariable);
            }
        }
        LocalInnerClass localInnerClass = new LocalInnerClass();
        localInnerClass.show();
    }

    void anonymousClassExample() {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous Class accessing: " + staticOuterField);
            }
        };
        runnable.run();
    }

    public static void main(String[] args) {
        //Accessing Static Nested Class
        OuterClass.StaticNestedClass staticNestedClass = new OuterClass.StaticNestedClass();
        staticNestedClass.display();

        //Accessing Inner Class
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.display();

        //Accessing Local Inner Class
        outerClass.display();

        //Accessing Anonymous Class
        outerClass.anonymousClassExample();
    }
}
