package utilityDemoTest.dataDrivenTest.enumTest;

public class EnumMethodExample {
    public enum DIRECTIONS {
        NORTH,
        SOUTH,
        WEST,
        EAST
    }


    public static void main(String[] args) {
        // Using values() method to get all enum constants
        System.out.println("All directions:");
        for (DIRECTIONS direction : DIRECTIONS.values()) {
            System.out.println(direction);
        }

        // Using valueOf() method to get enum constant by name
        String directionName = "NORTH";
        try {
            DIRECTIONS direction = DIRECTIONS.valueOf(directionName);
            System.out.println("Direction found: " + direction);
        } catch (IllegalArgumentException e) {
            System.out.println("Direction not found: " + directionName);
        }
// Using ordinal() method
        // Using valueOf() method
        DIRECTIONS dir = DIRECTIONS.valueOf("EAST");
        System.out.println("Direction: " + dir);
        System.out.println("Ordinal of EAST: " + dir.ordinal());

    }
}
