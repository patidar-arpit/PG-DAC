class Test{
    public static  void  show(int a){
        System.out.println("int "+a);
    }
    public static  void  show(byte a){
        System.out.println("byte");
    }
    public static  void  show(short a){
        System.out.println("short");
    }
    public static  void  show(long a){
        System.out.println("long");
    }


}
public class MethodOverloading {
    public static void main(String[] args) {

        Test t=new Test();
        char a='A';
        t.show(a);  // it will not find the method which have char as parameter but with the help of concept of Automatic
                    // promotion the method which have int as a para catches it

    }
}
