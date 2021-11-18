package class6_18_11_static;

import class6_1811.Art;

public class Connection {
    private static Connection connection = null;

    private Connection() {
        System.out.println("Creating connection");
        System.out.println(Art.PRINT_CTOR);
    }

    public static Connection getInstance() {
        if (connection == null) {
            connection = new Connection();
        }
        System.out.println("Give connection to Alon");
        return connection;
    }
}
