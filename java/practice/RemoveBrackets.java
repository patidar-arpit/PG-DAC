public class RemoveBrackets {
    public static void main(String[] args) {
        String str="a+((b-c)+())d)(";
        String strNew="";

        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch!='(' && ch!=')'){
                strNew=strNew+ch;
            }
        }

        System.out.println(strNew);
    }
}
