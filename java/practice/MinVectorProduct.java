import java.util.Arrays;

public class MinVectorProduct {
    public static void main(String[] args) {
        int [] arr={10,20,40,30};
        int [] brr={1,4,2,5};
        minProduct(arr,brr);
        maxProduct(arr,brr);
    }

    private static void maxProduct(int[] arr, int[] brr) {
        Arrays.sort(arr); //10,20,30,40
        Arrays.sort(brr); // 1,2,4,5
        int total_product=0;
        for(int i=arr.length-1,j=brr.length-1;i>=0 && j>=0;i--,j--){
           total_product=total_product+arr[i]*brr[j];
        }
        System.out.println(total_product);
    }

    private static void minProduct(int[] arr, int[] brr) {
        Arrays.sort(arr); //10,20,30,40
        Arrays.sort(brr); // 1,2,4,5
        int total_product=0;
        for(int i=0,j=brr.length-1;i<arr.length && j>=0;i++,j--){
           total_product=total_product+arr[i]*brr[j];
        }
        System.out.println(total_product);
    }
}
