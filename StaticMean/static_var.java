package StaticMean;

class mobile {
    String brand;
    int price;
    static String name;

    mobile() {
        brand = "";
        price = 200;
    }

    static {
        name = "phone";   // it only one time at the time of class loading.
    }

    public void show() {
        System.out.println(brand + " : " + name + " : " + price);
    }
    
    public static void show1(mobile obj) {
        System.out.println("In Static Method");

        System.out.println(obj.brand + " : " + name + " : " + obj.price);
    }
}

public class static_var {
    public static void main(String[] args) {
        mobile.name = "smartphone";

        mobile obj1 = new mobile();
        obj1.brand = "Apple";
        obj1.price = 101456;
       

        mobile obj2 = new mobile();
        obj2.brand = "samsung";
        obj2.price = 10156;
       

        obj1.show();
        obj2.show();

        mobile.show1(obj1);

    }
}
