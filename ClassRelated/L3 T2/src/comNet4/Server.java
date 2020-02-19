package comNet4;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Server {

    public static void main(String[] args)throws IOException{
        try(var listener=new ServerSocket(59090)){
            System.out.println("Date is running");
            while(true){
                try(var socket=listener.accept()){
                    var out=new PrintWriter(socket.getOutputStream(),true);
                    System.out.print(new Date().toString());
                }

            }

        }
    }
}
