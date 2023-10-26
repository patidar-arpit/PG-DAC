public class RemoveVowels {

    public static void main(String[] args) {
        String str="I am very happy today";
        String strNew="";

        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if("aeiou".indexOf(ch)==-1 && "AEIOU".indexOf(ch)==-1){
                strNew=strNew+ch;
            }
        }

        System.out.println(strNew);
    }
}
