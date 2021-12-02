package dronelab;

import dronelab.facade.RepairLab;

public class Tester {
    public static void main(String[] args) {
       RepairLab myLab = new RepairLab();
       myLab.deleteRepairBySN("123456");
    }
}
