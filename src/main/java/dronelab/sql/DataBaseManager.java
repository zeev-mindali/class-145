package dronelab.sql;

import java.sql.SQLException;

public class DataBaseManager {
    public static final String URL = "jdbc:mysql://localhost:3306/";
    public static final String USER_NAME = "root";
    public static final String USER_PASS = "12345678";

    public static final String CREATE_DB = "CREATE DATABASE IF NOT EXISTS drone_lab";
    public static final String DROP_DB = "DROP DATABASE drone_lab";
    public static final int MAX_CONNECTION = 10;
    public static final String CREATE_TABLE = "CREATE TABLE `drone_lab`.`repairs` (\n" +
            "  `number` INT NOT NULL AUTO_INCREMENT,\n" +
            "  `memo` VARCHAR(150) NOT NULL,\n" +
            "  `entered` DATE NOT NULL,\n" +
            "  `readyon` DATE NOT NULL,\n" +
            "  `isImportant` TINYINT NOT NULL,\n" +
            "  `ispoped` TINYINT NOT NULL,\n" +
            "  `sn` VARCHAR(45) NULL,\n" +
            "  PRIMARY KEY (`number`),\n" +
            "  UNIQUE INDEX `sn_UNIQUE` (`sn` ASC) VISIBLE);";

    public static final String DROP_TABLE = "DROP TABLE `drone_lab`.`repairs`";

    public static void createDataBase() throws SQLException{
        DBUtils.runQuery(CREATE_DB);
    }

    public static void dropDataBase() throws SQLException{
        DBUtils.runQuery(DROP_DB);
    }

    public static void createTable() throws SQLException{
        DBUtils.runQuery(CREATE_TABLE);
    }

    public static void dropTable() throws SQLException{
        DBUtils.runQuery(DROP_TABLE);
    }
}
