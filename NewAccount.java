//sub class in same package
package Bank;
import Bank.Account;
import mypkg.Util;
import java.io.*;

public class NewAccount extends Account implements Serializable 
{
    int bal;
    boolean state;
    public NewAccount()
    {
        super();
        bal=0;
        state=true;
    }
    public boolean getState(){return state;}
    public void delete()
    {
        state=false;
    }
    public void setData()
    {
        super.setData();
        bal=Util.iInput("Enetr opening balance:");
        state=true;
    }
    public int getBalance()
    {
        return bal;
    }
    public void setData(int n)
    {
        super.setData(n);
        bal=Util.iInput("Enter opening balance:");
        state=true;
    }
    public void display()
    {
        Util.display(toString());
    }
    public String toString()
    {
        String s=super.toString()+"\nBalance:"+bal+"\nState"+state;
        return s;
    }
}

