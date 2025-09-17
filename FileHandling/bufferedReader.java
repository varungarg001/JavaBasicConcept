package FileHandling;

import java.io.*;

public class bufferedReader {

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("notes.txt"))) {
            
            // byte to char stream and then reading char stream.

            String data = br.readLine();

            while (data!=null) {
                System.out.print(data);
                data = br.readLine();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}