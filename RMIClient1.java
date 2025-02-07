import java.rmi.*;
import java.rmi.server.*;
public class RMIClient1 
{
    public static void main(String[] args) throws Exception
    {
        String url="rmi://localhost/w1";
        inter1 ref=(inter1)Naming.lookup(url);
        System.out.println("no:"+ref.getNumber(100));
    }
}


// Steps for execution of RMI Programs:
// 1.Compile the server program by typing command javac RMIServer1.java
// 2.javac RMIClient1.java
// 3.rmic interImpl1
// 4.start rmiregistry- This creates blank window minimise this.
// 5.From one window type following command
// java RMIServer1
// 6.And from another type command
// java RMIClient1