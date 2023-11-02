package recursion;

public class ReverseNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int no = 12345;
          System.out.println(reverse(no,0));
	}

	private static int  reverse(int no, int newNo) {
		// TODO Auto-generated method stub
		if(no == 0)
			 return newNo;
		
		int temp = no%10;
		newNo = newNo *10+temp;
		
		return reverse(no/10, newNo);
		
	
	}

}
