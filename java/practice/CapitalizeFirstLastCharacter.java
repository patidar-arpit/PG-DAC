import java.nio.charset.Charset;

public class CapitalizeFirstLastCharacter {
    public static void main(String[] args) {
        String str="take you forward";
        String strNew="";
        String [] arr=str.split(" ");

        for (String s1:arr) {
            char first=Character.toUpperCase(s1.charAt(0));
            char last= Character.toUpperCase(s1.charAt(s1.length()-1));

            String str1=s1.substring(1,s1.length()-1);

            strNew=strNew+first+str1+last+" ";

        }

        System.out.println(strNew);
    }
}
