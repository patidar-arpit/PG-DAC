import java.util.Scanner;

class Mythread extends  Thread{

    public void run(){
        System.out.println("Child Thread");
    }
}
public class MultiThreading1 {

    public static void main(String[] args) {

        System.out.println("Main Thread");
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();

        Mythread t=new Mythread();
        t.start();

    }
}
