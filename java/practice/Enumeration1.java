import java.util.Enumeration;
import java.util.Vector;

public class Enumeration1 {

    public static void main(String[] args) {
        Vector v=new Vector();

        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);

        System.out.println(v);

        Enumeration cur=v.elements();

        while(cur.hasMoreElements()){
            System.out.println(cur.nextElement());
        }
    }
}
