package by.academy;
import java.sql.*;

public class MySqlDAOFactory extends DAOFactory {

	// ���������� ���������� DAOFactory ��� Cloudscape

/*	public static final String DRIVER = "COM.cloudscape.core.RmiJdbcDriver";
	public static final String DBURL = "jdbc:cloudscape:rmi://localhost:1099/CoreJ2EEDB";*/

	// ����� ��� �������� ���������� � MySql
	public static Connection createConnection() {
		ConnectionPool connectionPool = ConnectionPool.getInstanse();
		
		Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            connection = connectionPool.getConnection();
            System.out.println("ok");
        } catch (SQLException e) {
            e.printStackTrace();
        } 
        
		return connection;
	}

	public UserDAO getUserDAO() {
		return new MySqlUserDAO();
	}

	public RoleDAO getAccountDAO() {

		return null; // new MySqlRoleDAO();
	}

	public UserRoleDAO getOrderDAO() {

		return null; // new MySqlUserRoleDAO();
	}



	@Override
	public RoleDAO getRoleDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserRoleDAO getUserRoleDAO() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
