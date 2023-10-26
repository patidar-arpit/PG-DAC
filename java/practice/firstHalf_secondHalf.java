import java.util.Arrays;

public class firstHalf_secondHalf {
    public static void main(String[] args) {
        int arr[]={2,5,4,1,12,22,15};
        int half=arr.length/2;
        for(int i=0;i<=half;i++){
            int min=i;
            for(int j=i+1;j<=half;j++){
               if(arr[j]<arr[min])
                     min=j;
            }
            swap(arr,i,min);
        }

        for(int i=half+1;i<arr.length;i++){
            int max=i;
            for(int j=i+1;j<arr.length;j++){
               if(arr[j]>arr[max])
                     max=j;
            }
            swap(arr,i,max);

        }
        System.out.print(Arrays.toString(arr));
    }
    private static void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
