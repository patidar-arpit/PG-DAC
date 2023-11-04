package sorting;

import java.util.Arrays;

public class MergeSort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [] arr = {9,8,7,0,9,6,1};
        
         mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
	}

	private static void mergeSort(int[] arr,int low,int high) {
		// TODO Auto-generated method stub
		
		if(low<high) {
			
			int mid = (low +high)/2;
			
			mergeSort(arr, low, mid);
			mergeSort(arr, mid+1, high);
			merge(arr,low,mid,high);
		}
       
	}

	private static void  merge(int[] arr, int low ,int mid,int high) {
		// TODO Auto-generated method stub
		
		int i = low;
		int j = mid+1;
		int k = low;
		int [] brr = new int [arr.length];
		
		while(i<=mid && j<=high) {
			
			if(arr[i]<arr[j]) {
				brr[k++] = arr[i++];
			}
			
			else {
				brr[k++] = arr[j++];
			}
		}
		
		if(i>mid) {
			 while(j<=high) {
				 brr[k++] = arr[j++];
			 }
		}
		else {
			while(i<=mid) {
				brr[k++] = arr[i++];
			}
		}
		
		for(k=low;k<=high;k++) {
			arr[k] = brr[k];
		}
		
	}

}
