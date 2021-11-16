package class5_1611;

import java.util.Date;

public class Tester {
    public static void main(String[] args) {

        //Person[] persons = new Person[3];
        //persons[0] = new Person("Zeev",178,110);
        //persons[1] = new Person("Tal Kipa",183,65);
        //persons[2] = new Person("Alon",186,90); //ולא מתבייש

        Person[] persons = {
                new Person("Zeev", 178, 110),
                new Person("Tal Kipa", 183, 65),
                new Person("Alon", 186, 90),
                new Person("nadav", 173, 68)
        };

        //Person nudnik = new Person();  will not work, constructor needs to be with parameters

        Person[] enoroex = whoIsEnorex(persons);
        Person[] sroch = whoIsSroch(persons);
        System.out.println(new Date().getTime());
        //print the two arrays
        printArray(enoroex);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println(new Date().getTime());
        printArray(sroch);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println(new Date());


    }

    public static Person[] whoIsEnorex(Person[] thinToFat) {
        //create a new array and copy all the values.
        thinToFat = createNewArray(thinToFat);

        for (int index = 0; index < thinToFat.length - 1; index++) {
            for (int row = 0; row < thinToFat.length - index - 1; row++) {
                if (thinToFat[row].getWeight() > thinToFat[row + 1].getWeight()) {
                    Person temp = thinToFat[row];
                    thinToFat[row] = thinToFat[row + 1];
                    thinToFat[row + 1] = temp;
                }
            }
        }
        /*
        for (int index = 0; index < thinToFat.length ; index++) {
            for (int row = index+1; row < thinToFat.length ; row++) {
                if (thinToFat[index].getWeight() > thinToFat[row].getWeight()) {
                    Person temp = thinToFat[index];
                    thinToFat[index] = thinToFat[row];
                    thinToFat[row] = temp;
                }
            }
        }

         */
        return thinToFat;
    }

    public static Person[] whoIsSroch(Person[] smallToHigh) {
        //create a new array and copy all the values.
        smallToHigh = createNewArray(smallToHigh);

        for (int index = 0; index < smallToHigh.length - 1; index++) {
            for (int row = 0; row < smallToHigh.length - index - 1; row++) {
                if (smallToHigh[row].getHeight() > smallToHigh[row + 1].getHeight()) {
                    Person temp = smallToHigh[row];
                    smallToHigh[row] = smallToHigh[row + 1];
                    smallToHigh[row + 1] = temp;
                }
            }
        }

        return smallToHigh;
    }

    private static void printArray(Person[] toPrint) {
        for (int counter = 0; counter < toPrint.length; counter++) {
            System.out.println(toPrint[counter].show());
            System.out.println();
        }
    }

    private static Person[] createNewArray(Person[] tempPersons) {
        Person[] checkPersons = new Person[tempPersons.length];
        for (int counter = 0; counter < tempPersons.length; counter++) {
            //                               instance Person
            //Person newPerson = new Person(tempPersons[counter]);
            checkPersons[counter] = new Person(tempPersons[counter]);
        }
        return checkPersons;
    }

}
