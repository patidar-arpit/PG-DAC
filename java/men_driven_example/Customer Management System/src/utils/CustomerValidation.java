package utils;

import java.time.LocalDate;

import custom_exception.*;

import java.util.*;
import com.app.core.*;

import com.app.core.ServicePlan;

public class CustomerValidation {
	
	
	public static void  checkDupCustomer(String email,List<Customer> customList)throws CustomerException {
		 Customer temp = new Customer(email);
		 if(customList.contains(temp)) {
			 throw new CustomerException("Email Already Exists..!");
			 
		 }
		 
		 
		
	}
	
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
	
   public static Customer validateAllInput(String fullName, String email, String password, double registrationAmount, String dob,String plan,List<Customer> customList) throws CustomerException {
		 
		 Customer c ;
		 
		 checkDupCustomer(email,customList);
		 ServicePlan p = validatePlan(plan);         
		 validateRegistrationAmount(registrationAmount,p);
		 LocalDate d = LocalDate.parse(dob);
		 
		 c = new Customer(fullName,email,password,registrationAmount,d,p);
		 
		 return c;
	 }

}
