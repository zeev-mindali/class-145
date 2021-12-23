package dronelab.facade;

import dronelab.beans.Repair;
import dronelab.sql.ConnectionPool;
import dronelab.threads.RepairScannerThread;
import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;

public class RepairLab {
    private Scanner input = new Scanner(System.in);
    private List<Repair> repairs;
    private Runnable repairScanner;
    private Thread repairThread;

    @SneakyThrows
    public RepairLab() {
        repairs = new ArrayList<>();
        ConnectionPool connectionPool = ConnectionPool.getInstance();

        //threads
        //create instance of runnable since RepairScannerThread is Runnable
        repairScanner = new RepairScannerThread(repairs);
        //create a true thread from runnable instance
        repairThread = new Thread(repairScanner);
        //start your engines !!!!!
        repairThread.start();

        //show the menu
        repairMenu();

    }

    private void repairMenu() {
        int choice = 0; //1- create , 2-read (view) , 3 -delete, 4-update ,5-quit
        do {
            System.out.println("Repair menu");
            System.out.println("===========");
            System.out.println("1 - Create new repair");
            System.out.println("2 - view all repairs");
            System.out.println("3 - delete repair");
            System.out.println("4 - update repair");
            System.out.println("5 - quit");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    handleNewRepair();
                    break;
                case 2:
                    showRepairs();
                    break;
                case 3:
                    //delete repair by sn
                    deleteRepair();
                    break;
                case 4:
                    //update reapir by sn
                    updateRepair();
                    break;
                case 5:
                    try {
                        ConnectionPool.getInstance().closeAllConnection();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    repairThread.interrupt();
                    System.out.println("Love to see you go, hate to see you leave");
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        } while (choice != 5);
    }

    //get item by sn, and update in the DB
    private void updateRepair() {
        //todo: tal need to finish it at home :)
        //todo: change the value if the user entered any input.
        //drone memo (need to fix leg):need to fix leg and gimbel
        //Repair repair = repairs.get(2);
        //repair.setMemo(input.nextLine());
    }

    private void deleteRepair() {
        System.out.println("Please enter a S/N to delete");
        String sn = input.nextLine();
        deleteRepairBySN(sn);
    }

    //todo : also delete from data base
    public void deleteRepairBySN(String sn) {
        for (Repair item : repairs) {
            if (item.getSn().equals(sn)) {
                repairs.remove(item);
            }
        }
    }

    //show only repairs -> isReady = false
    public List<Repair> getRepairs() {
        return this.repairs;
    }

    //todo: get repair list form mysql database and show it on the screen
    private void showRepairs() {

        for (Repair item : repairs) {
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

    //todo: add new repair to mysql db
    public void addNewRepair(Repair repair) {
        repairs.add(repair);
    }


    //todo: get date and time from user and update the value
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
        boolean isImportent = input.nextLine().charAt(0) == 'y';

        //handle ready on set the estimated date of fix to user input date

        Date readyOn = Date.valueOf("2022-12-12");
//        readyOn.set(Calendar.DAY_OF_MONTH,day);
//        readyOn.set(Calendar.MONTH,month);
//        readyOn.set(Calendar.YEAR,year);
//        readyOn.set(Calendar.HOUR,hour);
//        readyOn.set(Calendar.MINUTE,min);

        Repair newRepair = Repair.builder()
                .entred(LocalDate.now())
                .readyOn(readyOn.toInstant().atZone(ZoneId.systemDefault()).toLocalDate())
                .memo(memo)
                .sn(sn)
                .isImportent(isImportent)
                .build();
        repairs.add(newRepair);

    }
}
