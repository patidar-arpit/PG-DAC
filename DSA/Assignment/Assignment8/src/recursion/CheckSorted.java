package recursion;

public class CheckSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1};
		System.out.println(checkSorted(arr,0,1));

	}

	private static boolean checkSorted(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		if(i==arr.length-1&& j==arr.length)
			return true;
		
		if(arr[i] > arr[j])
			return false;
		
		return checkSorted(arr, i+1, j+1);
	}

}
