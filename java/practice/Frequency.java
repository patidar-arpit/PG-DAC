public class Frequency {
    public static void main(String[] args) {
        String Str ="articlesa";

        int [] arr=new int[26];

        for (int i=0;i<Str.length();i++){
             int x=Str.charAt(i)-97;
             arr[x]++;
        }

        for (int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                char ch=(char)(97+i);
                System.out.print(ch);
                System.out.print(arr[i]+" ");
            }
        }
    }

}
