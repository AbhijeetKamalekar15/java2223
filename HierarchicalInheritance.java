//Implementation of herarchical inheritance
import java.util.*;
class XScanner
{
    static Scanner s;
    static
    {
        s=new Scanner(System.in);
    }
    static int iInput(String msg)
    {
        System.out.println(msg);
        int no=s.nextInt();
        return no;
    } 
    static void display(String str)
    {
        System.out.println(str);
    }
}
class XArray
{
    int []arr;
    XArray()
    {
        arr=new int[5];
    }
    void set(int pos,int d)
    {
        arr[pos]=d;
    }
    int get(int pos)
    {
        return arr[pos];
    }
    public String toString()
    {
        String s="Data\n";
        return s;
    }
    void display()
    {
        XScanner.display(toString());  //diff method to print
    }
}
class XStack extends XArray
{
    int top;
    XStack()
    {
        super();
        top=-1;
    }
    boolean isFull()
    {
        return top==arr.length-1;
    }
    boolean isEmpty()
    {
        return top==-1;
    }
    void push()
    {
        if(isFull())
        {
            System.out.println("Overflow");
            return;
        }
        int d=XScanner.iInput("Data");
        set(++top,d);
    }
    void pop()
    {
        if(isEmpty())
        {    
            System.out.println("Underflow");
            return;
        }
        top--;
    }
    public String toString()
    {
        String str="";
        if(isEmpty())
            str="Empty Stack";
        else
        {
            str=super.toString();
            for(int i=top;i>=0;i--)
                str=str+" "+get(i);
        }
        return str;
    }
    void display()
    {
        System.out.println(toString());
    }
    void menu()
    {
        int opt;
        while(true)
        {
            System.out.println("Menu\n1.Push\n2.pop\n3.display\n4.Exit\nOption:");
            opt=XScanner.iInput("Choice");
            if(opt>3)
                break;
            switch(opt)
            {
                case 1:
                    push();break;
                case 2:
                    pop();break;
                case 3:
                    display();break;
            }
        }
    }
}
class XQueue extends XArray
{
    int fr,rr;
    
    XQueue()
    {
        super();
        rr=-1;fr=0;
    }
    boolean isFull()
    {
        return (rr==arr.length-1);
    }
    boolean isEmpty()
    {
        return (rr<fr);
    }
    public String toString()
    {
        String str="";
        if(isEmpty())
            str="Empty Queue";
        else
        {
            str=super.toString()+"\n";
            for(int i=fr;i<rr;i++)
                str=str+""+get(i);
        }
        return str;
    }
    void display()
    {
        System.out.println(toString());
    }
    void insert()
    {
        if(isFull())
        {    
            System.out.println("Overflow");
            return;
        }
        int d=XScanner.iInput("Enter No:");
        set(++rr,d);
    }
    void remove()
    {
        if(isEmpty())
        {
            System.out.println("Underflow");
            return;
        }
        fr++;
    }
    void menu()
    {
        int opt=0;
        while(true)
        {
            System.out.println("\nQueue Menu\n1.insert\n2.remove\n3.display\n4.Exit\nOption:");
            opt=XScanner.iInput("Choice");
            if(opt>3)
                break;
            switch(opt)
            {
                case 1:
                    insert();break;
                case 2:
                    remove();break;
                case 3:
                    display();break;
            }

        }
    }
}
class HierarchicalInheritance
{
    public static void main(String []args)
    {
        int opt=XScanner.iInput("Menu\n1.Stack\n2.Queue\nChoice:");
        if(opt==1)
        {
            XStack a=new XStack();
            a.menu();
        }
        else
        {
            if(opt==2)
            {
                XQueue a=new XQueue();
                a.menu();
            }
        }
    }
}