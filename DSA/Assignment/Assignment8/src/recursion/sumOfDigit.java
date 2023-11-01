package recursion;

public class sumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int no = 22000;
		
		int res = sum(no);
		System.out.println(res);
		
		

	}

	private static int sum(int n) {
		// TODO Auto-generated method stub
		
		if(n==0)
			return 0;
			
	    return   n%10 + sum(n/10);
	}

}
