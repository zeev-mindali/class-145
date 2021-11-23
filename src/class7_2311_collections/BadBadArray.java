package class7_2311_collections;

public class BadBadArray {
    public static void main(String[] args) {
        int[] myNumber = new int[10];
        int[] yair = {5, 4, 3, 2, 1};


        for (int counter = 0; counter < myNumber.length; counter++) {
            myNumber[counter] = counter;
        }
    }
}
