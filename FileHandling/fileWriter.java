package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class fileWriter {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("notes.txt",true)) {
            fw.write("hello world");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
