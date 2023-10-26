import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDeque2 {
    public static void main(String[] args) {

       Deque queue =new ArrayDeque();  // ArrayDeque is using as queue

        queue.offer(10);
        queue.offer(20);
        queue.offer('J');
        queue.offer(20);

        System.out.println(queue);
        System.out.println(queue.size());
        System.out.println(queue.peek());
        System.out.println(queue.poll());

        System.out.println(queue);

    }
}
