package utils;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import com.app.core.*;

import custom_exception.CustomerException;

public class CustomerUtils {
	
	
	public static void authenticateUser(String email,String password,List<Customer> customList )throws CustomerException {
		
		  Customer c =new  Customer(email);
		  int i = customList.indexOf(c);
		  
		  if(i==-1)
			    throw new CustomerException("Email does not exist");
		  
		  c= customList.get(i);
		  if(!c.getPassword().equals(password))
			  
			    throw new CustomerException("Password does not Match");
	  
		  
		  System.out.println("LOGGED IN..!");
		  
		
	}
	
	public static void changePassword(String email,String oldPass,String newPass,List<Customer> customList) throws CustomerException {
		  

		  Customer c =new  Customer(email);
		  int i = customList.indexOf(c);
		  
		  if(i==-1)
			    throw new CustomerException("Email does not exist");
		  
		  c= customList.get(i);
		  if(!c.getPassword().equals(oldPass))
			  
			    throw new CustomerException("Password does not Match");
	      
		  c.setPassword(newPass);
		  System.out.println("Password Updated..!");	
	}
	public static void removeCustomer(String email,List<Customer> customList) throws CustomerException {
		  Customer c =new  Customer(email);
		  int i = customList.indexOf(c);
		  
		  if(i==-1)
			    throw new CustomerException("Email does not exist");
		  
		  System.out.println(customList.remove(i));
		  System.out.println("Customer Removed/Unscribed.!");
		  
	}

	public static void displayAllCustomer(List<Customer> customList) {
            
		for(Customer c : customList) {
			System.out.println(c);
		}
	}

	public static List<Customer> sampleData() {
		// TODO Auto-generated method stub
		
	    List<Customer> cl = new ArrayList<Customer>();
	    cl.add(new Customer("Bittu","arpit@123","arpit200",10000,LocalDate.parse("2023-10-10"),ServicePlan.GOLD,LocalDate.parse("2023-01-10")));
	    cl.add(new Customer("Arpit","bittu@123","bittu200",3000,LocalDate.parse("2023-10-10"),ServicePlan.GOLD,LocalDate.parse("2023-07-10")));
	    cl.add(new Customer("ABCD","ABCD@123","ABCD200",5000,LocalDate.parse("2005-10-09"),ServicePlan.DIAMOND,LocalDate.parse("2022-10-10")));
	    cl.add(new Customer("pqr","pqrpit@123","pqr200",15000,LocalDate.parse("2010-07-10"),ServicePlan.GOLD,LocalDate.parse("2023-10-10")));

		return cl;
	}

	public static void RemoveWithPlan(String next, List<Customer> customList) {
		 
	   ServicePlan  p1 = ServicePlan.valueOf(next);
	   
//	   for(Customer c :customList) {
//		    if(c.getPlan() == p1) {
////		    	int index = customList.indexOf(c);
//		    	System.out.println(customList.remove(c));
//		    }
//	   }
	   
	   Iterator<Customer> itr = customList.iterator();
	   
	   while(itr.hasNext()) {
		   if(itr.next().getPlan() == p1 ) {
			   itr.remove();
			   System.out.println("Removed..!");
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
