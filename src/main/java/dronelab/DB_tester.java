package dronelab;

import dronelab.beans.Repair;
import dronelab.db_dao.RepairsDB;
import dronelab.sql.DataBaseManager;

import java.sql.Date;
import java.sql.SQLException;

public class DB_tester {
    public static void main(String[] args) throws SQLException {
        DataBaseManager.createDataBase();
        DataBaseManager.createTable();

        Repair repair = new Repair(Date.valueOf("2020-12-30"),Date.valueOf("2020-12-31")
        ,"drone for new year","tomsh1234",true,false,
                "Tal Kipa",false);

        RepairsDB myRepairs = new RepairsDB();
        //System.out.println("command was run:"+myRepairs.addRepair(repair));

        String oldSn= repair.getSn();
        repair.setMemo("mini drone !!!");
        repair.setSn("TalKita");
        //myRepairs.updateRepair(repair,oldSn);

        for (Repair item: myRepairs.getRepairList()){
            System.out.println(item);
        }


        myRepairs.deleteRecord("zeev1234");
        System.out.println("me finished !!!!");
    }
}
