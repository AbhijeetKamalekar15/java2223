package mypkg;
import mypkg.MyArray;
public class NewMyArray extends MyArray
{
    public NewMyArray()
    {
        super();
    }
    public int get(int pos)
    {
        return x[pos];
    }
    public void set(int d,int pos)
    {
        x[pos]=d;
    }
}
