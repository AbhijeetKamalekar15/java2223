package Bank;
import Bank.NewAccount;
import mypkg.Util;
import java.io.*;
import java.util.*;

public class Saving extends NewAccount
{
    LinkedList<Integer>ls;
    public Saving()
    {
        super();
        ls=new LinkedList<Integer>();
    }
    public void depo(int amt)
    {
        ls.add(amt);
    }
    public void with(int amt)
    {
        ls.add(-amt);
    }
    int calcbal()
    {
        int amt=getBalance();
        int i=0,n=ls.size();
        while(i<n)
        {
            amt+=(ls.get(i)).intValue();
            i++;
        }
        return amt;
    }
    public String toString()
    {
        String str=super.toString()+"\nTransactions\n"+ls+"\nClosing bal:"+calcbal();
        return str;
    }
    public void display()
    {
        Util.display(toString());
    }
}