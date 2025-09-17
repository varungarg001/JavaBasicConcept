package JavaStreams.MethodReference;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class MobilePhone {
    String name;

    public MobilePhone(String name) {
        this.name = name;
    }
}

public class MethodReference {
    public static void main(String[] args) {
        List<String> students = Arrays.asList("Ram", "Shyam", "varun");
        students.forEach(x -> System.out.println(x)); // consumer method 
        students.forEach(System.out::println); // without invoking call the method -> method refernces
        

        // constructor references

        List<String> names = Arrays.asList("A", "B", "C");
        names.stream().map(x -> new MobilePhone(x));
        List<MobilePhone> mobilePhoneList = names.stream().map(MobilePhone::new).collect(Collectors.toList());
    }
}
