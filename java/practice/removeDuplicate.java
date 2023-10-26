import java.util.Arrays;
import java.util.HashSet;

public class removeDuplicate {
    public static void main(String[] args) {
        int [] arr={10,20,30,20,10,40};
        //removeDuplicateElements(arr);
        removeDuplicateElements1(arr);

    }

    private static void removeDuplicateElements1(int[] arr) {
        int [] brr=new int[arr.length];
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(contains(arr[i],brr)==false){
                brr[j]=arr[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(brr));
    }

    private static boolean contains(int x,int [] brr) {
        for(int i=0;i<brr.length;i++){
        
            if(brr[i]==x)
                return true;

        }
        return false;
    }

    private static void removeDuplicateElements(int[] arr) {
        HashSet<Integer> h1=new HashSet<>();
        for(int i =0;i<arr.length;i++){
            h1.add(arr[i]);
        }
        System.out.print(h1);
    }
}
