public class longestPalindrome {
    public static void main(String[] args) {
        int max=0;
        int res=-1;
        int [] arr={121,3223,23243434,132,545545,1234321};
        for(int i=0;i<arr.length;i++){
            if(isPalindrome(arr[i])){
               int max_palindrome=count(arr[i]);
                if(max_palindrome>max){
                    max=max_palindrome;
                    res=i;
                }
                     
            }

        }
        System.out.println(arr[res]);
    }

    private static int count(int n) {
        int count=0;
        while(n!=0){
           n=n/10;
           count++;
        }
        return count;
    }

    private static boolean isPalindrome(int n) {
        int newNum=n;
        int digit=0;
        while(n!=0){
            int rem=n%10;
            digit=digit*10+rem;
            n=n/10;
        }

        if(digit==newNum)
            return true;
        return false;
    }
}
