import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
public class Dreceiver {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds= new DatagramSocket(6666);
        byte[] buf= new byte[1024];
        DatagramPacket dp=new DatagramPacket(buf, 1024);
        ds.receive(dp);
        String str= new String(dp.getData(),0,dp.getLength());
        System.out.println(str);
        System.out.println("Message received!");
        ds.close();
    }
}
