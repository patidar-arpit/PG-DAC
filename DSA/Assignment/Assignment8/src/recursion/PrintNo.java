package recursion;

public class PrintNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5;
		printNo(n);

	}

	private static void printNo(int n) {
		// TODO Auto-generated method stub
		if(n==0)
			return;
		
		
		System.out.print(n + " ");
		printNo(n-1);
		
		System.out.print(n+ " ");
		
	}

}
