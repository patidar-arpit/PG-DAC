import java.util.TreeSet;

public class TreeSet1 {

    public static void main(String[] args) {
        TreeSet ts=new TreeSet();

        ts.add(10);
        ts.add(5);
        ts.add(20);
        ts.add(50);
        ts.add(15);
        ts.add(5);
//        ts.add("Hello");  Not allowed heterogeneous element

        System.out.println(ts);

        System.out.println(ts.ceiling(20));
        System.out.println(ts.ceiling(30));
        System.out.println(ts.floor(20));
        System.out.println(ts.floor(30));

        System.out.println(ts.higher(20));
        System.out.println(ts.higher(30));
        System.out.println(ts.lower(20));
        System.out.println(ts.lower(30));

        System.out.println(ts.headSet(20));
        System.out.println(ts.tailSet(20));
        System.out.println(ts.subSet(10,50));

        Object  [] arr=ts.toArray();
        System.out.println(arr[1]);



    }
}
