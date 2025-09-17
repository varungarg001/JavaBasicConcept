class parent {
    void show1() {
        System.out.println("hello in show 1");
    }
}

class child extends parent {
    void show2() {
        System.out.println("hello in show 2");
    }
}

public class UpCastingAndDownCasting {
    public static void main(String[] args) {
        parent p = new child();
        p.show1();
        child p1 = (child) p;
        p1.show2();
        // p1.show1();
    }
}
