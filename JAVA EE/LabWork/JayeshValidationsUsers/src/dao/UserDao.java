package dao;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import customException.UserCustomException;
import pojos.User;

public interface UserDao {
//add a method to get user details under specific role n dob range
	List<User> getSelectedUsers(String role,Date begin,Date end)
			throws SQLException;
	
	User validateUser(String email,String password) throws SQLException,UserCustomException;
}
