package utils;
import custom_exception.SpeedOutOfRange; 

public class CheckValidations {
	
	final static int MAX_SPEED = 80;
	final static int MIN_SPEED = 40;
	
	public static void validateSpeed(int s) throws RuntimeException {
		
		if(s > MAX_SPEED ) {
			throw new SpeedOutOfRange("Spped to high");  // throwable object  means it is directly or indirectly inherited from throwable class
		}
		if( s < MIN_SPEED) {
			throw  new SpeedOutOfRange("Speed to much low..!");
		}
		System.out.println("Spped Fine");
	}
	

}
