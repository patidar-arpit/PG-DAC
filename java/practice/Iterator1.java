import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Iterator1 {
    public static void main(String[] args) {
        ArrayList L1= new ArrayList();

        L1.add(10);
        L1.add(20);
        L1.add(40);
        L1.add(50);
        L1.add(60);
        System.out.println(L1);

//        for (int i=0;i<L1.size();i++){
//            System.out.println( L1.get(i));
//        }


        Iterator cur= L1.iterator();   //It can acess only data cannot modify data

        while (cur.hasNext()){
            System.out.println(cur.next());
        }

        ListIterator cur1=L1.listIterator(L1.size());   //List iterator can be traversed in both the direction
        int i=0;
        while(cur1.hasPrevious()){

            System.out.println(cur1.previous());
            cur1.set(i);     // it also have set()  method means can modify data
            i++;

        }

        System.out.println(L1);
    }
}
