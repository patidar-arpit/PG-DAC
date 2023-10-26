import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList l1=new LinkedList();
        ArrayList al=new ArrayList();

        LinkedList l2=new LinkedList(al); //Converting al(arraylist) into the l2(linked List)

        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.addLast(50);
        l1.addFirst('H');
        l1.add(1,0);

        System.out.println(l1.peek());
        System.out.println(l1.poll());
        System.out.println(l1);

        l1.set(1,"Hello");
        System.out.println(l1);

    }
}
