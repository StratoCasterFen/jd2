/**
 * 
 */
package by.academy;

/**
 * @author pavel
 *
 */
public class Start {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		DAOFactory mysqlDaoFactory = DAOFactory.getDAOFactory(DAOFactory.MYSQl);
		// ������� DAO
		UserDAO userDAO =  mysqlDaoFactory.getUserDAO();
		System.out.println(mysqlDaoFactory);	
		// ������� ������ ������� 
		int newUserId = userDAO.insertUser();
	}

}
