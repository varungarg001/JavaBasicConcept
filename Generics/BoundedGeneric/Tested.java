package Generics.BoundedGeneric;

public class Tested {

    public static void main(String[] args) {
        myNumber m1 = new myNumber(1478.45);
        Boxx<myNumber> b1 = new Boxx<>(m1);

        b1.display();


    }
}