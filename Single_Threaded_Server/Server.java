package Single_Threaded_Server;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public void run() throws IOException {
        int port = 3000;

        ServerSocket socket = new ServerSocket(port);
        while (true) {
            socket.setSoTimeout(10000);
            System.out.println("Server is listening on port " + port);
            Socket acceptedConnection = socket.accept();
            System.out.println("Connection accepted from client " + acceptedConnection.getLocalAddress());
            PrintWriter toClient = new PrintWriter(acceptedConnection.getOutputStream());

            BufferedReader fromClient = new BufferedReader(new FileReader("notes.txt"));



            String data = fromClient.readLine();

            while (data != null) {
                toClient.println(data);
                data = fromClient.readLine();
            }
            toClient.println("Hello from the server ");
            // System.out.println("Response from the Client: "+line);

            toClient.close();
            fromClient.close();
            acceptedConnection.close();
            // socket.close();

        }
    }
    public static void main(String[] args) {
        try{
            Server server = new Server();
            server.run();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
