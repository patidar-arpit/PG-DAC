public class LargestWord {
    public static void main(String[] args) {

        String s1="aRPIT KUMARaaaaaaaaaaaa PATIDAR";

        String [] srr=s1.split(" ");
        int maxWord=0;
        for (int i=0;i<srr.length;i++){
            if(srr[i].length()>maxWord)
                maxWord=srr[i].length();
        }

        for (int i=0;i<srr.length;i++){
            if(srr[i].length()==maxWord){
                System.out.println(srr[i]);
            }
        }
    }
}
