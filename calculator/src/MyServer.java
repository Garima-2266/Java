import java.net.*;
import java.io.*;

public class MyServer{
    public static void main(String[]args){
        try{
            ServerSocket ss=new ServerSocket(1111);
            Socket s=ss.accept();
            DataInputStream dis=
                    new DataInputStream (s.getInputStream());
            String str=(String)dis.readUTF();
            System.out.println(":message="+str);
            ss.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
        }
    }