package comuterNetwork3;
import java.net.*;
import java.io.*;
class ObjServer10 {
  public static void main(String arg[]) throws Exception
   {
  
   // Server will be started on 1700 port number
    ServerSocket server=new ServerSocket(1700);
	
   // Server listening for connection
    Socket s=server.accept();
	
   // Stream object for sending object 
    ObjectOutputStream os=new ObjectOutputStream(s.getOutputStream());
	
   Message object1=new Message(100,"data",10001,true);
   Message object2=new Message(101,"data",10002,true);
   
   os.writeObject(object1);
   
   s.close();
   }
 }