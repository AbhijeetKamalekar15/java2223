import java.util.*;
interface MyStack
{
    void push(int no);
    void pop();
    boolean isFull();
    boolean isEmpty();
    void menu();
    void display();
    int size=5;
}
class MyStackImpl implements MyStack
{
    int top;
    int []arr;
    static Scanner s;
    MyStackImpl()
    {
        arr=new int[size];
        top=-1;
    }
    public boolean isFull()
{
    return (top==size-1);    
}
public boolean isEmpty()
{
    return (top==-1);
}
public void push(int no)
{
    top++;
    arr[top]=no;
}
public void pop()
{
    top--;
}
public String toString()
{
    String s="Stack";
    if(top==-1)
        s=s+"Empty";
    else
    {
        for(int i=top;i>=0;i--)
            s=s+""+arr[i];
    }
    return s;
}
    public void display()
    {
        System.out.println(toString());
    }
    public void menu()
    {
        int opt=0,no=0;
        while(true)
        {
            System.out.println("Menu\n1.push\n2.pop\n3.display\n4.Exit\nChoice:");
            opt=s.nextInt();
            if(opt>3)
                break;
            switch(opt)
            {
                case 1:
                    if(isFull())
                        System.out.println("Overflow");
                    else
                    {
                        System.out.println("Data:");
                        no=s.nextInt();
                        push(no);
                    }
                    break;
                case 2:
                    if(isEmpty())
                        System.out.println("Underflow");
                    else
                        pop();
                    break;
                case 3:
                    display();
            }
        }
    }
    public static void main(String [] args)
    {
        MyStackImpl a=new MyStackImpl();
        a.menu();
    }
}

