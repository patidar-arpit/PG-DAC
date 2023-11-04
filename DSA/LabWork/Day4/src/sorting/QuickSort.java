package sorting;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int  [] arr= {1,2,3,4,5};
         
         quickSort(arr,0,arr.length-1);
         System.out.println(Arrays.toString(arr));
         
	}
     
   public static void quickSort(int[] input,int s, int endIndex) {
		
		if(s < endIndex)
		 {
			 int pivot = partiton(input,s,endIndex);
			 quickSort(input,s,pivot-1);
			 quickSort(input,pivot+1,endIndex);
		 }
		 
		
	}

	public static  int partiton(int [] arr,int startIndex,int endIndex){

        int pivot = arr[startIndex];

		int count = 0;
		for(int i = startIndex+1;i<=endIndex;i++){
			if(arr[i]<=pivot)
			     count++;
		}

		int pivotIndex = startIndex+count;

		int temp = arr[startIndex];
		arr[startIndex] = arr[pivotIndex];
		arr[pivotIndex] = temp;


		int i = startIndex;
		int j = endIndex;

		while(i<pivotIndex && j>pivotIndex){
             while(arr[i] <= pivot)
			    i++;

			 while(arr[j] >pivot)
			   j++;

			if(i<pivotIndex && j>pivotIndex){
				int temp1 = arr[i];
				arr[i] = arr[j];
				arr[j] = temp1;
			}

		}

		return pivotIndex;


	}
	
	
}
