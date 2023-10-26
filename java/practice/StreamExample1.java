import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample1 {
    public static void main(String[] args) {
        List<Integer> l1= Arrays.asList(1,2,4,5,3,6);

        Stream<Integer> streamData =l1.stream();
//        streamData.forEach(n->System.out.println(n));
//        streamData.forEach(n->System.out.println(n)); // Cannot use stream more than once it is already used in line no 11


        Stream<Integer> sortedStream=streamData.sorted();
        Stream <Integer> finalStream=sortedStream.map(n->n*2);
        Stream<Integer> lastStream=finalStream.filter(n->n%2==0);

        lastStream.forEach(n->System.out.println(n));


        Stream<Integer> streamData1=l1.stream();
        Stream<Integer> finalstrm=streamData1.filter(i->i%2==0);



    }
}
