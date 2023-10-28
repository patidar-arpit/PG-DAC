package local;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CommonElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  sc =new Scanner(System.in);
		
		int [] arr = {1,3,4,6,7,9};
		int [] brr = {1,2,4,5,9,10};
		
//		System.out.println(Arrays.toString(commonE(arr,brr)));
		Set<Integer> set = new HashSet<Integer>();
		for(int i: arr)
			set.add(i);
		for(int i: brr)
			if(!set.add(i))
				System.out.print(i);

	}

	private static int[] commonE(int[] arr, int[] brr) {
		// TODO Auto-generated method stub
		HashMap<Integer, Integer> map  =new HashMap<>();
		int [] res = new int[arr.length+brr.length];
		int k =0;
		for(int i:arr) {
			if(map.containsKey(i))
				 map.put(i, map.get(i)+1);
			else
				map.put(i, 1);	
			
		}
		
		for(int i :brr) {
			if(map.containsKey(i))
				res[k++] = i;
		}
		
		return res;
	}

}
