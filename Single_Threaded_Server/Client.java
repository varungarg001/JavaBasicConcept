package Single_Threaded_Server;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    public void run() throws UnknownHostException, IOException {
        int port = 3000;
        InetAddress address = InetAddress.getByName("localhost");
        Socket socket = new Socket(address, port);

        PrintWriter toServer = new PrintWriter(socket.getOutputStream());

        BufferedReader fromServer = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        toServer.println("hello from the client");
        String line = fromServer.readLine();
        System.out.println("Response from the Server is: " + line);
        
        
        toServer.close();
        fromServer.close();
        socket.close();
    }
    public static void main(String[] args) {
        try{
            for (int i = 0; i < 10000; i++) {
                Client client = new Client();
                client.run();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
