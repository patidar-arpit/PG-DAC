package sorting;
import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {10,4,3,15,5};
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));

	}

	private static void insertionSort(int[] arr) {
		// TODO Auto-generated method stub
		
	    for(int i = 1;i< arr.length;i++) {
	    	int x = arr[i];
	    	int j = i-1;
	    	while(j >=0 && arr[j] > x) {
	    		arr[j+1] =arr[j];
	    		j--;
	    	}
	    	arr[j+1] = x;
	    }
		
	}

}
