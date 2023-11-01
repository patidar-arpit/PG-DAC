package recursion;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int res = power(10,2);
		System.out.println(res);

	}

	private static int power(int base, int power) {
		// TODO Auto-generated method stub
		
		if(power == 0)
			return  1;
		
		return base*power(base,power-1);
	}

}
