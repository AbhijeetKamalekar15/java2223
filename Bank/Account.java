package Bank;
import java.io.*;
import mypkg.Util;
import mypkg.DataIO;
public class Account implements Serializable 
{
    int no;
    String nm;
    public Account()
    {
        no=0;
        nm="";
    }
    public void setData()
    {
        no=Util.iInput("Roll No:");
        nm=Util.sInput("Name:");
    }
    public int getNo(){return no;};
    public String getName(){return nm;}
    public String toString()
    {
        String a="Roll No:"+no+"\nName:"+nm;
        return a;
    }
    public void display()
    {
        Util.display(toString());
    }
    public void setData(int n)
    {
        no=n;
        nm=Util.sInput("Name:");
    }
}