class Car1 implements Runnable{
   synchronized  public  void run(){    //   if we make this method synchronized the one thread will be thier inside at a time no oter thread will accessing this method if one is already thier
        try{
            System.out.println(Thread.currentThread().getName()+"Entered into the parking slot");
            Thread.sleep(2000);

            System.out.println(Thread.currentThread().getName()+"Get into the Car");
            Thread.sleep(2000);

            System.out.println(Thread.currentThread().getName()+"Started to drive and driving and Enjoying Journey");
            Thread.sleep(2000);

            System.out.println(Thread.currentThread().getName()+"Come Back and Parked the car");
        }
        catch (InterruptedException e){
            System.out.println(e);
        }
    }
}
public class CarSynchronization {

    public static void main(String[] args) {

        Car1 c=new Car1();
        Thread t1=new Thread(c);
        Thread t2=new Thread(c);
        Thread t3=new Thread(c);

        t1.setName("SON-1");
        t2.setName("SON-2");
        t3.setName("SON-3");

        t1.start();
        t2.start();
        t3.start();

    }
}
