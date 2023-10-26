package utils;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import com.app.core.*;

import custom_exception.CustomerException;

public class CustomerUtils {
	
	
	public static void authenticateUser(String email,String password, Map<String, Customer> mp)throws CustomerException {
		
		 
		  if(CustomerValidation.validateEmail(mp, email).equals(email)) {
			  
			  if(mp.get(email).getPassword().equals(password))
				    System.out.println("Logged In..!");
			  else {
				  System.out.println("Password Does Not Match.!");
			  }
			  
		  }
		  
		  throw new CustomerException("Email not Exist");
	  
		
	}
	
	public static void changePassword(String email,String oldPass,String newPass,Map<String, Customer> mp) throws CustomerException {
		  
        if(!CustomerValidation.validateEmail(mp, email).equals(email)) {
        	throw new CustomerException("Email not found") ; 
        }
        Customer c = mp.get(email);
  	    c.setPassword(newPass);
        System.out.println("Password Changed..!");

		  
	}
	public static void removeCustomer(String email,Map<String, Customer> mp) throws CustomerException {
		
		if(!CustomerValidation.validateEmail(mp, email).equals(email)) {
        	throw new CustomerException("Email not found") ; 
        }
		 
	    System.out.println(mp.remove(email));
	    System.out.println("RemoveD Customer..!");
		 	  
		  
	}

	public static void displayAllCustomer(Map<String,Customer> mp) {
            
		for(Customer c : mp.values()) {
			System.out.println(c);
		}
		
		//System.out.println(mp); we dont write this beacause it produce the irrevalent output 
	}

	public static Map<String,Customer> sampleData() {
		
		
		Map<String,Customer> c1 = new HashMap<String, Customer>();
	    c1.put("arpit@123",new Customer("Bittu","arpit@123","arpit200",10000,LocalDate.parse("2023-10-10"),ServicePlan.GOLD,LocalDate.parse("2023-01-10")));
	    c1.put("bittu@123",new Customer("Arpit","bittu@123","bittu200",3000,LocalDate.parse("2023-10-10"),ServicePlan.GOLD,LocalDate.parse("2023-07-10")));
	    c1.put("ABCD@123",new Customer("aBCD","ABCD@123","ABCD200",5000,LocalDate.parse("2005-10-09"),ServicePlan.DIAMOND,LocalDate.parse("2022-10-10")));
	    c1.put("Pqrpit@123",new Customer("Pqr","Pqrpit@123","pqr200",15000,LocalDate.parse("2010-07-10"),ServicePlan.GOLD,LocalDate.parse("2023-10-10")));

		return c1;
	}

	public static void RemoveWithPlan(String next,Map<String,Customer> mp) {
		 
	   ServicePlan  p1 = ServicePlan.valueOf(next);
	   
	   for(Customer c:mp.values()) {
		   if(c.getPlan() == p1) {
			   mp.remove(c.getEmail()); // object removed on the basis of the email {PK}
			   System.out.println("Custormer Removed:"+c);
		   }
	   }
	   
       	
	}

	public static void removeCustomer_6(List<Customer> customList) {
		// TODO Auto-generated method stub
		
	//System.err.println(Period.between(LocalDate.parse("2023-04-01"), LocalDate.now()).getMonths());
		LocalDate today = LocalDate.now();
		Iterator<Customer> itr = customList.iterator();
		while(itr.hasNext()) {
			long  x =Period.between(itr.next().getLastSubDate(), today).toTotalMonths();
			if( x >= 6) {
				itr.remove();
			}
		}
	}


	

}
