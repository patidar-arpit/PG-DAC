package utils;

import java.util.HashMap;

import com.core.Cricketer;

import custom_exception.CricketException;

public class CricketerUtils {

	public static HashMap<String, Cricketer> sampleData() {
		// TODO Auto-generated method stub
//String name,int age,String email_id,String Phone,int rating
		
		HashMap<String,Cricketer> map= new HashMap();
		
		map.put("arpit@123",new Cricketer("arpit", 23, "arpit@123", "9009395852", 5));
		map.put("bittu@123",new Cricketer("bittu", 25, "bittu@123", "9977400766", 4));
		map.put("jayesh@123",new Cricketer("jayesh", 20, "jayesh@123", "993939339", 5));
		map.put("xyz@123",new Cricketer("xyz", 23, "xyz@123", "3838383838", 9));
		map.put("ali@123",new Cricketer("ali", 28, "ali@123", "9009395852", 10));
		

		return map;
	}

	public static void modifyRating(String email, HashMap<String, Cricketer> map) throws CricketException {
		// TODO Auto-generated method stub
		Cricketer cricketer = map.get(email);
		if(cricketer == null)
			throw new CricketException("Email does not exist");
		
		cricketer.setRating(10);
		
	}

	

}
