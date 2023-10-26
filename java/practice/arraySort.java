import java.util.Arrays;

public class arraySort {
    public static void main(String[] args) {
        int [] arr={20,14,15,0,1};
        //normalSort(arr);
        // selectionSort(arr);
        // bubbleSort(arr);
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j-1]>arr[j])
                    swap(arr,j-1,j);
            }
        }
    }

    private static void bubbleSort(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
          for(int j=0;j<arr.length-i-1;j++){
            if(arr[j]>arr[j+1])
                  swap(arr, j, j+1);
          }
        }
    }

    private static void selectionSort(int[] arr) {
        int min=0;
        for(int i=0;i<arr.length-1;i++){
            min=i;
            for(int j=i+1;j<arr.length;j++){
               if(arr[min]>arr[j]) 
                    min=j;
                     
            }
            swap(arr,i,min);
        }
    }

    private static void normalSort(int[] arr) {

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j])
                   swap(arr,i,j);
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
