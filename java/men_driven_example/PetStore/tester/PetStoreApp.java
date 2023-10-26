package tester;

import java.util.HashMap;
import java.util.Scanner;

import com.core.Category;
import com.core.Order;
import com.core.Pet;

import custom_exception.MyException;
import utils.Helper;

public class PetStoreApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, Pet> petMap= Helper.sampleDataOfPet();
		HashMap<Integer, Order> orderMap= Helper.sampleDataofOrder();
		Integer adminFlag=0;
        Integer customerFlag=0;
		
		 

		try (Scanner sc = new Scanner(System.in)) {

			while (true) {
				System.out.println("1.LOGIN.!");
				System.out.println("2.ADD NEW PET");
				System.out.println("3.UPDATE PET DETAILS");
				System.out.println("4. Display all AVAILABLE PETS");
				System.out.println("5.ORDER A PET");
				System.out.println("6.CHECK ORDER STATUS BY ORDER ID:");
				System.out.println("7.UPDATE ORER STATUS");
				System.err.println("0.EXIT");



				System.out.println("Enter choice");

				try {
					switch (sc.nextInt()) {

					case 1:
                        
						System.out.println("Enter the emailId and Password:");
						int i=Helper.authenticateUser(sc.next(),sc.next());
						if(i==1)
							 adminFlag=1;
						if(i==0)
							customerFlag=1;
						
						break;

					case 2:
						if(adminFlag!=1) {
							
							throw new MyException("Please Admin Login First");

						}
						
						System.out.println("Enter details of Pet:( petId, name, category, unitPrice, stocks)");
						int petId = sc.nextInt();
						petMap.put(petId, new Pet(petId,sc.next(),Category.valueOf(sc.next()),sc.nextInt(),sc.nextInt()));
						System.err.println("Pet Added");
						
						break;

					case 3:
						if(adminFlag !=1) {
							throw new MyException("Please Admin Login First");

						}
						System.out.println("Enter PetId:");
						Helper.updatePetDetails(petMap,sc.nextInt());
						break;

					case 4:
                        if(adminFlag!=1 || customerFlag!=1)
                        	throw new MyException("Please Logged IN first");
                        
                        petMap.values()
						.stream()
						.filter(pet->pet.getStocks()>0)
						.forEach(pet->System.out.println(pet));
						
						break;

					case 5:
						if(adminFlag!=1 || customerFlag!=1)
                        	throw new MyException("Please Logged IN first");
                        
						System.out.println("Enter the petId of pet Which you want to order and quantity");
						Order o1=Helper.orderPet(sc.nextInt(),sc.nextInt(),petMap);
						orderMap.put(o1.getOrderId(), o1);
						System.out.println("Order Done..!!");
						
						break;
						
					case 6:
						if(adminFlag!=1 || customerFlag!=1)
                        	throw new MyException("Please Logged IN first");

						System.out.println("Enter orderId");
						Helper.CheckStatus(sc.nextInt(),orderMap);
						System.out.println("Checked..!");
					    break;
						 
					case 7:
						
						if(adminFlag!=1)
                        	throw new MyException("Please Logged IN first");
                       
						System.out.println("Enter orderId");
						Helper.updateStatus(orderMap,sc.nextInt());
						System.out.println("Updated..!");
					
					case 0:
						System.exit(0);
						
					default:
						System.out.println("Invalid Choice:");
						break;
					}

				} catch (Exception e) {
					System.err.println(e.getMessage());
				}
			}

		} catch (Exception e) {

		}

	}

}
