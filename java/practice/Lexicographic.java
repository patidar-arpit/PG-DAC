public class Lexicographic {

    public static void main(String[] args) {
        String s1="AbcxyZ";
        String strNew="";

        for (int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            if(ch=='z'){
                strNew=strNew+'a';
                break;
            }
            if(ch=='Z'){
                strNew=strNew+'A';
                break;
            }


            int x=ch+1;
            strNew=strNew+(char)x;


        }

        System.out.println(strNew);
    }
}
