import java.util.HashMap;
import  java.util.*;

public class AccessingInMap {

    public static void main(String[] args) {
        HashMap h1 = new HashMap();
        h1.put(1, "Arpit");
        h1.put(2, "Virat");
        h1.put(3, "Rohit");
        h1.put(4, "Rohan");

        System.out.println(h1);

        Set keys=h1.keySet();

        Iterator itr1=keys.iterator();

        while (itr1.hasNext()){
           Integer i=(Integer) itr1.next();
            System.out.println(i+":"+h1.get(i));
        }


        Collection values=h1.values();

        Iterator itr2=values.iterator();

        while (itr2.hasNext()){
            System.out.println(itr2.next());
        }

        Set entry=h1.entrySet();

        Iterator itr3= entry.iterator();

        while (itr3.hasNext()){
//            System.out.println(itr3.next());

            Map.Entry data=(Map.Entry)itr3.next();

            System.out.println(data.getKey()+":"+data.getValue());

        }



    }
}
