package JavaStreams.LambdaExpression;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.BiConsumer;
import java.util.function.UnaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

// lambda expression is the annoyms function with no return type , no name ,no access modifier,it is mainly used with the functional interface

@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

public class example {
    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            System.out.println(Thread.currentThread().getName());
        });

        t1.start();

        MathOperation sumOpertaion = ( a , b)->a+b;
        MathOperation subtracOperation = ( a , b)->a-b;
        MathOperation multiplOperation = ( a , b)->a*b;
        MathOperation dividOperation = ( a , b)->a/b;
        MathOperation modOperation = (a, b) -> a % b;
        
        System.out.println(sumOpertaion.operate(10,20 ));
        System.out.println(subtracOperation.operate(10,20 ));
        System.out.println(multiplOperation.operate(10,20 ));
        System.out.println(dividOperation.operate(10,2 ));
        System.out.println(modOperation.operate(10, 21));
        
        // predicate -> a boolean valued functional interface (condition check )

        Predicate<Integer> isEven = x -> x % 2 == 0;

        System.out.println(isEven.test(4));

        Predicate<String> isWordStartWithA = x -> x.toLowerCase().startsWith("a");
        Predicate<String> isWordendWithT = x -> x.toLowerCase().endsWith("t");

        Predicate<String> and = isWordStartWithA.and(isWordendWithT);   // combine two predicate with "and" condition 

        System.out.println(and.test("ankit"));


        // Function interface --> it will do some work

        Function<Integer, Integer> doubleIt = x -> x * 2;
        Function<Integer, Integer> tripleIt = x -> x * 3;
        Integer apply = doubleIt.andThen(tripleIt).apply(20);   // double->triple
        Integer compose = doubleIt.compose(tripleIt).apply(20);   // triple->double
        System.out.println(doubleIt.apply(10));
        System.out.println(apply);
        System.out.println(compose);


        // consumer -> consume things

        Consumer<Integer> consumer = x -> System.out.println(x);
        consumer.accept(254);

        // supplier -> supply things

        Supplier<String> giveHelloWorld = () -> "Hello World";
        System.out.println(giveHelloWorld.get());

        // after all these move to the combinedExample class

        // bipredicate , bifunction, biconsumer

        BiPredicate<Integer, Integer> isSumEven = (x, y) -> (x + y) % 2 == 0;
        System.out.println(isSumEven.test(10, 42));

        // biFunction
        BiFunction<String, String, Integer> lengthOfString = (x, y) -> (x + y).length();
        System.out.println(lengthOfString.apply("hello", "champ"));
        
        // biConsumer
        BiConsumer<Integer,Integer>print=(x,y)->{
            System.out.println(x);
            System.out.println(y);
        };
        print.accept(1000, 20);

        //Unary Operator -> unaryoperator interface are similar to function interface but the differnce is if the functioninterface have similar <T,T> then instead of this we use <T> in unaryoperator.
        UnaryOperator<Integer> UnaryOperator = (x) -> x + 2;
        System.out.println(UnaryOperator.apply(10));

        //Binary Operator -> BinaryOperator interface are similar to function interface but the differnce is if the functioninterface have similar <T,T,T> then instead of this we use <T> in unaryoperator.

        BinaryOperator<Integer> sumofOperator = (x, y) -> x + y;
        System.out.println(sumofOperator.apply(10, 20));



    }
}
