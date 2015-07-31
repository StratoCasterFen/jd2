/**
 * 
 */
package by.academy;

/**
 * @author pavel
 *
 */
public abstract class DAOFactory {

	  // ������ ����� DAO, �������������� �����������
	  public static final int MYSQl = 1;
/*	  public static final int ORACLE = 2;
	  public static final int SYBASE = 3;
	  ...*/

	  // ����� ����� ����� ��� ������� DAO, ������� ����� ����
	  // ������. ������������� ��� ������
	  // ������ ���������� ����������.
	  public abstract UserDAO getUserDAO();
	  public abstract RoleDAO getRoleDAO();
	  public abstract UserRoleDAO getUserRoleDAO();
	 // ...

	  public static DAOFactory getDAOFactory(int whichFactory) {
	  
	    switch (whichFactory) {
	      case MYSQl: 
	          return new MySqlDAOFactory();
/*	      case ORACLE    : 
	          return new OracleDAOFactory();      
	      case SYBASE    : 
	          return new SybaseDAOFactory();
	      ...*/
	      default           : 
	          return null;
	    }
	  }
}
