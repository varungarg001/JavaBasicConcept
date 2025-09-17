package FileHandling;

import java.io.FileReader;
import java.io.IOException;

public class fileReader {

    public static void main(String[] args) {
        try (FileReader fr = new FileReader("notes.txt")) {
            int data = fr.read();
            while (fr.ready()) {
                System.out.println((char) data);
                data = fr.read();
            }
            fr.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}