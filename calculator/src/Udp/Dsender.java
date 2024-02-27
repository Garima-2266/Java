import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
class Dsender  {
    public static void main(String[] args)throws Exception {
    DatagramSocket ds= new DatagramSocket();
    String str= "Message sent by server";
    InetAddress ip = InetAddress.getLocalHost();
    DatagramPacket dp = new DatagramPacket(str.getBytes(), str.length(),ip, 6666);
    ds.send(dp);
    System.out.println("Message sent!");
    ds.close();
    }
}
