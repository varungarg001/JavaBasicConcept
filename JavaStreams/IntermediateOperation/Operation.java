package JavaStreams.IntermediateOperation;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Operation {
    public static void main(String[] args) {
        // intermediate operation convert the stream into another stream
        // they are lazy, the do not execute until the terminal operation is invoked.


        // 1. filter 
        List<String> list = Arrays.asList("akshay", "varun", "ram","akshit","akshit");
        Stream<String> filter = list.stream().filter(x -> x.startsWith("a"));  // no filtering at this point
        long count = filter.count();   // terminal operation
        System.out.println(count);

        // 2 . map
        Stream<String> map = list.stream().map(x -> x.toUpperCase());

        // 3. sorted
        Stream<String> sorted = list.stream().sorted(); // sorted lexicograpily
        Stream<String> sortedusingcomparator = list.stream().sorted((a, b) -> a.length() - b.length());

        // 4. distinct
        list.stream().filter(x -> x.startsWith("a")).distinct().count();
        list.stream().distinct().filter(x -> x.startsWith("a")).count();
        
        // 5.limit
        List<Integer> collect = Stream.iterate(1, x -> x + 1).limit(10).collect(Collectors.toList());
        // System.out.println(collect);

        // 6. skip  -> it skips the element then it 
        List<Integer> skipIntegers = Stream.iterate(1, x -> x + 1).skip(10).limit(10).collect(Collectors.toList());
        System.out.println(skipIntegers);
    }
}
