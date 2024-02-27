import java.rmi.*;
import java.net.*;
public class AddServer
{
public static void main(String args[])
{
try{
AddRemImp1 locobj= new AddRemImp1();
Naming.rebind("rmi:///AddRem",locobj);
}
catch(RemoteException re){
re.printStackTrace();
}
catch(MalformedURLException mfe){
mfe.printStackTrace();
}
}
}

