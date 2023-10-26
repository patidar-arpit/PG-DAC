import java.util.Arrays;

public class freq {
    public static void main(String[] args) {
        int [] arr={1,4,3,1,4,2,3,0,5};//{0,1,1,2,3,3,4,4,5}
        //usingSpace(arr);
        usingTwoLoop(arr);
    }

    private static void usingTwoLoop(int[] arr) {
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            int count=1;
            while(i<arr.length-1 && arr[i]==arr[i+1]){
                count++;
                i++;
            }
            System.out.println(arr[i]+":"+count);
        }
    }
    private static void usingSpace(int[] arr) {
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max)
               max=arr[i];
        }

        int brr[]=new int[max+1];
        for(int i=0;i<arr.length;i++){
            brr[arr[i]]++;
        }

        int k=0;
        while(k<brr.length){
            if(brr[k]!=0)
                System.out.println(k+":"+brr[k]);
            k++;
        }
    }
}
