package recursion;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int no =  3;
		
		int res= fact(no);
		
		System.out.println(res);

	}

	private static int fact(int no) {
		// TODO Auto-generated method stub
		if(no == 0)
			return 1;
		if(no == 1)
			return 1;
		
		return no*fact(no-1);
	}

}
