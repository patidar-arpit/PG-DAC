package tester;

import java.util.HashMap;
import java.util.Scanner;

import com.core.Pen;

import utils.PenUtils;
import utils.Validate;

public class PenManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, Pen> map =PenUtils.sampleData();
		
		try (Scanner scanner = new Scanner(System.in)){
			
			while(true) {
				   System.out.println("1.Add a new Pen");
				   System.out.println("2.Update stock of a Pen");
				   System.out.println("3.Set discount of 20% for all pen which are not sold in last three months");
				   System.out.println("4.Remove pens which are nver sold once listed in 9months");
				   System.out.println("5.Exit.");
				   
				   System.out.println("Enter the choice:");
				
				try {
					
					switch (scanner.nextInt()) {
					
					case 1:
						 
				        System.out.println("Enter the details of pen to be added(brand,color,inkcolor,material,listing date,price");
						Pen p  = Validate.validate(scanner.next(),scanner.next(),scanner.next(),scanner.next(),scanner.next(),scanner.nextInt());
						map.put(p.getID(), p);
						System.out.println("Pen Added");
						break;
						
					case 2:
						
						System.out.println("Enter the id of pen and Date to update stock  :");
						PenUtils.updatePen(scanner.nextInt(),scanner.next(),map);
						System.out.println("Pen stock updated..!");
						break;
						
					case 3:
						PenUtils.applyDiscount(map);
						System.out.println("Discount Applied");
						break;
						
					case 4:
						PenUtils.removePen(map);
						break;
						
					case 5:
						PenUtils.display(map);
						break;
					case 6:
						System.exit(0);
						break;

					

					default:
						break;
					}
				  
				   
				}
				catch (Exception e) {
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
				
			}
			
		}
		
		
		

	}

}
