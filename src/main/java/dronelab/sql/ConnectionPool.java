package dronelab.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Stack;

public class ConnectionPool {
    //file->project structure->libraries->from maven...
    //mysql:mysql-connector-java:jar:8.0.26

    private static ConnectionPool instance = null;

    /*
        maximum connection = 10
     */

    private final int NUM_OF_CONNECTION=DataBaseManager.MAX_CONNECTION;

    /*
        Stack - lifo collection
     */
    private Stack<Connection> connections = new Stack<>();

    //private c'tor
    private ConnectionPool() throws SQLException {
        openAllConnections();
    }

    private void openAllConnections() throws SQLException {
        for (int index=0;index<NUM_OF_CONNECTION;index++){
            //Connection connection = DriverManager.getConnection("mysql","root","12345678");
            Connection connection = DriverManager.getConnection(DataBaseManager.URL,DataBaseManager.USER_NAME,DataBaseManager.USER_PASS);
            connections.push(connection);
        }
    }

    public static ConnectionPool getInstance()  {
        if (instance==null){
            synchronized (ConnectionPool.class) {
                if (instance==null) {
                    try {
                        instance = new ConnectionPool();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return instance;
    }

    public Connection getConnection() throws InterruptedException {
        synchronized (connections){
            if(connections.isEmpty()){
                connections.wait();
            }
            return connections.pop();
        }
    }

    public void returnConnection(Connection connection) {
        synchronized (connection) {
            connections.push(connection);
            //connections.notify();
        }
    }

    public void closeAllConnection() throws InterruptedException {
        synchronized (connections){
            while (connections.size()<NUM_OF_CONNECTION){
                connections.wait();
            }
            connections.removeAllElements();
        }
    }
}
