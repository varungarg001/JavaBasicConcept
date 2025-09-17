package SyncUsingLock.LambdaExpression;

@FunctionalInterface
interface student{
    String getBio(String name);
}

public class Main {
    public static void main(String[] args) {
        Runnable runnable = ()-> System.out.println("hello world"); // this is an anonymns function or lambda function let's see another example.
    }
}
