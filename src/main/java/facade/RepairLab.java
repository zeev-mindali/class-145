package facade;

import beans.Repair;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RepairLab {
    private Scanner input = new Scanner(System.in);
    private List<Repair> repairs;

    public RepairLab() {
        repairs = new ArrayList<>();

        //threads

        repairMenu();

    }

    private void repairMenu() {
        int choice=0; //1- create , 2-read (view) , 3 -delete ,4-quit
        do{
            System.out.println("Repair menu");
            System.out.println("===========");
            System.out.println("1 - Create new repair");
            System.out.println("2 - view all repairs");
            System.out.println("3 - delete repair");
            System.out.println("4 - quit");
            choice = input.nextInt();
            switch (choice){
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                default:
                    System.out.println("Wrong choice");
            }
        } while (choice != 4);
    }
}
