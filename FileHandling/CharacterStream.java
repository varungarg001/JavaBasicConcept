package FileHandling;

import java.io.*;

public class CharacterStream {
    public static void main(String[] args) throws IOException {
        // takes data in character stream and put it out in character stream.
        try (InputStreamReader isr = new InputStreamReader(System.in)) {
            System.out.println("Enter some letters: ");
            int letters = isr.read();

            while (isr.ready()) {
                System.out.println((char) letters);
                letters = isr.read();

            }
            isr.close();
            System.out.println();
           
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}