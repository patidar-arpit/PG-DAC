package recursion;

public class Palindrome {
	
	static int newNo;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int no = 12321;
        palindrome(no);
       
       if(newNo == no)
    	   System.out.println("True");
       else
    	   System.out.println("False");
       
	}

	private static void palindrome(int no) {
		// TODO Auto-generated method stub
		
		if(no ==0)
			return;
		
		int temp = no%10;
		newNo = newNo*10 +temp;
		
	     palindrome(no/10);
		
	}

}
