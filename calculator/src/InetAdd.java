import java.net.*;

public class InetAdd{
    public static void main(String[] args)throws UnknownHostException{
//        InetAddress ip=InetAddress.getLocalHost();
//        System.out.println("LocalHost:"+ip);
        InetAddress ip=InetAddress.getByName("192.168.1.10");
        System.out.println("Hostname:"+ip.getHostName());
    }
}