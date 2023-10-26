public class demo {
    public static void main(String[] args) {
        String s1="ar#p#it##";
        System.out.println(moveHash(s1));
    }

    private static String moveHash(String s1) {
        String str1="";
        String str2="";
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)=='#'){
                str1=str1+s1.charAt(i);
            }
        }
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!='#'){
                str2=str2+s1.charAt(i);
            }
        }
        return str1+str2;
    }
}
