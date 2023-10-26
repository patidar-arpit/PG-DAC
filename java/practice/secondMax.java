import java.util.Arrays;

public class secondMax {
    public static void main(String[] args) {
        int arr[]={1,2,3,5,5,4};
        Arrays.sort(arr);
        // System.out.print(Arrays.toString(arr));
        for(int i=arr.length-1;i>0;i--){
            if(arr[i]!=arr[i-1]){
                System.out.print(arr[i-1]);
                break;
            }        
        }
    }
}
