package Multi_Threaded_Server;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import FileHandling.fileReader;

public class Server extends Thread {
    
    public void run() {
        
    }

    public static void main(String[] args) throws IOException {
        int port = 3010;
       try{
        ServerSocket socket = new ServerSocket(port);
        socket.setSoTimeout(10000);
        while (true) {
            Socket acceptConnection = socket.accept();
            System.out.println("connection listening at port: "+port);
            System.out.println("connection establish : "+acceptConnection.getLocalAddress());
            new Thread(()->{
                try (PrintWriter toCLient = new PrintWriter(acceptConnection.getOutputStream())) {
                    BufferedReader filReader = new BufferedReader(new FileReader("notes.txt"));
                    String data = filReader.readLine();
                    
                    while (data != null) {
                        toCLient.println(data);
            
                        data = filReader.readLine();
                    }
                    // filReader.close();
                    // acceptConnection.close();
                }catch(Exception e){
                    System.out.println(e.getMessage());
                }
            }).start();
        }
    } catch (Exception e) {
        System.out.println(e.getMessage());
       }

        
        
    }
}
