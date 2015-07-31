package by.academy;

import org.apache.commons.dbcp.BasicDataSource;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;
import java.util.ResourceBundle;

/** ����������� � ����  */
@SuppressWarnings("unused")
public class ConnectionPool {
    private static ConnectionPool instanse;
    private BasicDataSource dataSource;
    private static final String DRIVER   = "jdbc:mysql://localhost:3306/policestation";
    private static final String URL 	 = "com.mysql.jdbc.Driver";
    private static final String USER 	 = "root";
    private static final String PASSWORD = "qwe321";

    private ConnectionPool() {
        dataSource = new BasicDataSource();
        dataSource.setDriverClassName(DRIVER);
        dataSource.setUrl(URL);
        dataSource.setUsername(USER);
        dataSource.setPassword(PASSWORD);
    }

    public static synchronized ConnectionPool getInstanse() {
        if (instanse == null) {
            instanse = new ConnectionPool();
        }
        return instanse;
    }

    public Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }

    public void closeConnection() throws SQLException {
        dataSource.close();
    }
}
