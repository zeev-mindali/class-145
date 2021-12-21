package dronelab.db_dao;

import dronelab.beans.Repair;
import dronelab.dao.Dao;
import dronelab.sql.ConnectionPool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Set;

public class RepairsDB implements Dao {
    private final String ADD_REPAIR="INSERT INTO `drone_lab`.`repairs` " +
            "(`memo`,`sn`,`entered`,`readyon`,`isimportant`,`ispoped`)" +
            "VALUES (?,?,?,?,?,?);";

    private Connection connection;
    private boolean isOK;
    @Override
    public boolean addRepair(Repair repair) {
        try {
            //get connection
            connection = ConnectionPool.getInstance().getConnection();

            PreparedStatement preparedStatement = connection.prepareStatement(ADD_REPAIR);
            //replace the ? with real data
            preparedStatement.setString(1, repair.getMemo());
            preparedStatement.setString(2, repair.getSn());
            preparedStatement.setDate(3,repair.getEntred());
            preparedStatement.setDate(4,repair.getReadyOn());
            preparedStatement.setBoolean(5,repair.isImportent());
            preparedStatement.setBoolean(6,repair.isPoped());
            //run the sql
            isOK=preparedStatement.execute();
        } catch (InterruptedException | SQLException err) {
            System.out.println(err.getMessage());
            isOK=false;
        }
        finally {
            ConnectionPool.getInstance().returnConnection(connection);
        }
        return isOK;
    }

    @Override
    public List<Repair> getRepairList() {
        return null;
    }

    @Override
    public Set<Repair> getRepairSet() {
        return null;
    }

    @Override
    public boolean deleteRepair(Repair repair) {
        return false;
    }
}
