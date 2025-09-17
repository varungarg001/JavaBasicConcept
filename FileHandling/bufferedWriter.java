package FileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class bufferedWriter {
    public static void main(String[] args) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("notes.txt", true))) {
            bw.newLine();
            bw.write("hare krishna");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
