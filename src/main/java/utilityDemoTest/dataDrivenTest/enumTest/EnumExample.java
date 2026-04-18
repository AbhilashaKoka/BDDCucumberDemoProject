package utilityDemoTest.dataDrivenTest.enumTest;

public class EnumExample {

    public enum DIRECTIONS {
        NORTH, SOUTH, EAST, WEST
    }


    public static void main(String[] args) {
    DIRECTIONS direction = DIRECTIONS.NORTH;
        switch (direction){
            case NORTH:
                System.out.println("Heading North");
                break;
            case SOUTH:
                System.out.println("Heading South");
                break;
            case EAST:
                System.out.println("Heading East");
                break;
            case WEST:
                System.out.println("Heading West");
                break;
        }
    }
}
