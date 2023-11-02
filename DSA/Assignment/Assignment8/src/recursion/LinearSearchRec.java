package recursion;

public class LinearSearchRec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {10,20,3,4,1};
		int target = 30;
		System.out.println(linearSearch(arr,0,target));

	}

	private static int linearSearch(int[] arr, int i, int target) {
		// TODO Auto-generated method stub
		if(i==arr.length)
			return -1;
		
		if(arr[i] == target)
			return i;
		
		return linearSearch(arr, i+1, target);
	}

}
