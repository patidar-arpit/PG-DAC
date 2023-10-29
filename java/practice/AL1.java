package local;

import java.io.*;
import java.util.*;

public class AL1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        List<ArrayList<Integer>> list = new ArrayList<>(t);
        while(t>0){
        	//System.out.println("Hello");
            int size = sc.nextInt();
            ArrayList<Integer> l1 = new ArrayList<Integer>(size);
            for(int i = 0;i<size;i++){
            	
                l1.add(sc.nextInt());
            }
            
            list.add(l1);
            t--;
        }
        System.out.println(list);
        int t1  = sc.nextInt();
        while(t1>0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            if(y>list.get(x-1).size())
                System.out.println("ERROR!");
            
            else{
               System.out.println(list.get(x-1).get(y-1)); 
            }
            t1--;
        }
    }
}
