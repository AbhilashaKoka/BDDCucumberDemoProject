package utilityDemoTest.dataDrivenTest.enumTest;

public class EnumWithFieldsExample {
    public enum Size {
        SMALL(30), MEDIUM(40), LARGE(50);

        private int value;

        private Size(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    public static void main(String[] args) {
        Size size = Size.MEDIUM;
        System.out.println("Size: " + size + ", Value: " + size.getValue());
    }
}
