package local;

import java.io.*;
import java.util.*;

public class HackerTest {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        HashMap<String,Integer> map = new HashMap<>();
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int testCases = n;
        while(testCases>0){
            
             String s = sc.nextLine();
             sc.nextLine();
             int no = sc.nextInt();
             map.put(s,no);
             testCases--;
        }
        
        for(int i =0;i<n;i++){
            String s =sc.nextLine();
             if(map.containsKey(s))
                System.out.println(s+"="+map.get(s));
             else
                System.out.println("Not found");
        }
        
        
        
    }
}
