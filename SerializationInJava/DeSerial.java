package SerializationInJava;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerial {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("object.txt");

            ObjectInputStream ois = new ObjectInputStream(fis);

            Student student = (Student) ois.readObject();
            

            student.display();
            System.out.println(student.getAge());

            ois.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
