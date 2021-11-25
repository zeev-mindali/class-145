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
        int[] display = findUnique(array1, array2);
        print(display);
        //print array with all distinct number as small as possible
    }

    private static int[] findUnique(int[] arr1, int[] arr2) {
        int uniqueCounter = 0;
        boolean foundNumber;
        int[] tempArray = new int[arr1.length];

        for (int counter = 0; counter < arr1.length; counter++) {
            foundNumber = false;
            for (int item : arr2) {
                if (item == arr1[counter]) {
                    foundNumber = true;
                    break;
                }
            }
            if (!foundNumber) {
                if (!checkArray(tempArray, arr1[counter])) {
                    tempArray[uniqueCounter++] = arr1[counter];
                }
            }
        }

        for (int counter = 0; counter < arr2.length; counter++) {
            foundNumber = false;
            for (int item : arr1) {
                if (item == arr2[counter]) {
                    foundNumber = true;
                    break;
                }
            }
            if (!foundNumber) {
                if (!checkArray(tempArray, arr2[counter])) {
                    tempArray[uniqueCounter++] = arr2[counter];
                }
            }
        }

        int[] returnArray = new int[uniqueCounter];
        for (int counter = 0; counter < returnArray.length; counter++) {
            returnArray[counter] = tempArray[counter];
        }
        return returnArray;
    }

    private static boolean checkArray(int[] arr, int number) {
        for (int item : arr) {
            if (item == number) {
                return true;
            }
        }
        return false;
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
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
