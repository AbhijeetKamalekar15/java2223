package mypkg;
import mypkg.Util;
import java.io.*;
public class Student implements Serializable
{
    int rno;
    String nm;
    public Student()
    {
        rno=0;
        nm=new String();
    }
    public String toString()
    {
        String s="Roll no:"+rno+"\nName:"+nm;
        return s;
    }
    public void display()
    {
        Util.display(toString());
    }
    public int getNo(){return rno;}
    public String getName(){return nm;}
    public void setData(int n)
    {
        rno=n;
        nm=Util.sInput("Name:");
    }
    public void setData()
    {
        rno=Util.iInput("Roll No:");
        nm=Util.sInput("Name:");
    }
}
