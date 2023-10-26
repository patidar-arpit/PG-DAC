public class DistinctElement {
    public static void main(String[] args) {
        int arr[]={1,2,1,3,2,4,5,5,0};
        // printDistinct(arr);
        //System.out.println(countDistinct(arr));
        System.out.println(count1Distinct(arr));
    }

    private static int count1Distinct(int[] arr) {
        int count=0;
        for(int i=0;i<arr.length;i++){
            int flag=0;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    flag=1;
                    break;
                }
            }
            if(flag==0)
               count++;
        }
        return count;
    }

    private static int countDistinct(int[] arr) {
        int max=arr[0];
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max)
               max=arr[i];
        }
        
        int brr[]=new int[max+1];
        for(int i=0;i<arr.length;i++){
          brr[arr[i]]++;
        }
        for(int i=0;i<brr.length;i++){
            if(brr[i]==1)
               count++;
        }
        return count;
    }

    public static void printDistinct(int[] arr) {
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max)
               max=arr[i];
        }
        
        int brr[]=new int[max+1];
        for(int i=0;i<arr.length;i++){
          brr[arr[i]]++;
        }
        for(int i=0;i<brr.length;i++){
            if(brr[i]==1)
              System.out.print(i+" ");
        }
    }


}
