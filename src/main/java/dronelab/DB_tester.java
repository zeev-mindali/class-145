package dronelab;

import dronelab.sql.DataBaseManager;

import java.sql.SQLException;

public class DB_tester {
    public static void main(String[] args) throws SQLException {
        DataBaseManager.createDataBase();
        DataBaseManager.createTable();
        System.out.println("me finished !!!!");
    }
}
