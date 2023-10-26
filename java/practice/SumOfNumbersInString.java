public class SumOfNumbersInString {
    public static void main(String[] args) {
        String str="123xyz01xr124";

        String tempSum="";
        int sum=0;

        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if (Character.isDigit(ch)){
                tempSum=tempSum+ch;
            }
            else {
                sum=sum+Integer.parseInt(tempSum);
                tempSum="0";
            }
        }

        int result=sum+Integer.parseInt(tempSum);
        System.out.println(result);



    }
}
