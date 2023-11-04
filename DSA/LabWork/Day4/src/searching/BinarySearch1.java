package searching;

public class BinarySearch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int arr[] = {10,20,30,40,50,100};
         
         System.out.println(binarySearch(arr,0,arr.length-1,5));
	}

	private static int binarySearch(int [] arr,int i, int j, int target) {
		// TODO Auto-generated method stub
		if( i>j)
			return -1;
		
		int mid = (i+j)/2;
		
		if(arr[mid] == target)
			return mid;
		else if(arr[mid] > target)
			return   binarySearch(arr, i, mid-1, target);
		
		else
			return  binarySearch(arr, mid+1, j, target);
		
		
	}

}
