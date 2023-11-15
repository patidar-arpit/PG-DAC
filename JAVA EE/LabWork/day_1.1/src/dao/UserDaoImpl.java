package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import pojos.User;
import utils.DBUtils;

public class UserDaoImpl implements UserDao{
	
   private static Connection cn;
   private static PreparedStatement pst;
	
	public UserDaoImpl() throws SQLException {
		// TODO Auto-generated constructor stub
		
		cn = DBUtils.openConnection();
		
			
		
	}

	@Override
	public List<User> getUserByRole(String role) throws SQLException {
		// TODO Auto-generated method stub
		pst = cn.prepareStatement("Select * from users where role = ?");
		pst.setString(1, role);
		List<User> ans = new ArrayList<User>();
		
		ResultSet rst = pst.executeQuery();
		
		while(rst.next()) {
			ans.add(new User(rst.getString(2)));
		}
		
		return ans;
	}

	public User validateUser(String email, String pass) throws SQLException {
	
		pst = cn.prepareStatement("Select * from users where email = ? and password =?");
		pst.setString(1, email); // this method set the email at first ? (wildcard)
		pst.setString(2, pass); //  -----------------------------Second ? (wildcard)
		
		ResultSet rst = pst.executeQuery();
		
	    if(rst.next()) {
	    	return new User(rst.getInt(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5),rst.getDate(6),rst.getBoolean(7),rst.getString(8));
	    }
	    
		return null;
	}

	

}
