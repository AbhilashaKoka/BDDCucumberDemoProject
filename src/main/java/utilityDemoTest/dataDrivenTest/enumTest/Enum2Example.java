package utilityDemoTest.dataDrivenTest.enumTest;

public class Enum2Example {
    public enum Day {
        MONDAY("Start of work week"),
        TUESDAY("Second day"),
        WEDNESDAY("Mid week"),
        THURSDAY("Almost there"),
        FRIDAY("End of work week"),
        SATURDAY("Weekend"),
        SUNDAY("Weekend");

        private String description;

        private Day(String description) {
            this.description = description;
        }

        public String getDescription() {
            return description;
        }
    }

    public static void main(String[] args) {
        Day today = Day.FRIDAY;

        System.out.println("Today is: " + today);
        System.out.println("Description: " + today.getDescription());

        System.out.println("All Days:");
        for (Day day : Day.values()) {
            System.out.println(day + ": " + day.getDescription());
        }
    }
}