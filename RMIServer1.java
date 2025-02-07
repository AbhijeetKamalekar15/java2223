import java.rmi.*;
import java.rmi.server.*;
interface inter1 extends Remote
{
    public int getNumber(int no) throws Exception;
}
class interImpl1 extends UnicastRemoteObject implements inter1
{
    interImpl1() throws RemoteException
    {
        super();
    }
    public int getNumber(int no) throws Exception
    {
        return (int)(Math.random()*no);
    }
}
class RMIServer1
{
    public static void main(String[] args) throws Exception
    {
        interImpl1 obj=new interImpl1();
        Naming.rebind("w1",obj);
        System.out.println("server started...");
    }
}