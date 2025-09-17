package SyncUsingLock.LambdaExpression;

public class test {
    public static void main(String[] args) {
        student engineeringStudnet = (name)->{
            return (name+" is a engineering student ");
        };

        String bio = engineeringStudnet.getBio("ram");
        System.out.println(bio);

    }
}
