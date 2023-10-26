package custom_ordering;

import java.util.Comparator;

import com.app.core.*;

public class DobNameCompartor implements Comparator<Customer>{
	
	@Override
	
	public int compare(Customer c1,Customer c2) {
		
		int i = c1.getDob().compareTo(c2.getDob());
		if(i==0) {
			return c1.getFullName().compareTo(c2.getFullName());
		}
		
		return i;
		
	}

}
