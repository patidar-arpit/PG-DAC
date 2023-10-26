import java.util.Scanner;

class MyThread extends  Thread{
    public void run(){    /// Multiple tasks into one run method guys.!
       if(Thread.currentThread().getName()=="Calc"){
           clac();
       }
       else {
           message();
       }
    }

    public void clac(){
        System.out.println("Calculation Started");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num1:");
        int num1=sc.nextInt();
        System.out.println("Enter the num2:");
        int num2=sc.nextInt();
        System.out.println(num1+num2);
        System.out.println("Calculation Ended");
    }

    public void message(){
        System.out.println("Imp message started");
        try{
            for (int i=0;i<3;i++){
                System.out.println("Focus is key to master");
                Thread.sleep(2000);
            }
        }
        catch (java.lang.Exception e){
            System.out.println("Somethig went wrongrrrr");
        }
        System.out.println("Imp message ended.!");
    }


}
public class MultiThreading3 {

    public static void main(String[] args) {

        System.out.println("Main Thread");
        MyThread t1=new MyThread();
        MyThread t2=new MyThread();

        t1.setName("Calc");
        t2.setName("ImpMesaage");

        t1.start();
        t2.start();


    }
}
