import java.util.LinkedHashSet;

public class LinkedHashSet1 {

    public static void main(String[] args) {
        LinkedHashSet hs=new LinkedHashSet();  // Same as HashSet Class But differnce is that it maintain the insertion order
        hs.add(10);
        hs.add(100);
        hs.add(50);
        hs.add(40);
        hs.add(50);
        hs.add('H');  // Allow Heterogeneous data
        System.out.println(hs);   //Insertion order is preserved means maintain the order


    }
}
