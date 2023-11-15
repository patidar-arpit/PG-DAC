package tester;

import java.sql.SQLException;
import java.util.Scanner;

import dao.UserDaoImpl;

public class TestUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  try(Scanner sc = new Scanner(System.in)){
		  
		  UserDaoImpl usd = new UserDaoImpl();
		 // System.out.println(usd.getUserByRole(sc.next()));
		  System.out.println(usd.validateUser(sc.next(),sc.next()));
		  
	  } catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		

	}

}
