package dronelab.db_dao;

import dronelab.beans.Repair;
import dronelab.dao.Dao;
import dronelab.sql.ConnectionPool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class RepairsDB implements Dao {
    private final String ADD_REPAIR="INSERT INTO `drone_lab`.`repairs` " +
            "(`memo`,`sn`,`entered`,`readyon`,`isimportant`,`ispoped`)" +
            "VALUES (?,?,?,?,?,?);";

    private final String UPDATE_REPAIR = "UPDATE `drone_lab`.`repairs` " +
            "SET memo=?, sn=?, isimportant=? " +
            "WHERE sn=?";

    private final String DELETE_RECORD = "DELETE FROM `drone_lab`.`repairs` WHERE sn=?";

    private final String GET_ALL_REPAIRS = "SELECT * FROM `drone_lab`.`repairs`";

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
        List<Repair> repairs = new ArrayList<>();

        try {
            connection = ConnectionPool.getInstance().getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(GET_ALL_REPAIRS);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                //   "(`memo`,`sn`,`entered`,`readyon`,`isimportant`,`ispoped`)" +
                /*
                Repair repair = new Repair(
                        resultSet.getString("memo"),
                        resultSet.getString("sn"),
                        resultSet.getDate("entered"),
                        resultSet.getDate("readyon"),
                        resultSet.getBoolean("isimportant"),
                        resultSet.getBoolean("ispoped")

                )*/
                Repair repair = Repair.builder()
                        .entred( resultSet.getDate("entered"))
                        .isImportent( resultSet.getBoolean("isimportant"))
                        .memo( resultSet.getString("memo"))
                        .readyOn(resultSet.getDate("readyon"))
                        .sn( resultSet.getString("sn"))
                        .poped(resultSet.getBoolean("ispoped"))
                        .build();

                repairs.add(repair);
            }
        } catch (InterruptedException | SQLException e) {
            e.printStackTrace();
        }

        return repairs;
    }

    @Override
    public Set<Repair> getRepairSet() {
        return null;
    }

    @Override
    public boolean deleteRepair(Repair repair) {
        return false;
    }

    @Override
    public boolean updateRepair(Repair repair,String oldSN) {
        try {
            connection = ConnectionPool.getInstance().getConnection();

            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_REPAIR);
            preparedStatement.setString(1,repair.getMemo());
            preparedStatement.setString(2, repair.getSn());
            preparedStatement.setBoolean(3,repair.isImportent());
            preparedStatement.setString(4,oldSN);

            isOK= preparedStatement.execute();
        } catch (InterruptedException | SQLException err) {
            System.out.println(err.getMessage());
            isOK=false;
        } finally {
            ConnectionPool.getInstance().returnConnection(connection);
        }
        return isOK;

    }

    @Override
    public void deleteRecord(String sn) {
        try {
            connection = ConnectionPool.getInstance().getConnection();

            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_RECORD);
            preparedStatement.setString(1,sn);

            preparedStatement.execute();
        } catch (InterruptedException | SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionPool.getInstance().returnConnection(connection);
        }
    }
}
