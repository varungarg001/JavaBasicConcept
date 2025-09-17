package FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class file_class {
    public static void main(String[] args) {
        // creating the new file.
        try{
            File f = new File("new.txt");
            f.createNewFile();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // write into the file
        
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("new.txt"))) {
            bw.write("hello, this is new file of tct format ");
            bw.write("hello, this is new line of new file of tct format ");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // read the file
        try (BufferedReader bf = new BufferedReader(new FileReader("new.txt"))) {
            String data = bf.readLine();
            while (data != null) {
                System.out.println(data);
                data = bf.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

         // creating the new file.
         try{
            File f = new File("random.txt");
            f.createNewFile();

            if (f.delete()) {
                System.out.println("file deleted: "+f.getName());
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    
    }
}
