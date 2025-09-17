package String;

public class file01 {
    public static void main(String[] args) {
        // string is non primitive data type 
        String name = new String("Varun:kumar:btech"); // this String is created using string class and name is the object.
        String name3 = new String("Varun:kumar:btech"); // here name and name3 are two different object so there reference will also different

        System.out.println(name==name3);  //false

        String name1 = "varun"; // this is the local variable of main method
        String name2 = "varun";  // here name1 and name2 having same value and same reference so == checks for reference not for value

        System.out.println(name1==name2);  //true

        // System.out.println(name.equalsIgnoreCase(name1));
        // System.out.println(name.toUpperCase());
        String result[] = name.split(":");

        String result1[] = {"name","varun","kumar"};

        // for (String answer : result) {
        //     System.out.println(answer);
        // }
        System.out.println(String.join("-", result1));
    }
    


}
