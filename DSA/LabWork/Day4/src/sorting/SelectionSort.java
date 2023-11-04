package sorting;
import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {1,2,3,4,5,6};
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));

	}

	private static void selectionSort(int[] arr) {
		// TODO Auto-generated method stub
		for(int i = 0;i<arr.length;i++){
			 int minIndex = i;
		     for(int j = i+1;j<arr.length;j++) {
		    	 if(arr[j] < arr[minIndex]) {
		    		 minIndex = j;
		    	 }
		     }
		     
		     int temp = arr[i];
		     arr[i] = arr[minIndex];
		     arr[minIndex] = temp;
		}
		
	}

}
