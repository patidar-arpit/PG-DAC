public class Reverse {
    public static void main(String[] args) {
        String s1="arpit patidar hai";
        s1=reverseString(s1);
        System.out.println(s1);
    }

    public static String reverseString(String s1){
        String str="";
        for (int i=s1.length()-1;i>=0;i--){
            str=str+s1.charAt(i);
        }

        return str;
    }
}
