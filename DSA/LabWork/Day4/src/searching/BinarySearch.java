package searching;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int  [] arr = {10,10,10,20,20,20,40,50,50,70};
		
		System.out.println(binarySearch(arr,70));

	}

	private static int binarySearch(int[] arr,int target) {
		// TODO Auto-generated method stub
		int low = 0;
		int high = arr.length -1; 
		
		while(low <= high) {     // if we write low < high // then for 70 it gives -1 because it mot checks if low and high = 7
			int mid  = (low+high)/2;
			
			if(arr[mid] == target )
				return mid;
			else if(arr[mid] < target)
				low = mid+1;
			else
				high = mid-1;
		}
		return -1;
	}

}
