package Generics.GenericConstructor;

public class ConstructorGeneric {
    public <T> ConstructorGeneric(T value) {
        System.out.println(value);
    }
   
    public static void main(String[] args) {
        ConstructorGeneric cg1 = new ConstructorGeneric(10);
        ConstructorGeneric cg2 = new ConstructorGeneric("hello world");
    }
}
