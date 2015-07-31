package by.academy;

import java.util.Collection;

import javax.sql.RowSet;

public interface RoleDAO {
	
	public int insertRole();

	public boolean deleteRole();

	public Role findRole();

	public boolean updateRole();

	public RowSet selectRoleRS();

	public Collection selectRoleTO();
}
