import java.rmi.*;
import java.rmi.server.*;
public class RMIClient2 
{
    public static void main(String[] args) throws Exception
    {
        String url="rmi://localhost/w1";
        inter2 ref=(inter2)Naming.lookup(url);
        System.out.println("no:"+ref.digitsum(123));
        if(ref.prime(29)==1)
            System.out.println("Prime");
        else
            System.out.println("Not prime");
    }
}