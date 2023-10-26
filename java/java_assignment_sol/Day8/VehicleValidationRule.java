package assignment;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class VehicleValidationRule {
	static int MAX_SPEED;
	static int MIN_SPEED;
	static SimpleDateFormat sdf;
	static String currentDate = "13-10-2023";
	
	static {
	   MAX_SPEED = 80;
	   MIN_SPEED = 20;
	   sdf = new SimpleDateFormat("dd-MM-yyyy");
	}
	
	public static void checkSpeed(int s) throws SpeedOutOfRangeException {
		if(s>MAX_SPEED)
			throw new SpeedOutOfRangeException("Speed to much High");
		if(s<MIN_SPEED)
			throw new SpeedOutOfRangeException("Speed to much Low");
		
		else {
			System.out.println("Speed In Range");
		}
		
	}
	
	public static void checkLicenseDate(String s) throws ParseException,SpeedOutOfRangeException{
		Date expiryDate = sdf.parse(s);
		System.out.println("Test");
		Date TodayDate = sdf.parse(currentDate);
		
		if (expiryDate.before(TodayDate)) {
			throw  new SpeedOutOfRangeException(" your Liscense Expired");
		}
		else {
			throw new SpeedOutOfRangeException("Liscense is not expired");
		}
		
		
	}

}
