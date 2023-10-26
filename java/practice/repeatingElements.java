import java.util.Arrays;

public class repeatingElements {
    public static void main(String[] args) {
        int [] arr={10,20,30,20,10,40,50,10,50,50,50,60};
        //printRepeating1(arr);
        printRepeating(arr);
    }
    private static void printRepeating1(int[] arr) {
        int [] visited=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int count=1;
            if(visited[i]==1)
               continue;
            
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    visited[j]=1;
                    count++;
                }
            }

            if(count!=1)
               System.out.println(arr[i]);
            
            
        }
       
    }
    public static void printRepeating(int [] arr){
        Arrays.sort(arr);
        int i=0;
        while(i<arr.length){
            int flag=0;
            while(i<arr.length-1 &&arr[i]==arr[i+1]){
                i++;
                flag=1;
                continue;        
            }
            if(flag==1)
                 System.out.println(arr[i]);
            i++;
        }
    }
    
}
