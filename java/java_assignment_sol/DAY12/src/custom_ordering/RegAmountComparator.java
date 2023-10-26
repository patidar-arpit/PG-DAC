package custom_ordering;

import java.util.Comparator;

import com.app.core.Customer;

public class RegAmountComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		// TODO Auto-generated method stub
		
		if(o1.getRegistrationAmount() < o2.getRegistrationAmount()) {
			return 1;
		}
		if(o1.getRegistrationAmount() > o2.getRegistrationAmount()) {
			return -1;
		}
		return 0;
			
	}
	
	

}
