import java.sql.SQLOutput;

public class Reverse1 {
    public static void main(String[] args) {
        String s1="Arpit Patidar";
        reverse(s1);
    }

    public  static void reverse(String str){
        String [] s1=str.split(" ");
        for (int i=0;i<s1.length;i++){
            s1[i]=reverse1(s1[i]);
        }

        for (String a:s1) {
            System.out.print(a+" ");
        }
    }

    public  static  String reverse1(String str){
        String strNew="";
        for (int i=str.length()-1;i>=0;i--){
            strNew=strNew+str.charAt(i);
        }
        return strNew;
    }
}
