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
public class MySqlUserDAO implements UserDAO {
	
	MySqlUserDAO() {
		
	}
		
	// ��������� ������ �� ������������� ����� ������������
  // MySqlDAOFactory.createConnection()
  // ��� ��������� ����������
	
	// ���������� ����� ���������� ������� ��� -1 ��� ������ 
	public int insertUser() {
		MySqlDAOFactory.createConnection();
		return 0;
	}

	// ���������� true ��� �������� ����������, false ��� ������
	public boolean deleteUser() {
		// TODO Auto-generated method stub
		return false;
	}

	// ���������� ������ Transfer Object ��� �������� ������, null ��� ������, ���� ������ �� ������.
	public User findUser() {
		// TODO Auto-generated method stub
		return null;
	}

	// ���������� true ��� �������� ����������, false ��� ������
	public boolean updateUser() {
		// TODO Auto-generated method stub
		return false;
	}

	 // ���������� RowSet.
	public RowSet selectUserRS() {
		// TODO Auto-generated method stub
		return null;
	}

	//����������� ������� ��������� �������� Transfer Object.
	public Collection selectUserTO() {
		// TODO Auto-generated method stub
		return null;
	}

}
