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
abstract class YArray
{
    int []arr;
    YArray()
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
class YStack extends YArray
{
    int top;
    YStack()
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
    abstract void menu()
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
class YQueue extends YArray
{
    int fr,rr;
    
    YQueue()
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
    abstract void menu()
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
class HierarchicalInheritance1
{
    public static void main(String []args)
    {
        int opt=XScanner.iInput("Menu\n1.Stack\n2.Queue\nChoice:");
        YArray obj=null;
        if(opt<1||opt>2)
            return;
        if(opt==1)
        {
            obj=new YStack();
        }
        else
        {
            obj=new YQueue();
        }
        obj.menu();
    }
}
/*
    Final variables and methods:
All methods and variables can be overreaden by default in subclasses. If we wish to prevent the subclasses from overriding 
the members of the super class , we can declare them as final, using the keyword final as modifier 
e.g.final int size=10;
    final void display()
    {

    }
Making a method final ensures that the functinality defined in this methid will never be altered in any case. Similarly
the value of a final variable can never be changed. Final variables behave like class variables and they do not take any 
space on individual objects of the class. 

Final Classes:
    Sometimes we may like to prevent a class being further subclassed for security reasons. A class that cannot be subclassed
is called final class. This is achieved in java using final class 
final class ABC
{

} 
final class PQR extends ABC
{

}
Any attempt to inherite these classes will cause an error and the compiler will not allow it. Declaring a class final
prevents any unwanted extentions to the class it also aloows the compiler to perform some optimization when the method of
the final class is invoked. 

Finalizer Methods:
    A constructor method is used to initialize an object when it is declared. this process is known as initialization.
Similarly java supports a concept called finalization which is just opposite to initialization we know that the java run 
time is an automatic garbage collected system. It automatcally freeze up the memory resources used by the objects But the 
objects may hold other non object resources such as file discrepters or window system fonts. The garbage collecter cannot 
free these resources. In order to free these resources we must use a finalizer method. This is similar to distructor in C++.
The finalizer() Method. and can be added to any class. Java calls that method whenever it is about to reclame the space 
for that object. The finalize method suld explicitily define the task should be performed.
    Abstract Classes and Methods
 */