package recursion;

public class palindrome1 {
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int no = 12321  ;
          System.out.println(palindrome(no,0,no));
	}

	private static boolean  palindrome(int no, int newNo,int copiedNo) {
		// TODO Auto-generated method stub
		if(newNo == copiedNo)
			return true;
		if(no == 0)
			 return false;
		
		
		int temp = no%10;
		newNo = newNo *10+temp;
		
		return palindrome(no/10, newNo,copiedNo);
		
	
	}
}
