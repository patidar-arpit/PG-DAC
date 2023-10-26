public class MultiplicativeInverse {
    public static void main(String[] args) {
        int num=70;
        System.out.println(multiplicativeInverse(num));
    }

    public static  int multiplicativeInverse(int num){
        int count=0;
        while (num>9){
            num=productOfNum(num);
            count++;
        }
        return  count;
    }

    public  static  int productOfNum(int num){

        int product=1;
        while (num!=0){
            int digit=num%10;
            product=product*digit;
            num=num/10;
        }

        return  product;
    }
}
