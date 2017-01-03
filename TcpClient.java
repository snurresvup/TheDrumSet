/**
 * Write a description of class TCPConnection here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.io.*;
import java.net.*;

public class TcpClient  
{
    private Socket socket;
    private PrintWriter writer;
    private boolean connected;
    private static TcpClient instance;
    //public static final String 
    
    private TcpClient()
    {
        socket = null;
        writer = null;
        connected = false;
        
        connect("localhost", 7778);
    }
    
    public static TcpClient getInstance() {
        if (instance == null) {
            instance = new TcpClient();
        }
               
        return instance;
    }

    public void connect(String host, int port)
    {
        if (connected) {
            return;
        }
        
        try {
            socket = new Socket(host, port);
            writer = new PrintWriter(socket.getOutputStream(), true);
            connected = true;
        } catch (UnknownHostException e) {
            System.err.println("Don't know about host: localhost.");
        } catch (IOException e) {
            System.err.println("Couldn't get I/O for the connection to: localhost.");
        }
    }

    public void disconnect()
    {
        if (connected)
        {
            try {
	            writer.close();
	            socket.close();
                connected = false;
                instance = null;
            } catch (IOException e) {
                System.err.println("Couldn't get I/O for the connection to: localhost.");
            }            
        }
    }

    /**
     * Send command to a Pure Data audio engine. 
     */
    public void send(String command)
    {
        if (connected) { 
            writer.println(command + ";");
        }
    }

}
