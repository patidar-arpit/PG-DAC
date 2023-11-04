package searching;

public class LinearSearch {

	public static void main(String[] args) {
         
		int  [] arr = {10,20,40,5,7,100};
		
		System.out.println(linearSearch(arr,200));
	}

	private static int  linearSearch(int[] arr, int target) {
		// TODO Auto-generated method stub
		int count= 0 ;
		for(int i = 0;i<arr.length;i++) {
			count++;
			if(arr[i] == target) {
				System.out.println("No of time loop executed:"+count);
				 return i;
			}
			
		}
		
		
		System.out.println("No of time loop executed:"+count);
		return -1;
	}

}
