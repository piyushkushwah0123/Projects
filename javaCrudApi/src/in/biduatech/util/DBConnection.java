package in.biduatech.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static final String DBURL = "jdbc:mysql://localhost:3306/sqldb";
    private static final String DBUSERNAME = "root";
    private static final String DBPASSWORD = "root";

    private static Connection connection = null;

    public static Connection getConnection() throws SQLException, ClassNotFoundException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        if (connection == null) {
            connection = DriverManager.getConnection(DBURL, DBUSERNAME, DBPASSWORD);
        }

        return connection;
    }
}