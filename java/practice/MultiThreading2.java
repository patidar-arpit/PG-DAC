import java.util.Scanner;

class  Message extends  Thread{
    public void  run(){
        System.out.println("Imp Mesaage started.! ");
        try{
            for (int i=0;i<3;i++){

                System.out.println("Focus is key");
                Thread.sleep(2000);
            }
        }
        catch (java.lang.Exception e){

            System.out.println("Something wrong");

        }
        System.out.println("Imp Message ended.!");
    }
}

class Calc extends  Thread{
    public  void run(){
        System.out.println("Calculation Started.!");
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println(num1+num2);
        System.out.println("Calculation Ended");
    }
}
public class MultiThreading2 {
    public static void main(String[] args) {

        System.out.println("Main Thread");
        Calc t1=new Calc();
        Message t2=new Message();
        t1.start();
        t2.start();


    }
}
