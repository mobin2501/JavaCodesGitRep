package computerNetworks;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Server extends Thread {
	   private ServerSocket serverSocket;
	   public static void main(String [] args) {
		   Scanner s=new Scanner(System.in);
		   int port =s.nextInt();
		   try {
			   Thread t = new Server(port);
		         t.start();
		   }catch (IOException e) {
		         e.printStackTrace();
		   }
		   s.close();
	   }
	   public Server(int port) throws IOException {
	      serverSocket = new ServerSocket(port);
	      serverSocket.setSoTimeout(10000);
	   }

	   public void run() {
	      while(true) {
	         try {
	            System.out.println("Waiting for client on port " + 
	               serverSocket.getLocalPort() + "...");
	            Socket server = serverSocket.accept();
	            
	            System.out.println("Just connected to " + server.getRemoteSocketAddress());
	            DataInputStream in = new DataInputStream(server.getInputStream());
	            
	            System.out.println(in.readUTF());
	            DataOutputStream out = new DataOutputStream(server.getOutputStream());
	            out.writeUTF("Thank you for connecting to " + server.getLocalSocketAddress()
	               + "\nGoodbye!");
	            server.close();
	            
	         } catch (SocketTimeoutException s) {
	            System.out.println("Socket timed out!");
	            break;
	         } catch (IOException e) {
	            e.printStackTrace();
	            break;
	         }
	      }
	   }
	   
	   
	}
