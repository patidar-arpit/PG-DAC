package recursion;

import java.util.ArrayList;

public class FindIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  int [] arr = {10,30,5,5,10,5};
	  int target  = 10;
	  ArrayList<Integer> l1  = new ArrayList<Integer>();
	  System.out.println(allIndex(arr,0,target,l1));

	}

	private static ArrayList<Integer> allIndex(int[] arr, int i, int target, ArrayList<Integer> l1) {
		// TODO Auto-generated method stub
		if(i==arr.length) {
			if(l1.isEmpty()) {
				l1.add(-1);  //return -1 if the list is empty means means that thier is no such element
			}
			return l1;
		}
			
		
		if(arr[i] == target)
			l1.add(i);
		
		return allIndex(arr, i+1, target,l1);
	}

}
