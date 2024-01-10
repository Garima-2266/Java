import java.net.*;
import java.io.*;

public class MyClient{
    public static void main(String[]args){
        try{
            Socket s=new Socket("localHost",1111);
            
            DataOutputStream dout=
                    new DataOutputStream (s.getOutputStream());
            dout.writeUTF("Hello Server");
            
        }
        catch(Exception e){
            System.out.println(e);
        }
        }
    }