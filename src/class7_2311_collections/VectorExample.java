package class7_2311_collections;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        //collection of vector
        Vector<Integer> myRandomNumbers = new Vector<>();
        int totalNumbers = 50;

        for (int counter = 0; counter < totalNumbers; counter++) {
            int number = (int) (Math.random() * 10 + 1);
            myRandomNumbers.add(number);
        }

        /*
        myRandomNumbers.add(10);
        myRandomNumbers.add(25);
        myRandomNumbers.add(-1);
        myRandomNumbers.add(0);
        */

        /*
        System.out.println(myRandomNumbers);
        int numberTofind=5;
        boolean isFound=false;
        for (int item:myRandomNumbers){
            if (item==numberTofind){
                isFound=true;
                break;
            }
        }
        */
        int numberTofind = 11;
        System.out.println(myRandomNumbers);
        System.out.println(numberTofind + " is found:" + myRandomNumbers.contains(numberTofind));


    }
}
