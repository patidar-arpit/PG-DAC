public class example1 {
    public static void main(String[] args) {
        int [] arr={10,20,33,40,12,0};
        countEvenOdd(arr);
        
    }

    private static void countEvenOdd(int[] arr) {

        int countOdd=0;
        int countEven=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0)
                countEven++;
            else
                countOdd++;

        }

        System.out.println(countEven);
        System.out.println(countOdd);

    }
}
