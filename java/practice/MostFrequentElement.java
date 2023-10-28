package local;

import java.util.HashMap;
import java.util.Scanner;

public class MostFrequentElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		
		int [] arr = {1,3,1,3,2,1,};
		int max=0;
		int element = 0;
		
//		for(int i = 0;i<arr.length;i++) {
//			int count =0;
//			for(int j = i;j<arr.length;j++) {
//				if(arr[j]==arr[i]) {
//					count++;
//				}
//			}
//			if(count>max) {
//				max = count;
//				element = arr[i];
//			}
//		}
//		
//		System.out.println(element);
//		
		
		HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
		for(int i:arr) {
			if(map.containsKey(arr[i]))
				 map.put(arr[i], map.get(arr[i])+1);
			else
				map.put(arr[i], i);		
		}
		
		for(Integer i:map.values()) {
			int count = map.get(arr[i]);
			if(count>max) {
				max = count;
				element =arr[i];
			}
		}
		System.out.println(element);

	}

}
