package assignment;

import java.text.ParseException;
import java.util.Scanner;

public class SpeedTestException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(Scanner sc =new Scanner(System.in)){
			System.out.println("Enter the speed of the car:");
			VehicleValidationRule.checkSpeed(sc.nextInt());
			System.out.println("Enter the expiry date of Liscense in (dd-MM-yyyy)");
			VehicleValidationRule.checkLicenseDate(sc.next());
			
		}
		catch(SpeedOutOfRangeException e) {
			System.out.println(e.getMessage());
			
		}
		catch(ParseException e) {
			System.out.println(e.getMessage());
		}

	}

}
