package FileHandling;

import java.io.IOException;
import java.io.OutputStreamWriter;

public class outputStreamwriter {
    public static void main(String[] args) {
        try (OutputStreamWriter osw = new OutputStreamWriter(System.out)) {
            osw.write("Hello World");
            osw.write(97);
            osw.write(10);
            osw.write('A');
            osw.write(10);

            char[] arr = "hello world champ".toCharArray();
            osw.write(arr);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
