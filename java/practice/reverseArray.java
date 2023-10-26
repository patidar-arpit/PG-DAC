import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int [] arr={2,4,5,7,8};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
        revRec(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void revRec(int[] arr,int i,int j) {
         if(i>=j)
            return;
         swap(arr, i, j);
         revRec(arr, i+1, j-1);
    }

    private static void reverse(int[] arr) {
        int i=0;
        int j=arr.length-1;
        while(i<=j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
