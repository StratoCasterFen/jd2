/**
 * 
 */
package by.academy;

/**
 * @author pavel
 *
 */
public abstract class DAOFactory {

	  // Список типов DAO, поддерживаемых генератором
	  public static final int MYSQl = 1;
/*	  public static final int ORACLE = 2;
	  public static final int SYBASE = 3;
	  ...*/

	  // Здесь будет метод для каждого DAO, который может быть
	  // создан. Реализовывать эти методы
	  // должны конкретные генераторы.
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
