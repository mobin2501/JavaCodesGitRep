package comuterNetwork3;
import java.net.*;
import java.io.*;
class ObjServer2 {
  public static void main(String arg[]) throws Exception
   {
  
    ServerSocket server=new ServerSocket(1700);
	
    Socket s=server.accept();
	 
    ObjectOutputStream os=new ObjectOutputStream(s.getOutputStream());
	
   Message object1=new Message(100,"data",10001,true);
   os.writeObject(object1);
   
   s.close();
   }
 }