package FileHandling;

import java.io.IOException;
import java.io.PrintWriter;

public class printWriter {
    public static void main(String[] args) {
        try (PrintWriter pr = new PrintWriter("new.txt")) {
            pr.println("hello world");
            pr.println(145);
            pr.println("ABC");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
