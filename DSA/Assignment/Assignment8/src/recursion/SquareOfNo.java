package recursion;

public class SquareOfNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int a =10;
		 int res = square(a,a);
		 System.out.println(res);
		 
	}
	
	public static int square(int a,int b) {
		
		if(b==0)
			return 0;
	    
		return  a + square(a,b-1);
	}

}
