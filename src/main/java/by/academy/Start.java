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
		// Создать DAO
		UserDAO userDAO =  mysqlDaoFactory.getUserDAO();
		System.out.println(mysqlDaoFactory);	
		// создать нового клиента 
		int newUserId = userDAO.insertUser();
	}

}
