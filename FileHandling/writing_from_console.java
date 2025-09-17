package FileHandling;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class writing_from_console {
    public static void main(String[] args) {
        try {
            // we can done that through printwritter or buffered writter
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new FileWriter("new.txt",true));

            System.out.println("Enter the data you want to write in file and Type EXIT for Exit");

            String data = br.readLine();

            while (true) {
                if ("Exit".equalsIgnoreCase(data)) {
                    break;
                }
                bw.write(data);
                // br.flush();
                bw.newLine();
                data = br.readLine();

            }
            bw.close();

            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
