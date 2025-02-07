import java.util.*;
interface DataIO
{
    void setData();
    void display();
}
interface Comp
{
    boolean isEqual(int no);
}
class XData implements DataIO,Comp
{
    int no;
    String nm;
    static Scanner s;
    static
    {
        s=new Scanner(System.in);
    }
    public boolean isEqual(int n)
    {
        return (no==n);
    }
    public void setData()
    {
        System.out.println("Roll No:");
        no=s.nextInt();
        System.out.println("Name:");
        nm=s.next();
    }
    public String toString()
    {
        String str="Data\nRoll no:"+no+"\nName:"+nm;
        return str;
    }
    public void display()
    {
        System.out.println(toString());
    }
    public static void main(String [] args)
    {
        XData a=new XData();
        a.setData();
        a.display();
        if(a.isEqual(13))
            System.out.println("Found");
        else
            System.out.println("Not Found");
    }
}