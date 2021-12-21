package dronelab;

import dronelab.beans.Repair;
import dronelab.db_dao.RepairsDB;
import dronelab.sql.DataBaseManager;

import java.sql.Date;
import java.sql.SQLException;

public class DB_tester {
    public static void main(String[] args) throws SQLException {
        //DataBaseManager.createDataBase();
        //DataBaseManager.createTable();

        Repair repair = new Repair(Date.valueOf("2020-12-22"),Date.valueOf("2020-12-12")
        ,"Tomer broke my life :)","kjh45kj64",true,false,
                "Tal Kipa",false);

        RepairsDB myRepairs = new RepairsDB();
        myRepairs.addRepair(repair);
        System.out.println("me finished !!!!");
    }
}
