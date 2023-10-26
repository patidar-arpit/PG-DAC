public class array_sum {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println(sum(arr,0,arr.length-1));
    }

    private static int sum(int[] arr,int i,int l) {
        
        if(i==l)
            return arr[i];
        return arr[i]+sum(arr,i+1,l);
    }
}
