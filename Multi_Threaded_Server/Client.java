package Multi_Threaded_Server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class Client {
    static int count=0;
    public static void main(String[] args) {
        int port = 3010;
        
        for (int i = 0; i < 1000; i++) {
            new Thread(() -> {
                try{
                    InetAddress address = InetAddress.getByName("localhost");
                    Socket socket = new Socket(address, port);
                    try {
                        PrintWriter toServer = new PrintWriter(socket.getOutputStream());
                        BufferedReader fromServer = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                        String line = fromServer.readLine();
                        while (line != null) {
                            
                            System.out.println("Response from the Server is: " + line +" "+ count++);
                            line = fromServer.readLine();
                        }
                        socket.close();
                        toServer.close();
                        // fromServer.close();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }).start();
        }
    }
}
