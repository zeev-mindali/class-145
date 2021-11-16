package Class_Targil_3;

public class Tester {
    public static void main(String[] args) {
        Person[] persons = new Person[3];
        persons[0] = new Person();
        persons[0].setName("Zeev");
        persons[0].setHeight(178);
        persons[0].setWeight(110);
        persons[1] = new Person();
        persons[1].setName("Tal Kipa");
        persons[1].setHeight(183);
        persons[1].setWeight(65);
        persons[2] = new Person();
        persons[2].setName("Alon");
        persons[2].setHeight(186);
        persons[2].setWeight(90); //ולא מתבייש

        Person[] enoroex = whoIsEnorex(persons);
        Person[] sroch = whoIsSroch(persons);

        //print the two arrays
        printArray(enoroex);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        printArray(sroch);
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
            Person newPerson = new Person();
            newPerson.setName(tempPersons[counter].getName());
            newPerson.setHeight(tempPersons[counter].getHeight());
            newPerson.setWeight(tempPersons[counter].getWeight());
            checkPersons[counter] = newPerson;
        }
        return checkPersons;
    }

}
