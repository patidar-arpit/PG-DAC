import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDeque1 {
    public static void main(String[] args) {
        Deque q= new ArrayDeque();   // ArrayDeque as a Stack

        q.push(10);
        q.push(10);
        q.push('H');
        System.out.println(q);

        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q);

    }
}
