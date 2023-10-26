import java.util.PriorityQueue;

public class PQ {
    public static void main(String[] args) {
        PriorityQueue pq=new PriorityQueue<>();
        pq.add(100);
        pq.add(10);
        pq.offer(5);
        pq.add(150);
        pq.add(125);
        pq.add(100);
        System.out.println(pq);
//        pq.remove(10);
        System.out.println(pq);
        pq.remove();   /// Ist priority element will be removed first one
        System.out.println(pq);

    }
}
