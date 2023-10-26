package tester;

import java.util.Scanner;
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
              List <Customer> customList = CustomerUtils.sampleData();
              
              while(true) {
            	  
            	   System.out.println("1.Sign up (customer registration)");
            	   System.out.println("2.Sign in (login)");
            	   System.out.println("3.(change password)");
            	   System.out.println("4.(un suscribe customer )");
            	   System.out.println("5.(Display all customer)");
            	  // System.out.println("6.(Creating Sample Data)");
            	   System.out.println("7.(Remove All Customer with Specific Plan )");
            	   System.out.println("8.(Sort the Customer As Per emailId(using Natural Sorting )");
            	   System.out.println("9.(Sort the Customer As Per Price(using Custom Sorting ))");
            	   System.out.println("10.(Sort the Customer As Per dov and Name(using Custom Sorting ))");
            	   System.out.println("11.Remove the all customers Whose sub is pending from Last 6 months");

            	   System.out.println("0.Exit");
            	   
            	   System.out.println("Enter choice:");

                   try {
                	   
   					    switch (sc.nextInt()) {

			   					case 1:
			
			   						System.out.println("Enter details of the customer (fullName,email,pass,registAmount,dob,plan,RegistrationDate)");
			   						Customer c1 = validateAllInput(sc.next(), sc.next(), sc.next(),
			   								sc.nextDouble(), sc.next(), sc.next(), sc.next(),customList);
			   						customList.add(c1);
			   						System.out.println("Customer Added.!");
			   						break;
			
			   					case 2:
			
			   						System.out.println("Enter Email and Password");
			   						CustomerUtils.authenticateUser(sc.next(), sc.next(), customList);
			   						break;
			   					
			   					case 3:
			   						
			   						System.out.println("Enter email id,oldpassword,newpassword");
			   						CustomerUtils.changePassword(sc.next(),sc.next(),sc.next(),customList);
			   						break;
			   						
			   					case 4:
			   						 
			   						System.out.println("Enter the customer email to be removed:");
			   						CustomerUtils.removeCustomer(sc.next(),customList);
			   					    break;
			   					     
			   					case 5:
			   						  CustomerUtils.displayAllCustomer(customList);
			                          break;
			   					
			   					
//			   					case 6:
//			   						  customList = CustomerUtils.sampleData();
//			   						  break;
//			   						  
			   					
			   					case 7:
			   						  System.out.println("Enter the plam");
			   						  CustomerUtils.RemoveWithPlan(sc.next(),customList);
			   						  break;
			   						  
			   					case 8:
			   						
			   						Collections.sort(customList); //will aoto call the compareTo() method
			   						 
			   						break;
			   						
			   					case 9:
			   						Comparator<Customer> rac = new RegAmountComparator();
			   						Collections.sort(customList ,rac);
			   						break;
			   						
			   					case 10:
			   						Collections.sort(customList, new DobNameCompartor());
			   						break;
			   						
			   					case 11:
			   						CustomerUtils.removeCustomer_6(customList);
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

