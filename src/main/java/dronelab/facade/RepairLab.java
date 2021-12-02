package dronelab.facade;

import dronelab.beans.Repair;

import java.util.*;

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
                    handleNewRepair();
                    break;
                case 2:
                    showRepairs();
                    break;
                case 3:
                deleteRepair();
                    break;
                case 4:
                    //todo: handle closing database connections
                    System.out.println("Love to see you go, hate to see you leave");
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        } while (choice != 4);
    }

    private void deleteRepair() {
        System.out.println("Please enter a S/N to delete");
        String sn = input.nextLine();
        deleteRepairBySN(sn);
    }

    public void deleteRepairBySN(String sn){
        for (Repair item:repairs){
            if (item.getSn().equals(sn)){
                repairs.remove(item);
            }
        }
    }

    public List<Repair> getRepairs(){
        return this.repairs;
    }

    private void showRepairs() {

        for (Repair item:repairs){
            System.out.println(item);
        }

        //repairs.forEach(System.out::println);

        /*
        for (Repair item:repairs){
            if (item.isReady()){
                System.out.println(item);
            }
        }
        */

        /*
        repairs.stream().filter(item->item.isImportent())
                .collect(Collectors.toList())
                .forEach(System.out::println);
        */
    }

    public void addNewRepair(Repair repair){
        repairs.add(repair);
    }
    private void handleNewRepair() {
        System.out.println("Create new repair\n===================");
        //enter date time for ready on (eta fix)
        System.out.println("Enter day of month:");
        int day = input.nextInt();
        System.out.println("Enter month:");
        int month = input.nextInt();
        System.out.println("Enter year:");
        int year = input.nextInt();
        System.out.println("Enter hours (0-23)");
        int hour = input.nextInt();
        System.out.println("Enter minutes (0-59");
        int min = input.nextInt();
        System.out.println("Enter a memo:");
        String memo = input.nextLine();
        System.out.println("Enter s/n");
        String sn = input.nextLine();
        System.out.println("Set as importent (y/n)");
        boolean isImportent = input.nextLine().charAt(0) == 'y' ;

        //handle ready on set the estimated date of fix to user input date
        Calendar readyOn = Calendar.getInstance();
        readyOn.set(Calendar.DAY_OF_MONTH,day);
        readyOn.set(Calendar.MONTH,month);
        readyOn.set(Calendar.YEAR,year);
        readyOn.set(Calendar.HOUR,hour);
        readyOn.set(Calendar.MINUTE,min);

        Repair newRepair = Repair.builder()
                .entred(Calendar.getInstance())
                .readyOn(readyOn)
                .memo(memo)
                .sn(sn)
                .isImportent(isImportent)
                .build();
        repairs.add(newRepair);

    }
}
