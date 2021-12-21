package dronelab.dao;

import dronelab.beans.Repair;

import java.util.List;
import java.util.Set;

public interface Dao {
    //add new repair to db
    boolean addRepair(Repair repair);

    //get a list of repairs as list collection
    List<Repair> getRepairList();

    //get a list of repairs as set collection
    Set<Repair> getRepairSet();

    //delete a repair
    boolean deleteRepair(Repair repair);

    //update part of record by sn
    boolean updateRepair(Repair repair,String oldSN);

    //delete record by sn
    void deleteRecord(String sn);
}
