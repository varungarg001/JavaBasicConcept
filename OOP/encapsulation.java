package OOP;

class human {
    private int age;
    private String name;

    public human() {   // default constructor
        age = 12;
        name = "kumar";
    }

    public human(int age,String name) {   // parameterized constructor
        this.age = age;
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;  // this represent the current object 
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}

public class encapsulation {
    public static void main(String[] args) {
        human h1 = new human(20,"varun");
        human h2 = new human();
        // System.out.println(h1.getAge());
        // System.out.println(h1.getName());
        System.out.println(h2.getName());
        h1.setAge(30);
        h1.setName("varun kumar");
        // System.out.println(h1.getAge());
        // System.out.println(h1.getName());
    }
}
