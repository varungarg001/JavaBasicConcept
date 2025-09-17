package Generics.GenericConstructor;

public class MethodGeneric {
    public static <T> void display(T[] array) {
        for (T arr : array) {
            System.out.println(arr);
        }
    }
    
    public static void main(String[] args) {
        Integer[] arr = { 1, 4, 5, 6 };
        display(arr);
        String[] arr2 = { "hello", "world", "champ" };
        display(arr2);
    }
}
