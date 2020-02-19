package comuterNetwork3;

import java.io.*;
import java.net.*;
class ObjClient 
 {
  public static void main(String arg[]) throws Exception
   {
     Socket s=new Socket("127.0.0.1",1700);
     ObjectInputStream is=new ObjectInputStream(s.getInputStream());
     Message stu=(Message)is.readObject();
     stu.ShowDet();
     s.close();
   }
 }
 