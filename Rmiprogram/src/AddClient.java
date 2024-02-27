import java.rmi.*;
import java.net.*;
import java.util.*;
public class AddClient {
    public static void main(String args[]) {
        Scanner sc;
        try {
            String host = "localhost";
            sc = new Scanner(System.in);
            System.out.println("Enter the 1st parameter");
            int a = sc.nextInt();
            System.out.println("Enter the 2nd parameter");
            int b = sc.nextInt();
            AddRem remobj = (AddRem) Naming.lookup("rmi://" + host + "/AddRem");
            System.out.println(remobj.addNum(a, b));
        } catch (RemoteException re) {
            re.printStackTrace();
        } catch (NotBoundException nbe) {
            nbe.printStackTrace();
        } catch (MalformedURLException mfe) {
            mfe.printStackTrace();
        }
    }
}

