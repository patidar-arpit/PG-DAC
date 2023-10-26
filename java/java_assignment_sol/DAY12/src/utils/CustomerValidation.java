package utils;

import java.time.LocalDate;

import custom_exception.*;

import java.util.*;
import com.app.core.*;

public class CustomerValidation {
	
	

	
	public static ServicePlan validatePlan(String sp) throws CustomerException{
		 
        try {		
   		 ServicePlan newSp = ServicePlan.valueOf(sp.toUpperCase());
   	     return newSp;
        }
        catch(Exception e){
        	 throw new  CustomerException("Invalid Plan");
        }
		
	}
	
	public static void validateRegistrationAmount(double amount,ServicePlan sp)throws CustomerException {
		
		if(amount < sp.getCharges() ) {
		   throw new CustomerException("Insufficient Amount for the PLan.!");
		}
		
		System.out.println("get the plan.!!!");
	}
	
   public static Customer validateAllInput(String fullName, String email, String password, double registrationAmount, String dob,String plan,String lastSubDate,Map<String,Customer> mp) throws CustomerException {
		 
		 Customer c ;
		 ServicePlan p = validatePlan(plan);         
		 validateRegistrationAmount(registrationAmount,p);
		 LocalDate d = LocalDate.parse(dob);
		 LocalDate d1=LocalDate.parse(lastSubDate);
		 
		 
		 c = new Customer(fullName,email,password,registrationAmount,d,p,d1);
		 
		 return c;
	 }
   public static String validateEmail(Map<String, Customer> mp, String next)  throws CustomerException{
		// TODO Auto-generated method stub
		
	   if(mp.containsKey(next))
		    throw new CustomerException("Email Already Exists");
	   
	   return next;
	}

}
