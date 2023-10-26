package utils;

import java.time.LocalDate;

import com.core.*;

public class ValidateInputs {
	public static Brand validateBrand(String brand) {
		
		return Brand.valueOf(brand);
	}

	public static Pen validate(String next, String next2, String next3, String next4, String next5, int nextInt) {
		
		//brand,color,inkcolor,material,listing date,price
		Brand b1 = validateBrand(next);
		Color c1 = validateColor(next2);
		LocalDate d1 = LocalDate.parse(next5);
		
		
		
		return new Pen(b1, c1, next3, next4, d1, nextInt) ;
		
	}

	private static Color validateColor(String next2) {
		// TODO Auto-generated method stub
		
		return Color.valueOf(next2);
	}

}
