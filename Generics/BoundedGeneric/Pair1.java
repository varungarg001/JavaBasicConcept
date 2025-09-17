package Generics.BoundedGeneric;

interface printable{

    void print();
}

class myNumber extends Number implements printable {
    private Object number;
    
    public myNumber(double number) {
        this.number = number;
    }
    public myNumber(int number) {
        this.number = number;
    }


    @Override
    public void print() {
        System.out.println("My number: " + number);
    }

    

    @Override
    public double doubleValue() {
        return (double)number;

    }

    @Override
    public float floatValue() {
        return (float)number;

     
    }

    @Override
    public int intValue() {
        return (int)number;
        
    }

    @Override
    public long longValue() {
        return(long) number;
    }
    
    
}

class Boxx<T extends Number & printable> {

    private T item;

    public Boxx(T item) {
        this.item = item;
    }

    public void display() {
        item.print();
    }
}


public class Pair1 {

    public static void main(String[] args) {
        myNumber m1 = new myNumber(145);

        Boxx<myNumber> b2 = new Boxx<>(m1);
        b2.display();

    }
}
