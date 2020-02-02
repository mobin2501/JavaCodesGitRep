package computerNetworks;

import java.net.*;
import java.util.Scanner;
import java.io.*;

public class Client {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		String server=s.nextLine();
		int port=s.nextInt();
		
		try {
			System.out.println("Connecting to"+server+" on portnumber 	"+port);
			Socket client=new Socket(server,port);
			
			System.out.println("Just Connected to "+client.getRemoteSocketAddress());
			OutputStream output=client.getOutputStream();
			DataOutputStream out=new DataOutputStream(output);
			
			out.writeUTF("Hello from Server "+client.getLocalSocketAddress());
			InputStream input=client.getInputStream();
			DataInputStream in=new DataInputStream(input);
			
			System.out.println(in.readUTF());
			client.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		s.close();
		
	}

}