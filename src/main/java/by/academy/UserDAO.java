/**
 * 
 */
package by.academy;

import java.util.Collection;

import javax.sql.RowSet;

/**
 * @author pavel
 *
 */
public interface UserDAO {
	
	public int insertUser();

	public boolean deleteUser();

	public User findUser();

	public boolean updateUser();

	public RowSet selectUserRS();

	public Collection selectUserTO();

}
