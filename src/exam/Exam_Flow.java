package exam;

public class Exam_Flow {

    public static void main(String[] args) {
        //create two arrays of given size (FINAL)
        //and insert into the arrays random number between 0-9
        final int ARRAY_SIZE = 15;

        //int[] array1 = new int[ARRAY_SIZE];
        //int[] array2 = new int[ARRAY_SIZE];

        int[] array1 = getArray(ARRAY_SIZE);
        int[] array2 = getArray(ARRAY_SIZE);

        //print the arrays
        System.out.println("Array 1\n=======");
        print(array1);
        System.out.println();
        System.out.println("Array 2\n=======");
        print(array2);

        //
    }

    private static int[] getArray(int array_size) {
        int[] array = new int[array_size];
        for (int counter = 0; counter < array.length; counter++) {
            array[counter] = (int) (Math.random() * 10);
        }
        return array;
    }

    private static void print(int[] array) {
        for (int item : array) {
            System.out.print(item + ",");
        }
        System.out.println();
    }
}
