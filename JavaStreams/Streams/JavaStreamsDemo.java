package JavaStreams.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStreamsDemo {
    public static void main(String[] args) {
        // stream is the feature introduce in java 8 to process the collections of data in a functional and declarative manner.
        // simplify data processing
        // Embrace functional programming
        // Enable easy parallelism

        // what is stream?
        // a sequence of elements supporting functional and declarative programming.
        
        // how to use streams?
        // source(stream),intermediate operations(filter,map and many more) and terminal operation(count,foreach and many more).

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5,8,5,4);
        long count = numbers.stream().filter(x -> x % 2 == 0).count();
        System.out.println(count);

        // how to make stream 

        // 1. collections to stream
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5,8,5,4);
        Stream<Integer> stream1 = list.stream();

        // 2. array to stream
        Integer[] arr = { 1, 2, 4, 5 };
        Stream<Integer> stream2 = Arrays.stream(arr);
        
        // 3.direct stream
        Stream<String> stream3 = Stream.of("a", "b", "c");

        // 4.infinte stream
        List<Integer> collect2 = Stream.generate(() -> 1).limit(10).collect(Collectors.toList());
        List<Integer> collect = Stream.iterate(1, x -> x + 1).limit(100).collect(Collectors.toList());
        System.out.println(collect);


    }
}
