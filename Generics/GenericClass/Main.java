package Generics.GenericClass;

public class Main {

    public static void main(String[] args) {
        Box<Integer> b1 = new Box<>();
        b1.setValue(1);

        // String value = (String) b1.getValue(); // classcastexception because the value is int type so the user can enter the value related to other data types so need to make the class generic
        // after making the class generic the now the exception will occur at compile time earlier the exception came at runtime

        int i = b1.getValue();
        System.out.println(i);
        

    }
}