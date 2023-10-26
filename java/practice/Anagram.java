import java.util.Arrays;
import java.util.Locale;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "cat";
        String s2 = "act";

       System.out.println(anagram1(s1, s2));
        System.out.println(anagram(s1,s2));
    }
    public  static  boolean anagram1(String s1,String s2){
        String st1=s1.toLowerCase();
        String st2=s2.toLowerCase();

        int [] arr1=new int[26];
        int [] arr2=new int[26];

        for (int i=0;i<st1.length();i++){
            arr1[st1.charAt(i)-97]++;
        }

        for (int i=0;i<st2.length();i++){
            arr2[st2.charAt(i)-97]++;
        }

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        for (int i=0;i<arr1.length;i++){
            if (arr1[i]!=arr2[i])
                return false;
        }
        return true;
        }






    public static boolean anagram(String s1,String s2){
        char [] arr1=s1.toCharArray();
        char [] brr1=s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(brr1);

        s1=new String(arr1);
        s2=new String(brr1);

        if(s1.equals(s2))
             return   true;
        return  false;
    }


}
