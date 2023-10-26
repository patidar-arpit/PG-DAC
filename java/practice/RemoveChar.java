public class RemoveChar {
    public static void main(String[] args) {
        String str="take12% *&u ^$#forward";
        String strNew="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>=65 && ch<=90 || ch>=97 && ch<=122){
                strNew=strNew+ch;
            }
        }

        System.out.println(strNew);
    }
}
