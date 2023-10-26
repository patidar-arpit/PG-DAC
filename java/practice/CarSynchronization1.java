class Car implements Runnable{
    public  void run(){    // Thier is problem in this that all thread are accessing the car at a time and driving which is wrong logIcally to avoid this GO TO NEXT EXAMPLE
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
public class CarSynchronization1 {

    public static void main(String[] args) {

        Car c=new Car();
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
