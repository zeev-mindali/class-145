package dronelab.threads;

import dronelab.art.ArtUtil;
import dronelab.beans.Repair;

import java.time.LocalDate;
import java.util.List;

public class RepairScannerThread implements Runnable {
    //our repair list
    private List<Repair> repairList;

    //boolean to stop the work in normal way
    boolean isRunning=true;

    //how many times VIP will apper
    private final int VIP_TIMES = 3;

    //                                 REFERANCE
    public RepairScannerThread(List<Repair> repairList) {
        this.repairList = repairList;
    }

    public void stopScan(){
        this.isRunning=false;
    }

    @Override
    public void run() {
        //the thread will be running endlessly
        while (isRunning) {
            //itreate on entire collection
            for (Repair item : repairList) {
                //check if we sent a message
                if (!item.isPoped()) {
                    //check if the date of the readyon is before current date
                    //       23/12/2021                23/12/2021
                    if (item.getReadyOn().isBefore(LocalDate.now())) {
                        //print banner
                        System.out.println(ArtUtil.droneReady);
                        //print item
                        System.out.println(item);
                        //set isPoped to true, since we print the item to the screen
                        item.setPoped(true);
                        //check if the item is VIP,if it's vip send 3 messages every 30 seconds
                        if (item.isImportent()) {
                            //thread !!!!!!!!!!!!!!!!!!!!!!
                            //anonymous thread
                            new Thread(new Runnable() {
                                @Override
                                public void run() {
                                    //repeat message 3 times , VIP_TIMES=3
                                    for (int counter = 0; counter < VIP_TIMES; counter++) {
                                        try {
                                            //go to sleep 30 sec.
                                            Thread.sleep(30*1000);
                                            //print VIP in big
                                            System.out.println(ArtUtil.VIP);
                                            //print repair details (item)
                                            System.out.println(item);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                }
                            }).start();
                        }
                    }
                }
            }
            //don't check endlessly, take a little sleep
            try {
                Thread.sleep(15 * 60 * 1000); //15*24*60*60*1000
            } catch (InterruptedException e) {
                isRunning=false;
            }
        }
    }
}
