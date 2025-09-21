package FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class readingAFileandWriteAFile {
    public static void main(String[] args) {
        try (BufferedReader bf = new BufferedReader(new FileReader("notes.txt"))) {
            BufferedWriter bw = new BufferedWriter(new FileWriter("varun.txt",true));
            String data=bf.readLine();
            while (data!=null) {
                System.out.println(data);
                bw.write(data);
                bw.newLine();
                data = bf.readLine();

            }
            bw.close();
        } catch (Exception e) {
            System.out.println("File not found");
        }
    }
}
