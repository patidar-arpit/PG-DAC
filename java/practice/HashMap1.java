import java.util.HashMap;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap h1=new HashMap<>();
        h1.put(1,"Arpit");
        h1.put(2,"Virat");
        h1.put(4,"Rohit");
        h1.put(3,"Hello");
        h1.put(5,"Arpit");
        h1.put(5,"Arpit");  // This Entry is not added beacause this entry is already present in the collection

        h1.put(4,"Rahul"); // This will replace the value of key present at 4 no

        h1.put(null,null);     // NULL Allowed as key or value or both

        System.out.println(h1);
    }
}
