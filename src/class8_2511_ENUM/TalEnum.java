package class8_2511_ENUM;

public enum TalEnum {
    TRIANGLE(3, 100),
    SQUARE(4, 100),
    PENTAGON(5, 100),
    HEXAGON(6, 100),
    OCTAGON(8, 100);

    private final int numOfEdges;
    private final int size;

    private TalEnum(int numOfEdges, int size) {
        this.numOfEdges = numOfEdges;
        this.size = size;
    }

    public int calcPerimeter(int edgeLength) {
        return edgeLength * numOfEdges;
    }

    public int getNumOfEdges() {
        return numOfEdges;
    }

}
