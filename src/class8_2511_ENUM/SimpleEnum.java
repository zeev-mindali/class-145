package class8_2511_ENUM;

public class SimpleEnum {
    enum Direction {
        North,
        South,
        East,
        West
    }

    public static void main(String[] args) {
        Level myLevel = Level.LOW;
        Direction myDirection = Direction.North;
        //System.out.println(myDirection);
        switch (myDirection) {
            case East:
                System.out.println("Jerusalem");
                break;
            case West:
                System.out.println("Meditarien Sea");
                break;
            case North:
                System.out.println("Qiryat yam");
                break;
            case South:
                System.out.println("Eilat");
                break;
        }


        //print all enum options
        for (Direction item : Direction.values()) {
            System.out.println(item);
        }
    }
}
