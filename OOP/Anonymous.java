package OOP;

class A {

    public A() {
        System.out.println("Object created");
    }
    public void show() {
        System.out.println("display");
    }
}

public class Anonymous {
    public static void main(String[] args) {
        new A();  // object created  (anonymous object)
        // A obj;  // reference variable
        // obj=new A();  // object created
        // obj.show();
    }
    
}