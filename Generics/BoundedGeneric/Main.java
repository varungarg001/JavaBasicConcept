package Generics.BoundedGeneric;

public class Main {

    public static void main(String[] args) {
        Box<Integer> b1 = new Box<>();
        b1.setValue(1);

        // Box<String> b2 = new Box<>(); // now it will throw an error because it cannot accept the String value



        int i = b1.getValue();
        System.out.println(i);
        

    }
}