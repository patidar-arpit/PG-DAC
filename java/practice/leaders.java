import java.util.ArrayList;

public class leaders {
    
    public static void main(String[] args) {
        int [] arr= {16,17,4,3,5,2};
        findLeaders(arr);        
    }

    public static void findLeaders(int arr[]){
        // Your code here
        int flag=0;
        for(int i=0;i<arr.length-1;i++){
           for(int j=i+1;j<arr.length;j++){
               if(arr[i]>arr[j])
                    continue;
               else{
                   flag=1;
                   break;
               }
           }
           if(flag==0){
            System.out.print(arr[i]+" ");
           }
        
        }
        System.out.println(arr[arr.length-1]);
    }
}