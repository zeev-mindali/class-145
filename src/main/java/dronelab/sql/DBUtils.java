package dronelab.sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBUtils {
    public static void runQuery(String sql)  {
        //use connection from connection.sql to send queries to our db
        Connection connection = null;

        try {
            //get a connection from connection pool
            connection = ConnectionPool.getInstance().getConnection();

            //prepare our sql (string) and convert it to a language that mysql will understand
            PreparedStatement statement = connection.prepareStatement(sql);

            //run statement
            statement.execute();

        } catch (SQLException|InterruptedException err) {
            System.out.println(err.getMessage());
        } finally {
            ConnectionPool.getInstance().returnConnection(connection);
        }

    }
}
