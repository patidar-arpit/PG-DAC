import java.util.HashSet;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet hs=new HashSet();

        hs.add(10);
        hs.add(100);
        hs.add(50);
        hs.add(40);
        hs.add(50);
        hs.add('H');  // Allow Heterogeneous data
        System.out.println(hs);
        System.out.println(hs.size());

        System.out.println(hs.contains(100));
        hs.remove('H');
        System.out.println(hs);




    }
}
