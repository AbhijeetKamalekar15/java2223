package mypkg;
import mypkg.DataIO;
import mypkg.Compute;
import mypkg.Util;
import java.util.*;
public class MyArray implements DataIO,Compute
{
    int []x;
    public MyArray()
    {
        x=new int[5];
    }
    public int total()
    {
        int tot=x[0],i=1;
        while(i<5)
            tot+=x[i++];
        return tot;
    }
    public int avg()
    {
        return total()/5;
    }
    public void setData()
    {
        int i=0;
        while(i<5)
        {
            x[i]=Util.iInput("Data");
            i++;
        }
    }
    public String toString()
    {
        String s="Data\n"+Arrays.toString(x)+"\nTotal:"+total()+"\nAvg:"+avg();
        return s;
    }
    public void display()
    {
        Util.display(toString());
    }
}