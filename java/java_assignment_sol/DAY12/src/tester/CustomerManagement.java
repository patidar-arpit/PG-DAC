package tester;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import com.app.core.*;

import custom_ordering.DobNameCompartor;
import custom_ordering.RegAmountComparator;
import utils.CustomerUtils;
import utils.CustomerValidation;

import static utils.CustomerValidation.*;
import utils.*;

import utils.CustomerValidation;
public class CustomerManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        try(Scanner sc =new Scanner(System.in)) {
              //List <Customer> customList = CustomerUtils.sampleData();
        	
        	  Map<String,Customer> mp =CustomerUtils.sampleData();
              
              while(true) {
            	  
            	   System.out.println("1.Sign up (customer registration)");
            	   System.out.println("2.Sign in (login)");
            	   System.out.println("3.(change password)");
            	   System.out.println("4.(un suscribe customer )");
            	   System.out.println("5.(Display all customer)");
            	  // System.out.println("6.(Creating Sample Data)");
            	   System.out.println("7.(Remove All Customer with Specific Plan )");
            	   System.out.println("8.(Sort the Customer As Per emailId");
            	   System.out.println("9.(Sort the Customer As Per amount");

            	   System.out.println("0.Exit");
            	   
            	   System.out.println("Enter choice:");

                   try {
                	   
   					    switch (sc.nextInt()) {

			   					case 1:
			   						
			   						
			   						
			   						System.out.println("Enter the email id:");
			   						String email = CustomerValidation.validateEmail(mp,sc.next());
			   						
			   						System.out.println("Enter details of the customer (fullName,pass,registAmount,dob,plan,RegistrationDate)");
			   						Customer c1 = validateAllInput(sc.next(),email,sc.next(),
			   								sc.nextDouble(), sc.next(), sc.next(), sc.next(),mp);
			   						
			   						mp.put(email, c1);
			   						System.out.println("Customer Added.!");
			   						break;
			
			   					case 2:
			
			   						System.out.println("Enter Email and Password");
			   						CustomerUtils.authenticateUser(sc.next(), sc.next(), mp);
			   						break;
			   					
			   					case 3:
			   						
			   						System.out.println("Enter email id,oldpassword,newpassword");
			   						CustomerUtils.changePassword(sc.next(),sc.next(),sc.next(),mp);
			   						break;
			   						
			   					case 4:
			   						 
			   						System.out.println("Enter the customer email to be removed:");
			   						CustomerUtils.removeCustomer(sc.next(),mp);
			   					    break;
			   					     
			   					case 5:
			   						  CustomerUtils.displayAllCustomer(mp);
			                                                  break;
			   					
			   					
       			   		        
       			   		        	    
       			   		        	
//			   					
			   					case 7:
			   						  System.out.println("Enter the plam");
			   						  CustomerUtils.RemoveWithPlan(sc.next(),mp);
			   						  break;
			   						  
			   					case 8:
			   						
                                      					 TreeMap<String, Customer> tm = new TreeMap<String, Customer>(mp);
                                       					CustomerUtils.displayAllCustomer(tm);
			   						 
			   						  break;
//			   						
			   					case 9:
//			   						Comparator<Customer> rac = new RegAmountComparator();
//			   						mp = new TreeMap<String, Customer>(rac);
			   						ArrayList<Customer> arr = new ArrayList<Customer>();
			   						for(Map.Entry<String, Customer> m : mp.entrySet())
			   						{
			   							arr.add(m.getValue());
			   						}
			   						Collections.sort(arr, new RegAmountComparator());
			   						System.out.println(arr);
  						                     
			   						
			   				         	break;
			   					
			   					case 0:
			   						 System.exit(0);
			   			}	
				}
                   
                catch (Exception e) {
					// TODO: handle exception
					System.out.println(e);
					e.printStackTrace();
				}	  
            	  
              }
        	  
        }
        
        catch(Exception e) {
        	System.out.println("Something Wrong:");
        }
	}

}

