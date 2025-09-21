package clonningInJava;

class CloneTest implements Cloneable {
    int a;
    public CloneTest makeClone() {
        try{
            return (CloneTest)super.clone();
        } catch (Exception e) {
            System.out.println("clone not possible");
            return this;
        }
    }
}

public class file02 {
    public static void main(String[] args) {
        CloneTest c1 = new CloneTest();
        c1.a = 10;

        CloneTest c2 = c1.makeClone();
        c2.a = 20;

        System.out.println("Value of a in object c1: "+c1.a);
        System.out.println("Value of a in object c2: "+c2.a);

    }
}