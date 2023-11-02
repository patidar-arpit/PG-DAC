package recursion;

public class countOfZereos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n = 2340;
        System.out.println(countZero(n,0));
	}

	private static int  countZero(int n, int count) {
		// TODO Auto-generated method stub
		if(n==0)
			return count;
		if(n%10 ==0)
			count++;
		
		return countZero(n/10, count);
	}

}
