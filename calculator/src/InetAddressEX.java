import java.net.*;

public class InetAddressEX{
    public static void main(String[] args)throws UnknownHostException{
        InetAddress ip=InetAddress.getLocalHost();
        System.out.println("LocalHost:"+ip);
//        inetAddress ip=InetAddress.getByName("host");
//        System.out.println("Hostname:"+ip.getHostName());
    }
}