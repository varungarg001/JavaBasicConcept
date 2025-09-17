package Generics.GenericClass;

public class MainPair {

    public static void main(String[] args) {
        Pair<String, Integer> p1 = new Pair<>("Age", 30);
        System.out.println(p1.getKey());
        System.out.println(p1.getValue());
    }
}