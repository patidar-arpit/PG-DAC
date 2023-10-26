import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDeque3 {
    public static void main(String[] args) {
        Deque deq=new ArrayDeque();  // deq is acting as a double ended queue in which we can delete and insert at the both ends

        deq.offerFirst(10);
        deq.offerFirst(20);
        deq.offerLast(30);
        deq.offerLast(40);

        System.out.println(deq);
        System.out.println(deq.peekFirst());
        System.out.println(deq.pollFirst());
        System.out.println(deq.peekLast());
        System.out.println(deq.pollLast());

        System.out.println(deq);
    }
}