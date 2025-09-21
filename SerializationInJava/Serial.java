package SerializationInJava;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serial {
    public static void main(String[] args) throws IOException {
        // create object of student class

        Student student = new Student("Ankit Tiwari", 21, "ankit@gmailc.com", "lucknow");
        
        // FileOutputStream fos = new FileOutputStream("object.txt");


        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.txt"));

        // how to serialize

        oos.writeObject(student);

        oos.close();

        System.out.println("Object stated is transferred to file object.txt");
    }
}
