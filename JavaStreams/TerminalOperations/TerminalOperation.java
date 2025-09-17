package JavaStreams.TerminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TerminalOperation {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,  3,  5);

        // 1. collect
        list.stream().toList();
        list.stream().collect(Collectors.toList());

        // 2. for each
        list.stream().forEach(x -> System.out.println(x));
        
        // 3. reduce -> combines element to produce single element result
        Optional<Integer> reduce = list.stream().reduce((x, y) -> x + y);
        System.out.println(reduce.get());

        // 4.count 

        // 5. allmatch,anymatch, nonematch
        boolean anyMatch = list.stream().anyMatch(x -> x % 2 == 0); // it returns true if any element the current condition
        
        boolean allMatch = list.stream().allMatch(x -> x % 2 != 0);  // it returns true if all element satisy condition 
        System.out.println(allMatch);

        boolean noneMatch = list.stream().noneMatch(x -> x % 2 == 0);   // it returns true if none element satisfy the current condition
        System.out.println(noneMatch);

        // 6. findfirst,findany
        Integer findFirst = list.stream().findFirst().get();  // return the first element
        System.out.println(findFirst);

        Integer findAny = list.stream().findAny().get();
        System.out.println(findAny);
    }
}
