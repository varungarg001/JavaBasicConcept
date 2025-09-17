package JavaStreams.Problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class file01 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Anna", "Bob", "charlie", "david");
        // find out the students whose name length greater than 3
        System.out.println(names.stream().filter(x -> x.length() > 3).toList());
        
        // squaring and sorting nummbers
        List<Integer> numIntegers = Arrays.asList(5, 2, 1, 9, 6);
        System.out.println(numIntegers.stream().map(x -> x * x).sorted().toList());
        
        // summing values
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(integers.stream().reduce((x, y) -> x + y).get());
        
        // Counting occurences of a character
        String sentence = "Hello world";
        IntStream chars = sentence.chars(); // it also produces the stream of character because ther is no stream for character.

        System.out.println(chars.filter(x -> x == 'l').count());

        // stateful and stateless operarion

        // stateless operation -> when the operation doesnot know about all element of a collection, map,filteretc
        // stateful operation -> when the operation know about all the element of the collections to perform operation , sorted,distinct etc.


    }
}
