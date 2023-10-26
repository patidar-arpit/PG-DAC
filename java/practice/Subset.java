public class Subset {
    public static void main(String[] args) {
        int [] arr1={1,2,3,4,5};
        int [] arr2={0};

        System.out.print(isSubSet(arr1,arr2));
    }

    private static boolean isSubSet(int[] arr1, int[] arr2) {

        for(int i=0;i<arr2.length;i++){
            int flag=0;
            for(int j=0;j<arr1.length;j++){
               if(arr2[i]==arr1[j]){
                  flag=1;
                  break;
               }
            }
            if(flag==0)
                return false;
        }
        return true;
    }

}
