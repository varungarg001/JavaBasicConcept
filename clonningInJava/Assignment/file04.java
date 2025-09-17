package clonningInJava.Assignment;

class Employee implements Cloneable{
    private int id;
    private String name;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    Employee makeClone() {
        try{
            return (Employee) super.clone();
        } catch (Exception e) {
            System.out.println("Clonning is nor possible");
            return this;
        }
    }

    
}

public class file04 {
    public static void main(String[] args) {

        Employee emp1 = new Employee();
        emp1.setName("varun kumar");
        emp1.setId(60);

        Employee emp2 = emp1.makeClone();
        emp2.setId(17);
        emp2.setName("dushyant");
        System.out.println("Emp2 name: "+emp2.getName());
        System.out.println("Emp2 id: "+emp2.getId());
    }
}