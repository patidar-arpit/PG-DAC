import java.util.Arrays;

public class nonRepeating {
    public static void main(String[] args) {
        int [] arr={10,20,30,20,10,40,50,10,50,50,50,60};
        printNonRepeating(arr);
    }

    private static void printNonRepeating(int[] arr) {

        Arrays.sort(arr);
        int i=0;
        int flag=0;
        while(i<arr.length-1){
            if(arr[i]==arr[i+1]){
                i++;
                continue;
            }
        }

    }

    private static void printNonRepeating1(int[] arr) {
        int [] visited=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(visited[i]==1)
                continue;
            int flag=0;
            for(int j=i+1;j<arr.length;j++){
                 if(arr[i]==arr[j]){
                     flag=1;
                     visited[j]=1;
                 }
            }
            if(flag==0)
                  System.out.println(arr[i]);
        }
    }
}
