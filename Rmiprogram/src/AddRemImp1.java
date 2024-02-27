import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
public class AddRemImp1 extends UnicastRemoteObject implements AddRem
{
public AddRemImp1() throws RemoteException{
    
}
public int addNum(int a, int b){
return (a+b);
}
}
