package sorting;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [] arr = {0,5,6,9,8,9,0};
        
        int [] newArr = mergeSort(arr);
        System.out.println(Arrays.toString(newArr));
	}

	private static int[] mergeSort(int[] arr) {
		// TODO Auto-generated method stub
		
		if(arr.length ==1)
			return arr;      /// this implies array contain only one element this => array is sorted                 s 
		int mid = arr.length/2;
		int [] left = mergeSort(Arrays.copyOfRange(arr, 0,mid ));
		int [] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
	    
		int [] res = merge(left,right);
		
		return res;
	}

	private static int[] merge(int[] left, int[] right) {
		// TODO Auto-generated method stub
		int []  mergedArray = new int[left.length+right.length];
		int i=0 ,j=0,k=0;
		
		while(i< left.length && j<left.length) {
			
			if(left[i]<right[j]) {
				mergedArray[k++] = left[i++];
			}
			
			else {
				mergedArray[k++] = right[j++];
			}
		}
		
		while(i<left.length) {
			mergedArray[k++] = left[i++];
		}
		while(j<right.length) {
			mergedArray[k++] = right[j++];
		}
		
		return mergedArray;
		
	}

}
