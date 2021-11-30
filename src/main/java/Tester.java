import beans.Repair;
import facade.RepairLab;

import java.util.Calendar;

public class Tester {
    public static void main(String[] args) {
       RepairLab myLab = new RepairLab();
       myLab.deleteRepairBySN("123456");
    }
}
