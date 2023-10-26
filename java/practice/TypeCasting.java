public class TypeCasting {
    public static void main(String[] args) {
        int a=10;
        double d;
        d=a;  // Implicit Type Casting Promotion of datatype is going here int -> double
        System.out.println(d);

        double d1=45.5;
        int a1;
        a1=(int)d1;  // Explicit type casting should be done other wise give error
        System.out.println(a1);

    }
}
