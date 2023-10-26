public class CountRepeatedLetters {
    public static void main(String[] args) {
        String str="abcdefghij google microsoft aabbccddedfgarrtuu";
        String [] srr=str.split(" ");
        int max=0;
        String strNew="";
        for(int i=0;i<srr.length;i++ ){
            int x=no0fRepeatedLetters(srr[i]);

            if(x>max){
                max=no0fRepeatedLetters(srr[i]);
                strNew=srr[i];
            }
        }

        System.out.println(strNew);
    }

    public  static  int no0fRepeatedLetters(String s1){

        int [] arr=new int [256];
        int repeated=0;
        for(int i=0;i<s1.length();i++){
            arr[(int)s1.charAt(i)]++;
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]>1){
                repeated++;
            }
        }

        return repeated;


    }
}
