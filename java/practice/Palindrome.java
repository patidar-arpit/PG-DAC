public class Palindrome {
    public static void main(String[] args) {
//        String s1="aabaa";
//        String reverse="";
//
//        for (int i=s1.length()-1;i>=0;i--){
//            reverse=reverse+s1.charAt(i);
//        }
//
//        if (s1.equals(reverse)){
//            System.out.println("True");
//        }
//        else
//            System.out.println("False");
//        System.out.println(reverse);
        System.out.println(palindrome("Arpit"));
    }

    public static boolean palindrome(String s1) {

        int left=0;
        int right=s1.length()-1;

        while (left<right){
            char l=s1.charAt(left);
            char r=s1.charAt(right);

            if(Character.toLowerCase(l)!=Character.toLowerCase(r))
                return false;
            else {
                right--;
                left++;
            }

        }

        return true;
    }
}
