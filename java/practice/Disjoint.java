import java.util.HashSet;

public class Disjoint { /// two array are disjoint if the both array have no intersection means nothing have common 
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5};
        int arr2[]={11,10,20,4};
       // System.out.print(isDisjoint1(arr1, arr2));
        System.out.print(isDisjoint2(arr1, arr2));

    }

    private static boolean isDisjoint2(int[] arr1, int[] arr2) {
          HashSet<Integer> h=new HashSet<>();
          for(int i=0;i<arr1.length;i++){
             h.add(arr1[i]);
          }

          for (int i=0; i<arr2.length;i++){
            if(h.contains(arr2[i]))
                return false;
          }
              

          return true;
    }

    private static boolean isDisjoint1(int[] arr1, int[] arr2) {

        for(int i=0;i<arr1.length;i++){
             for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    return false;
                }
             }
        }
        return true;
    }
}
