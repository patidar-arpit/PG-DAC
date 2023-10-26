class  Printing implements Runnable{
    public void run(){
        try{
            for (int i=0;i<3;i++){
                System.out.println("Focus is key");
                Thread.sleep(2000);
            }
        }
        catch (java.lang.Exception e){
            System.out.println("Something went wrong"+e);
        }
    }
}
public class MultiThreading4 {
    public static void main(String[] args)  throws  java.lang.Exception{

        System.out.println("Main thread started");
        Printing p=new Printing();
        Thread t=new Thread(p);
        System.out.println(t.isAlive());
        t.start();
        System.out.println(t.isAlive());
        t.join();  /// Jab tak t1 apna kaam khtam krke dead nhi ho jata aage mat bado.
        System.out.println("Main thread ended");

    }
}
