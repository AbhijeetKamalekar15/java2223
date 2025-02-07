import java.rmi.*;
import java.rmi.server.*;
interface inter2 extends Remote
{
    public int prime(int no) throws Exception;
    public int digitsum(int no) throws Exception;
}
class interImpl2 extends UnicastRemoteObject implements inter2
{
    interImpl2() throws RemoteException
    {
        super();
    }
    public int prime(int no) throws Exception
    {
        int i=2;
        while(i<0)
        {
            if(no%i==0)
                break;
            i++;
        }
        if(i==no)
            return 1;
        else
            return 0;
    }
    public int digitsum(int no) throws Exception
    {
        int total=0;
        while(no>0)
        {
            total+=no%10;
            no/=10;
        }
        return total;
    }
}
class RMIServer2
{
    public static void main(String[] args) throws Exception
    {
        interImpl2 obj=new interImpl2();
        Naming.rebind("w2",obj);
        System.out.println("server started...");
    }
}