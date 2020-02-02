package comuterNetwork3;

import java.io.*;
import java.net.*;

public class Server {
	public static void main(String[] args) throws IOException {
		ServerSocket ss=new ServerSocket(1000);
		Socket s=ss.accept();
		
		System.out.println("Client connected !!");
	}


}
