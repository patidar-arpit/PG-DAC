import java.util.HashSet;

public class RemoveDuplicates {

    public static void main(String[] args) {
        String str="Hello";
       String strNew="";

       for (int i=0;i<str.length();i++){
           char ch=str.charAt(i);
           if(strNew.indexOf(ch)==-1)
               strNew=strNew+ch;
       }
        System.out.println(strNew);

    }
}
