import  java.util.*;
public class ArrayList1 {
    public static void main(String[] args) {
       List l1=new ArrayList();
       List  l2=new ArrayList();
       l1.add(10);
       l1.add(20);
       l1.add(30);
       l1.add(1,40);

        l2.add(50);
        l2.add(06);
        l2.add(10);

        l1.addAll(l2);
        System.out.println(l1);
        System.out.println(l1);
        l1.removeAll(l2);
        System.out.println(l1);
        System.out.println(l1.get(2));
        System.out.println(l1.indexOf(20));
        l1.set(1,50);
        System.out.println(l1);
        l1.add(1,60);
        System.out.println(l1);



    }
}
