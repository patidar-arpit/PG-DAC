import java.util.Arrays;

public class Rotate {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        rotateArray(arr,6);
        System.out.print(Arrays.toString(arr));
    }

    private static void rotateArray(int[] arr,int k) {
       
        for(int i=0;i<k;i++){
            rotateByOne(arr);
        }

    }

    private static void rotateByOne(int[] arr) {

        int temp=arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=temp;
    }
}
