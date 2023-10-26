public class RemoveSpaces {
    public static void main(String[] args) {
//        String str="Arpit Pa tid ar";
//        String [] arr1=str.split(" ");
//
//        for (int i=0;i<arr1.length;i++){
//            System.out.print(arr1[i]);
//        }

        String str="Take You Forward";
        String strNew="";
        for (int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                strNew=strNew+str.charAt(i);
            }
        }
        System.out.println(strNew);
    }
}
