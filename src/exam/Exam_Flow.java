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

        //print the lowest number from 4 cells in the array
        System.out.println();
        System.out.println(findLowestNumber(array1, 4));
        System.out.println(findLowestNumber(array2, 4));

        //find all unique number in array (distinct) in both arrays

        //print array with all distinct number as small as possible
    }

    private static int findLowestNumber(int[] arr, int size) {
        int lowNumber = Integer.MAX_VALUE;
        for (int counter = 0; counter < arr.length - size; counter++) {
            //7,1,5,2
            int checkNumber = 0;
            for (int index = 0; index < size; index++) {
                checkNumber += arr[counter + index];
                checkNumber *= 10;
            }
            checkNumber /= 10;
            if (checkNumber < lowNumber) {
                lowNumber = checkNumber;
            }
            /*
            int checkNumber = arr[counter]*10;          //70
            checkNumber=(checkNumber+arr[counter+1])*10;//710
            checkNumber=(checkNumber+arr[counter+2])*10;//7150
            checkNumber=(checkNumber+arr[counter+3]);   //7152
            if (checkNumber<lowNumber){
                lowNumber=checkNumber;
            }
            */
        }
        return lowNumber;
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
