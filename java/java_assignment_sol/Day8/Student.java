package assignment;

import java.text.ParseException;

public class Student extends Person {
	
	@Override
	void getDetails(){
		System.out.println("Just printing the details of the Student");
	    int a =10/0;
	    System.out.println(a);
	}

}
