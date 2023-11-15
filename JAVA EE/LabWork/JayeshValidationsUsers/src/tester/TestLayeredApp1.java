package tester;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

import dao.UserDaoImpl;
import pojos.User;

public class TestLayeredApp1 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// create dao instance
			UserDaoImpl dao = new UserDaoImpl();
//			System.out.println("Enter role begin n end date");
//			//tester  --> Dao's method
//			List<User> users = dao.getSelectedUsers(sc.next(),
//					Date.valueOf(sc.next()),Date.valueOf(sc.next()));
//			System.out.println("Selected Users ");
//			users.forEach(System.out::println);
			
			System.out.print("Enter email and password: ");
			System.out.println(dao.validateUser(sc.next(), sc.next()));
			
			//clean up
			dao.cleanUp();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
