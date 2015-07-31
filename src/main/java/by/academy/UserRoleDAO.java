package by.academy;

import java.util.Collection;

import javax.sql.RowSet;

public interface UserRoleDAO {
	public int insertUserRole();

	public boolean deleteUserRole();

	public UserRole findUserRole();

	public boolean updateUserRole();

	public RowSet selectUserRoleRS();

	public Collection selectUserRoleTO();
}
