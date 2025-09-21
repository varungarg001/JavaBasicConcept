package clonningInJava;

class cloneDemo{
    private int a;

    void setValue(int a) {
        this.a = a;
    }

    int getValue() {
        return a;
    }

}

public class file01 {
    public static void main(String[] args) {
        cloneDemo c1 = new cloneDemo();
        c1.setValue(10);
        System.out.println("value of a for object c1: "+c1.getValue());

        cloneDemo c2;
        c2 = c1;   // clonning of object
        System.out.println("value of a for object c2: " + c2.getValue());
        
        System.out.println("After changing the value: ");
        c2.setValue(45);
        System.out.println("value of a for object c1: " + c1.getValue());
        System.out.println("value of a for object c2: " + c2.getValue());

        // Change in value of one object leads to change in value of object which clones the first object

    }
}