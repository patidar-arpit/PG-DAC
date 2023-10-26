public class RemoveChar1 {
    public static void main(String[] args) {
        String s1="abcdfez";
        String s2="cezl";
        String strNew="";

        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            if(s2.indexOf(ch)==-1){
                strNew=strNew+ch;
            }

        }

        System.out.println(strNew);
    }
}
